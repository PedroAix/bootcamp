package com.tutoriales.Empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

	private String nombreEmple;
	private double sueldoEmple;
	private Date altaEmple;
	
	public Empleado(String nombre, double sueldoEmple, int año, int mes, int dia) {
		
		nombreEmple = nombre;
		this.sueldoEmple = sueldoEmple;
		
		GregorianCalendar calendario = new GregorianCalendar(año, mes-1, dia);
			altaEmple = calendario.getTime();
		
	}
	
	
	
	public String getNombreEmple() {
		return nombreEmple;
	}
	
	public double getSueldoEmple() {
		return sueldoEmple;
	}

	public Date getAltaEmple() {
		return altaEmple;
	}

	
	 
	public void setSubirSueldo(double porcentaje) {
		double aumento = sueldoEmple * porcentaje /100;
		sueldoEmple += aumento;
	}
}
