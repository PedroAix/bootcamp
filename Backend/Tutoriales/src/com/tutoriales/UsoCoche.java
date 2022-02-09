package com.tutoriales;

public class UsoCoche {
	
	public static void main(String[] args) {
		
	Coche coche = new Coche(); //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
								 //Nombre_clase nombre = new Nombre_Constructor
	
	System.out.println(coche.getDatos());
	
	coche.setAsientos("si");
	System.out.println(coche.getAsientos());
	
	}

}
