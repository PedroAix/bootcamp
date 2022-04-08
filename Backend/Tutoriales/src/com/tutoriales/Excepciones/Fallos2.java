package com.tutoriales.Excepciones;

import javax.swing.JOptionPane;

public class Fallos2 {
	
	public static void main(String[] args) {
		
		
		//Los errores a continuaci�n, al ser RuntimeExveptions, lo ideal ser�a resolverlos sin usar try catch, per esto es un ejemplo del uso de barios try catch
		
		try {
			
			System.out.println(division());
			
		} catch(ArithmeticException e) {
			
			System.out.println("No se permite la divisi�n por 0");
			
		} catch(NumberFormatException e) {
			
			System.out.println("No has introducido un n�mero entero");
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
