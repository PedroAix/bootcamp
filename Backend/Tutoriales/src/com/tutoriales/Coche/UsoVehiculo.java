package com.tutoriales.Coche;

import javax.swing.JOptionPane;

public class UsoVehiculo {

	public static void main(String[] args) {

		// INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
		// Nombre_clase nombre = new Nombre_Constructor

		Coche micoche1 = new Coche();
		micoche1.setColor("Azul");
		
		Furgoneta mifurgoneta1 = new Furgoneta(4, 400);
		mifurgoneta1.setColor("Amarillo");
		mifurgoneta1.setAsientos("si");
		mifurgoneta1.setClimatizador("si");
		//Utilizo estos métodos porque furgoneta los ha heredado
	
		System.out.println(micoche1.getDatos());
		System.out.println(micoche1.getColor());
		System.out.println("------------------------------------------");
		System.out.println(mifurgoneta1.getDatos());
		System.out.println(mifurgoneta1.getDatosFurgoneta());
		
		
	}

}
