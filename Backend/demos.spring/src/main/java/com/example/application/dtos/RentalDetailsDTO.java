package com.example.application.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class RentalDetailsDTO {
	@JsonProperty("id")
	private int rentalId;
	
	@JsonProperty("pelicula")
	private String filmTitle;
	
	@JsonProperty("fecha_alquiler")
	private Date rentalDate;
	
	@JsonProperty("id_inventario")
	private int inventoryId;
	
	@JsonProperty("cliente")
	private String customer;
	
	@JsonProperty("fecha_devolucion")
	private Date returnDate;
	
	@JsonProperty("empleado")
	private String staffId;
	
	private List<Integer> payments;

	public static RentalDetailsDTO from(Rental source) {
		return new RentalDetailsDTO(
				source.getRentalId(), 
				source.getInventory().getFilm().getTitle(),
				source.getRentalDate(), 
				source.getInventory().getInventoryId(),
				source.getCustomer().getFirstName() + " " + source.getCustomer().getLastName(),
				source.getReturnDate(),
				source.getStaff().getFirstName() + " " + source.getStaff().getLastName(),
				null
				);
	}
}
