package com.example.application.dtos;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.example.domains.entities.Customer;
import com.example.domains.entities.Inventory;
import com.example.domains.entities.Rental;
import com.example.domains.entities.Staff;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
@ApiModel(value = "Alquileres editables", description = "Version editable de los alquileres.")
public class RentalEditDTO {
	@JsonProperty("idAlquiler")
	@ApiModelProperty(value = "Identificador del alquiler.")
	private int rentalId;
	
	@JsonProperty("fechaAlquiler")
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@ApiModelProperty(value = "Fecha del alquiler.")
	private Date rentalDate;
	
	@JsonProperty("fechaDevolucion")
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@ApiModelProperty(value = "Fecha de la devolución.")
	private Date returnDate;
	
	@JsonProperty("idPelicula")
	@Positive
	@ApiModelProperty(value = "Identificador de la película.")
	private int inventory;
	
	@JsonProperty("idCliente")
	@Positive
	@ApiModelProperty(value = "Identificador del cliente.")
	private int customer;
	
	@JsonProperty("idEmpleado")
	@Positive
	@ApiModelProperty(value = "Identificador del empleado.")
	private int staff;
	
	@ApiModelProperty(value = "Lista de pagos.")
	private List<PaymentEditDTO> pagos;

	
	public static RentalEditDTO from(Rental source) {
		return new RentalEditDTO(
				source.getRentalId(), 
				source.getRentalDate(),
				source.getReturnDate(),
				source.getInventory().getInventoryId(),
				source.getCustomer().getCustomerId(),
				source.getStaff().getStaffId(),
				source.getPayments().stream().map(pago -> PaymentEditDTO.from(pago)).toList()
				);
	}
	
	public static Rental from(RentalEditDTO source) {
		return new Rental(
				source.getRentalId(),
				source.getRentalDate(),
				source.getReturnDate(),
				new Inventory(source.getInventory()),
				new Customer(source.getCustomer()),
				new Staff(source.getStaff())
				);
	}
	
	
	public Rental update(Rental target) {
		target.setRentalDate(rentalDate);
		target.setReturnDate(returnDate);
		
		if(target.getInventory().getInventoryId() != inventory)
			target.setInventory(new Inventory(inventory));
		
		if(target.getCustomer().getCustomerId() != customer)
			target.setCustomer(new Customer(customer));
		
		if(target.getStaff().getStaffId() != staff)
			target.setStaff(new Staff(staff));
		

		// Borra los alquileres que sobran
		var delAlquileres = target.getPayments().stream()
				.filter(item -> pagos.stream().noneMatch(pago -> pago.getPaymentId() == item.getPaymentId()))
				.toList();
		delAlquileres.forEach(item -> target.removePayment(item));
		
		
		// Actualizar los alquileres que quedan
		target.getPayments().forEach(entity -> {
			
			var dto = pagos.stream().filter(item -> item.getPaymentId() == entity.getPaymentId()).findFirst().get();
			
			if (entity.getPaymentDate() != dto.getPaymentDate()) entity.setPaymentDate(dto.getPaymentDate());
			if (entity.getAmount() != dto.getAmount()) entity.setAmount(dto.getAmount());
			if (entity.getStaff().getStaffId() == dto.getStaff()) entity.setStaff(new Staff(dto.getStaff()));
		});
		
		
		
		// Añade los alquileres que faltan
		pagos.stream()
			.filter(dto -> target.getPayments().stream().noneMatch(entity -> entity.getPaymentId() == dto.getPaymentId()))
			.forEach(dto -> target.addPayment(PaymentEditDTO.from(dto,target)));
		
		
	
		return target;
	}
	
	
}
