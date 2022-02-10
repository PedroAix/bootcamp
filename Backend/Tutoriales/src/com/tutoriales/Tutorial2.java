package com.tutoriales;


public class Tutorial2 {

	public static void main(String[] args) {
		Empleados empleado1 = new Empleados("Pedro Aix");
		Empleados empleado2 = new Empleados("Mariola Navarro");

		empleado1.setSeccion("Inform�tica");
//		empleado1.setNombre("Pedro Vinaroz");
		
		System.out.println(empleado1.getInformacion());
//		Empleados.ID++; //VARIABLE DE CLASE (STATIC)
						//PARA USARLA ESCRIBIMOS EL NOMBRE DE LA CLASE, NO DEL OBJETO
						//PROBLEMA : NOS SALTAMOS LA ENCAPSULACION: public static ID;
		System.out.println();
		System.out.println(empleado2.getInformacion());
//		Empleados.ID++;
	}
}

class Empleados {
	
	private final String nombre; //CONSTANTE
	private int ID;
	private static int IDSiguiente = 1; //STATIC, VARIABLE DE CLASE QUE ES COMPARTIDA PARA TODOS LOS OBJETOS DE LA CLASE
										//SI NO FUERA STATIC CADA OBJETO TENDR�A UNA COPIA DE LA VARIABLE
	private String seccion;
	
	public Empleados(String nombre) {
		
		this.nombre = nombre;
		seccion = "Administraci�n";
		ID = IDSiguiente;
		IDSiguiente++;
		
	}
	
	public void setSeccion(String departamento) {
		
		seccion = departamento;
	}
	
//	public void setNombre(String nombre) {
//		this.nombre = nombre; //UNA CONSTANTE NO PUEDE SER MODIFICADA
//	}
	
	public String getInformacion() {
		return "ID: " + ID + "\nSecci�n: " + seccion + "\nNombre: " + nombre;
	}
	
}