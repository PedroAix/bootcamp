package com.example.application.resources;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

import com.example.application.dtos.PaymentEditDTO;
import com.example.application.dtos.RentalEditDTO;
import com.example.domains.contracts.services.RentalService;
import com.example.domains.entities.Customer;
import com.example.domains.entities.Inventory;
import com.example.domains.entities.Rental;
import com.example.domains.entities.Staff;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;

@SpringBootTest
//@AutoConfigureMockMvc
class RentalResourceTest {
	List<RentalEditDTO> listado;

	@BeforeEach
	void setUp() throws Exception {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String fecha1 = "2022-03-04 13:38:50";
        String fecha2 = "2022-03-05 13:38:50";
        Date result1 = df.parse(fecha1);
        Date result2 = df.parse(fecha2);
        listado = new ArrayList<RentalEditDTO>();
        listado.add(new RentalEditDTO(1, result1, result2, 1, 1, 1,
                List.of(new PaymentEditDTO(1, 1, new java.math.BigDecimal("0.99"), result1))));
        listado.add(new RentalEditDTO(2, result1, result2, 1, 1, 1,
                List.of(new PaymentEditDTO(1, 1, new java.math.BigDecimal("0.99"), result1))));
	}

	public static class IoCTestConfig {
		@Bean
		RentalService getServicio() {
			return mock(RentalService.class);
		}
		@Bean
		RentalResource getRest() {
			return new RentalResource();
		}
	}

	@Nested
	//@ContextConfiguration(classes = IoCTestConfig.class)
	@MockBean(RentalService.class)
	class PruebasUnitarias {
		@Autowired
		RentalService srv;
		
		@Autowired
		RentalResource rest;
		
		@Test
		void testMock() {
			assertNotNull(srv);
			assertNotNull(rest);
		}
		@Test
		void testGetAll() {
			when(srv.getByProjection(RentalEditDTO.class)).thenReturn(listado);

			var rslt = rest.getAll();

			assertNotNull(rslt);
			assertEquals(0, rslt.size());
		}

		@Test
		void testGetOne() throws NotFoundException {
			when(srv.getOne(1)).thenReturn(RentalEditDTO.from(listado.get(0)));

			var rslt = rest.getOneEdit(1, "edit");
			assertNotNull(rslt);
			assertEquals(1, rslt.getRentalId());
		}

		@Test
		void testGetOneNotFound() throws NotFoundException {
			when(srv.getOne(1)).thenThrow(NotFoundException.class);
			
			assertThrows(NotFoundException.class, () -> rest.getOneEdit(1, "edit"));
		}
		
		@Disabled
		@Test
		void testCreate() throws NotFoundException, DuplicateKeyException, InvalidDataException {
			when(srv.add(any())).thenReturn(RentalEditDTO.from(listado.get(0)));

			var rslt = rest.create(listado.get(0));
			assertNotNull(rslt);
			assertEquals(HttpStatus.CREATED, rslt.getStatusCode());
		}
		@Test
		void testCreateDuplicateKey() throws NotFoundException, DuplicateKeyException, InvalidDataException {
			when(srv.add(any())).thenThrow(DuplicateKeyException.class);
			
			assertThrows(DuplicateKeyException.class, () -> rest.create(listado.get(0)));
		}
		@Test
		void testCreateInvalidData() throws NotFoundException, DuplicateKeyException, InvalidDataException {
			when(srv.add(any())).thenThrow(InvalidDataException.class);
			
			assertThrows(InvalidDataException.class, () -> rest.create(listado.get(0)));
		}

		@Disabled
		@Test
		void testUpdate() throws NotFoundException, InvalidDataException {
			when(srv.change(any())).thenReturn(RentalEditDTO.from(listado.get(0)));

			rest.update(1, listado.get(0));
			verify(srv).change(RentalEditDTO.from(listado.get(0)));
		}

		@Test
		void testUpdateInvalidId() throws NotFoundException, InvalidDataException {
			assertThrows(InvalidDataException.class, () -> rest.update(0, listado.get(0)));
		}
		@Test
		void testUpdateNotFound() throws NotFoundException, InvalidDataException {
			when(srv.change(any())).thenThrow(NotFoundException.class);

			assertThrows(NullPointerException.class, () -> rest.update(1, listado.get(0)));
		}
		@Test
		void testUpdateInvalidData() throws NotFoundException, InvalidDataException {
			assertThrows(InvalidDataException.class, () -> rest.update(50, new RentalEditDTO(1, new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2022-03-04 13:38:50"), 
					new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2022-03-05 13:38:50"), 1, 1, 1,
	                List.of(new PaymentEditDTO(1, 1, new java.math.BigDecimal("0.99"), new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2022-03-04 13:38:50"))))));
		}

		@Test
		void testDelete() throws NotFoundException, InvalidDataException {
			doNothing().when(srv).deleteById(any());

			rest.delete(1);
			verify(srv).deleteById(1);
		}
	}
}
