package com.example.application.dtos;

import java.math.BigDecimal;
import java.util.Date;
import com.example.domains.entities.Payment;
import com.example.domains.entities.Rental;
import com.example.domains.entities.Staff;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
@ApiModel(value = "Pagos editables", description = "Version editable de los pagos.")
public class PaymentEditDTO {
	@JsonProperty("idPago")
	@ApiModelProperty(value = "Identificador del pago.")
	private int paymentId;
	
	@JsonProperty("empleado")
	@ApiModelProperty(value = "Identificador del empleado.")
	private int staff;
	
	@JsonProperty("total")
	@ApiModelProperty(value = "Cantidad total.")
	private BigDecimal amount;
	
	@JsonProperty("fecha")
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@ApiModelProperty(value = "Fecha del pago.")
	private Date paymentDate;


	public static PaymentEditDTO from(Payment source) {
		return new PaymentEditDTO(
				source.getPaymentId(),
				source.getStaff().getStaffId(),
				source.getAmount(),
				source.getPaymentDate()
				);
	}
	
	public static Payment from(PaymentEditDTO source, Rental rental) {
		return new Payment(
				source.getPaymentId(),
				source.getAmount(),
				source.getPaymentDate(),
				rental,
				new Staff(source.getStaff())
				);
	}
	
}
