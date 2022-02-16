package com.tutoriales.Empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

	
	private String nombreEmple;
	private double sueldoEmple;
	private Date altaEmple;
	
	public Empleado() {
		//Constructor por defecto: no recibe parametros
		// ni da un estado inicial
	}
	
	public Empleado(String nombre, double sueldoEmple, int año, int mes, int dia) {
		
		nombreEmple = nombre;
		this.sueldoEmple = sueldoEmple;
		
		GregorianCalendar calendario = new GregorianCalendar(año, mes-1, dia);
			altaEmple = calendario.getTime();
		
	}
	
	public Empleado(String nombreEmple) {//SOBRECARGA DE CONSTRUCTORES: Varios constructores en una clase, con diferentes parametros
		this(nombreEmple, 30000, 2002,01,25);//Este this llama al otro constructor. Si hubieran más constructores
											 //llamará al que coincida con los parámetros del this
	}										 //Parecido a establecer unos valores por defecto
	
	
	
	
	public String getNombreEmple() {//SOBRECARGA DE MÉTODOS: Misma filosofía que los constructores pero con métodos
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
