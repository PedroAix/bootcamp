package com.tutoriales.Ejercicios.Empleado;

public class Técnico extends Operario {
		
		/**
		 * Constructor Técnico por defecto
		 */
		public Técnico() {
			
		}
		
		
		/**
		 * Constructor Técnico con un parámetro que llama al constructor padre
		 * @param nombre del técnico
		 */
		public Técnico(String nombre) {
			
			super(nombre);
			
		}
		
		/**
		 * Llamada al método padre toString para devolver un String indicando el nombre del Técnico al mostrarlo por pantalla
		 * @return String con el nombre del Técnico
		 */
		public String toString() {
			return super.toString() + " -> Técnico";
		}
		

}
