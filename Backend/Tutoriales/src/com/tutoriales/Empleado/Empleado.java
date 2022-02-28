package com.tutoriales.Empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Comparable {
	//	INTERFACES:
	//Solo pueden tener métodos abstractos y constantes, pero no variables
	//Al igual que las clases, las interfaces se guardan en un fichero .class
	//No se pueden instanciar
	//Todos los métodos son publicos y abstractos (si no se ponen se dan por hecho que lo son por defecto)
	//Al haber métodos abstractos estamos obligados a sobreescibir dichos métodos (igual que una clase abstracta)
	
	//Determinan el comportamiento de aquellas clases que van a implementar esa interfaz
	//Suelen aparecer en cursiva en los diagramas
	//MUY PARECIDAS A LAS CLASES ABSTRACTAS
	//DIFERENCIA: No pueden haber métodos normales (todos son abstractos) 
	//DIFERENCIA: Permiten la herencia múltiple (heredar una o varias interfaces)
	
	
	

	private String nombreEmple;
	private double sueldoEmple;
	private Date altaEmple;

	public Empleado() {
		// Constructor por defecto: no recibe parametros
		// ni da un estado inicial
		// Cuando una clase no tiene constructor, por defecto siempre tiene el
		// constructor por defecto
	}

	public Empleado(String nombre, double sueldoEmple, int año, int mes, int dia) {

		nombreEmple = nombre;
		this.sueldoEmple = sueldoEmple;

		GregorianCalendar calendario = new GregorianCalendar(año, mes - 1, dia);
		altaEmple = calendario.getTime();

	}

	public Empleado(String nombreEmple) {// SOBRECARGA DE CONSTRUCTORES: Varios constructores en una clase, con
											// diferentes parametros
		this(nombreEmple, 30000, 2002, 01, 25);// Este this llama al otro constructor. Si hubieran más constructores
												// llamará al que coincida con los parámetros del this
	} // Parecido a establecer unos valores por defecto

	public String getNombreEmple() {// SOBRECARGA DE MÉTODOS: Misma filosofía que los constructores pero con métodos
		return nombreEmple;
	}

	public /* final */ double getSueldoEmple() { // FINAL en un metodo indica que no puede ser sobreescrito por una
													// clase heredada (evita la sobreescritura)
		return sueldoEmple;
	}

	public Date getAltaEmple() {
		return altaEmple;
	}

	public void setSubirSueldo(double porcentaje) {
		double aumento = sueldoEmple * porcentaje / 100;
		sueldoEmple += aumento;
	}

	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
		if (this.sueldoEmple < otroEmpleado.sueldoEmple)
			return -1;
		else if (this.sueldoEmple > otroEmpleado.sueldoEmple)
			return 1;
		return 0;

	}

}
