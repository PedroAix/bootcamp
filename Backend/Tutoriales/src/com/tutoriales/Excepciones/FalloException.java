package com.tutoriales.Excepciones;

//Podemos generar nuestras propias excepciones.
//Si nuestra clase hereda de IOException estaremos obligados a usar try catch a la hora de instanciar esta clase
//Con Runtime no, pero como Exception es más general es conveniente usarlo.

//Tiene dos ocnstructores: uno por defecto y otro que recibe como parámetro el mensage de error y que llama al constructor padre de Exception

public class FalloException extends Exception{
	
	public FalloException() {
	}
	
	public FalloException(String msg) {
		super(msg);
	}

}
