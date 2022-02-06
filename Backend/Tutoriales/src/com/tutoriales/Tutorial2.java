package com.tutoriales;

import javax.swing.JOptionPane;

public class Tutorial2 {
	
	public static void main (String[] args) {
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Selecciona la opci�n deseada:\n[1] C�rculo\n[2] Tri�ngulo\n[3] Cuadrado\n"));
		
		switch (opcion) {
			case 1:
				double radio = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el valor del radio en cm: "));
				JOptionPane.showInputDialog(null,"�rea del c�rculo:\n" + AreaCirculo(radio) + " cm2");
				break;
			case 2:
				double base = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el valor de la base en cm: "));
				double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el valor de la altura en cm: "));
				JOptionPane.showInputDialog(null,"�rea del tri�ngulo:\n" + AreaTriangulo(base, altura) + " cm2");
				
				break;
			case 3:
				double lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el valor del lado en cm: "));
				JOptionPane.showInputDialog(null,"�rea del cuadrado:\n" + AreaCuadrado(lado) + " cm2");
				break;
		}
		
	}
	public static double AreaCirculo(double radio) {
		double resultado = Math.PI * Math.pow(radio,2);
		return resultado;
		
	}
	
	public static double AreaTriangulo(double base, double altura) {
		double resultado = (base * altura) / 2;
		return resultado;
		
	}
	public static double AreaCuadrado(double lado) {
		double resultado = Math.pow(lado,2);
		return resultado;
	}
}
