package com.example.application.dtos;

import java.util.Date;
import java.util.List;
import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
@ApiModel(value = "Alquileres detallados", description = "Version detallada de los alquileres.")

public class RentalDetailsDTO {
	@JsonProperty("id")
	@ApiModelProperty(value = "Identificador del alquiler.")
	private int rentalId;
	
	@JsonProperty("pelicula")
	@ApiModelProperty(value = "Título de la película.")
	private String filmTitle;
	
	@JsonProperty("fechaAlquiler")
	@ApiModelProperty(value = "Fecha del alquiler.")
	private Date rentalDate;
	
	@JsonProperty("idInventario")
	@ApiModelProperty(value = "Identificador del inventario.")
	private int inventoryId;
	
	@JsonProperty("cliente")
	@ApiModelProperty(value = "Nombre y apellidos del cliente.")
	private String customer;
	
	@JsonProperty("fechaDevolucion")
	@ApiModelProperty(value = "Fecha de la devolución.")
	private Date returnDate;
	
	@JsonProperty("empleado")
	@ApiModelProperty(value = "Nombre y apellidos del empleado.")
	private String staffId;
	
	@ApiModelProperty(value = "Lista de pagos.")
	private List<PaymentDetailsDTO> pagos;

	public static RentalDetailsDTO from(Rental source) {
		return new RentalDetailsDTO(
				source.getRentalId(), 
				source.getInventory().getFilm().getTitle(),
				source.getRentalDate(), 
				source.getInventory().getInventoryId(),
				source.getCustomer().getFirstName() + " " + source.getCustomer().getLastName(),
				source.getReturnDate(),
				source.getStaff().getFirstName() + " " + source.getStaff().getLastName(),
				source.getPayments().stream().map(item -> PaymentDetailsDTO.from(item)).toList()
				);
	}
}
