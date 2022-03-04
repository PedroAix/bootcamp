package com.example.application.dtos;

import java.util.Date;

import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
@ApiModel(value = "Alquileres cortos", description = "Version corta de los alquileres.")
public class RentalShortDTO {
	@JsonProperty("id")
	@ApiModelProperty(value = "Identificador del alquiler.")
	private int rentalId;
	@JsonProperty("fechaAlquiler")
	@ApiModelProperty(value = "Fecha del alquiler.")
	private Date rentalDate;

	public static RentalShortDTO from(Rental source) {
		return new RentalShortDTO(
				source.getRentalId(), 
				source.getRentalDate()
				);
	}
}
