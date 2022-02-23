package com.tutoriales.Empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
	public static void main (String[] ags) {
		Persona[] array = new Persona[2];
		
		array[0] = new Empleado2("Pedro Aix", 20000, 20022, 01, 25);
		array[1] = new Alumno("Mariola Navarro", "Veterinaria");
		
		for(Persona p : array) {
			
			System.out.println(p.getNombre() + ", " + p.getDescripcion());
		}
	
	}
	

}




abstract class Persona {//CLASE ABSTRACTA (puede tener como m�nimo 0 m�todos abstractos)
						//Marca el dise�o de la jerarqu�a de la herencia
	private String nombre;
	
	
	public Persona(String nombre) {
		this.nombre = nombre;	
		
	}
	
	
	public String getNombre() {
		return "Nombre: " + nombre;
		
	}
	
	public abstract String getDescripcion();//METODO ABSTRACTO (no tiene cuerpo)
	//Si una clase tiene un m�todo abstracto, esa clase debe ser abstracta
	//Las clases que heredan est�n obligadas a sobreescribir el/los m�todos abstractos (son obligatorios)
	
}




class Empleado2 extends Persona {

	private double sueldoEmple;
	private Date altaEmple;
	
	
	public Empleado2(String nombre, double sueldoEmple, int a�o, int mes, int dia) {
	
		super(nombre);
		this.sueldoEmple = sueldoEmple;
		
		GregorianCalendar calendario = new GregorianCalendar(a�o, mes-1, dia);
			altaEmple = calendario.getTime();
		
	}
	
	@Override
	public String getDescripcion() {//Metodo heredado abstracto
		return "Empleado con sueldo: " + sueldoEmple + " �";
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




class Alumno extends Persona {
	
	private String carrera;
	
	public Alumno(String nombre, String carrera) {
		super(nombre);
		this.carrera = carrera;
	}
	
	
	@Override
	public String getDescripcion() {//Metodo heredado abstracto
		
		return "Alumno estudiando " + carrera;
	}
	
	
	
	
	
}
