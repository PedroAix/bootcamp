package com.example.application.dtos;

import java.util.Date;
import java.util.List;

import com.example.domains.entities.Customer;
import com.example.domains.entities.Inventory;
import com.example.domains.entities.Rental;
import com.example.domains.entities.Staff;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class RentalEditDTO {
	@JsonProperty("id")
	private int rentalId;
	@JsonProperty("pelicula")
	private int inventory;
	@JsonProperty("fecha_alquiler")
	private Date rentalDate;
	@JsonProperty("cliente")
	private int customer;
	@JsonProperty("fecha_devolucion")
	private Date returnDate;
	@JsonProperty("empleado")
	private int staff;
	
	private List<Integer> payments;

	public static RentalEditDTO from(Rental source) {
		return new RentalEditDTO(
				source.getRentalId(), 
				source.getInventory().getInventoryId(),
				source.getRentalDate(),
				source.getCustomer().getCustomerId(),
				source.getReturnDate(),
				source.getStaff().getStaffId(),
				null
				);
	}
	
	public static Rental from(RentalEditDTO source) {
		return new Rental(
				source.getRentalId(),
				source.getRentalDate(),
				new Inventory(source.getInventory()),
				new Customer(source.getCustomer()),
				source.getReturnDate(),
				new Staff(source.getStaff())
				);
	}
}
