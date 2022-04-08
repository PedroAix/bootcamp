package com.tutoriales.Excepciones;

import javax.swing.JOptionPane;

public class Fallos2 {
	
	public static void main(String[] args) {
		
		
		//Los errores a continuación, al ser RuntimeExveptions, lo ideal sería resolverlos sin usar try catch, per esto es un ejemplo del uso de barios try catch
		
		try {
			
			System.out.println(division());
			
		} catch(ArithmeticException e) {
			
			System.out.println("No se permite la división por 0");
			
		} catch(NumberFormatException e) {
			
			System.out.println("No has introducido un número entero");
			System.out.println(e.getMessage());
			System.out.println("Error del tipo: " + e.getClass().getName());
		}
		
	}
	
	public static int division() {
		int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo: "));
		int divisor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor: "));
	
		int resultado = dividendo / divisor;
		return resultado;
	}

}
