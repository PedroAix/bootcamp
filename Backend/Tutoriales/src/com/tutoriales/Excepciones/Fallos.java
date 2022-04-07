package com.tutoriales.Excepciones;

import javax.swing.JOptionPane;

public class Fallos {


	public static void main(String[] args) {
		int[] matriz = new int[5];
		
		matriz[0] = 5;
		matriz[1] = 38;
		matriz[2] = -15;
		matriz[3] = 92;
		matriz[4] = 71;
		
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.println("Posición " + i +" = " + matriz[i]);
		}
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
		
		JOptionPane.showMessageDialog(null, "Hola, " + nombre + "\nTienes " + edad + " años");
		System.out.println("Ejecución terminada");
	}

	
}
