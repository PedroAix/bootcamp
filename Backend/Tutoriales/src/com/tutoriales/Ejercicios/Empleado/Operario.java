package com.tutoriales.Ejercicios.Empleado;

public class Operario extends Empleado {
	
	
	/**
	 * Constructor Operario por defecto
	 */
	public Operario() {
		
	}
	
	/**
	 * Constructor Operario con un parámetro que llama al constructor padre
	 * @param Nombre del operario
	 */
	public Operario(String nombre){
		super(nombre);
		
	}
	
	
	/**
	 * Llamada al método padre toString para devolver un String indicando el nombre del Operario al mostrarlo por pantalla
	 * @return String con el nombre del operario
	 */
	public String toString() {
		return super.toString() + " -> Operario";
	}

}
