package com.example.application.dtos;

import java.math.BigDecimal;
import java.util.Date;
import com.example.domains.entities.Payment;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
@ApiModel(value = "Pagos detallados", description = "Version detallada de los pagos.")
public class PaymentDetailsDTO {
	@JsonProperty("idPago")
	@ApiModelProperty(value = "Identificador del pago.")
	private int paymentId;
	
	@JsonProperty("empleado")
	@ApiModelProperty(value = "Nombre y apellidos del empleado.")
	private String staff;
	
	@JsonProperty("total")
	@ApiModelProperty(value = "Cantidad total.")
	private BigDecimal amount;
	
	@JsonProperty("fecha")
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@ApiModelProperty(value = "Fecha del pago.")
	private Date fecha;


	public static PaymentDetailsDTO from(Payment source) {
		return new PaymentDetailsDTO(
				source.getPaymentId(),
				source.getStaff().getFirstName() + " " + source.getStaff().getLastName(),
				source.getAmount(),
				source.getPaymentDate()
				);
	}
}
