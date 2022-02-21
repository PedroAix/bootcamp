package com.tutoriales.Ejercicios.Empleado;

public class Empleado {
	
	/**
	 * Ejercicio para trabajar con Herencias
	 * @author paixvina
	 *
	 */

	private String nombre;
	
	
	/**Constructor Empleado por defecto
	 */
	public Empleado() {
	}
	
	/**
	 * Constructor Empleado con un parámetro
	 * @param Nombre del empleado
	 */
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	/**
	 * Devuelve un String indicando el nombre del empleado al mostrarlo por pantalla
	 * @return String con el nombre del empleado
	 */
	public String toString() {
		return "Empleado " + nombre;
	}
	
	
	/**
	 * Establece el nombre del empleado
	 * @param Nombre dle empleado
	 */
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	
	/**
	 * Devuelve el nombre del empleado
	 * @return Nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}
}
