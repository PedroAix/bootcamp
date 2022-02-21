package com.tutoriales.Ejercicios.Empleado;

public class T�cnico extends Operario {
		
		/**
		 * Constructor T�cnico por defecto
		 */
		public T�cnico() {
			
		}
		
		
		/**
		 * Constructor T�cnico con un par�metro que llama al constructor padre
		 * @param nombre del t�cnico
		 */
		public T�cnico(String nombre) {
			
			super(nombre);
			
		}
		
		/**
		 * Llamada al m�todo padre toString para devolver un String indicando el nombre del T�cnico al mostrarlo por pantalla
		 * @return String con el nombre del T�cnico
		 */
		public String toString() {
			return super.toString() + " -> T�cnico";
		}
		

}
