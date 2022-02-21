package com.tutoriales.Ejercicios.Empleado;

public class Directivo extends Empleado{
	
	
	/**
	 * Constructor Directivo por defecto
	 */
	public Directivo() {
		
	}

	/**
	 * Constructor Directivo con un parámetro que llama al constructor padre
	 * @param nombre del directivo
	 */
	public Directivo (String nombre) {
		super(nombre);
	}
	
	/**
	 * Llamada al método padre toString para devolver un String indicando el nombre del Direcetivo al mostrarlo por pantalla
	 * @return String con el nombre del Directivo
	 */
	public String toString() {
		return super.toString() + " -> Directivo";
	}
}
