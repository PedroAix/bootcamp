package com.tutoriales.Ejercicios.Empleado;

public class Oficial extends Operario{

	
	/**
	 * Constructor Oficial por defecto
	 */
	public Oficial() {
		
	}
	
	
	/**
	 * Constructor Oficial con un parámetro que llama al constructor padre
	 * @param nombre del oficial
	 */
	public Oficial(String nombre) {
		
		super(nombre);
		
	}
	
	/**
	 * Llamada al método padre toString para devolver un String indicando el nombre del Oficial al mostrarlo por pantalla
	 * @return String con el nombre del Oficial
	 */
	public String toString() {
		return super.toString() + " -> Oficial";
	}
	
}
