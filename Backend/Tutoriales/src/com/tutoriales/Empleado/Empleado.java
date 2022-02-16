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
	
	public Empleado(String nombre, double sueldoEmple, int a�o, int mes, int dia) {
		
		nombreEmple = nombre;
		this.sueldoEmple = sueldoEmple;
		
		GregorianCalendar calendario = new GregorianCalendar(a�o, mes-1, dia);
			altaEmple = calendario.getTime();
		
	}
	
	public Empleado(String nombreEmple) {//SOBRECARGA DE CONSTRUCTORES: Varios constructores en una clase, con diferentes parametros
		this(nombreEmple, 30000, 2002,01,25);//Este this llama al otro constructor. Si hubieran m�s constructores
											 //llamar� al que coincida con los par�metros del this
	}										 //Parecido a establecer unos valores por defecto
	
	
	
	
	public String getNombreEmple() {//SOBRECARGA DE M�TODOS: Misma filosof�a que los constructores pero con m�todos
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
