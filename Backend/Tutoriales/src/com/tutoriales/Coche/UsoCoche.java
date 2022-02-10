package com.tutoriales.Coche;

import javax.swing.JOptionPane;


public class UsoCoche {

	public static void main(String[] args) {

		Coche coche = new Coche(); // INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
									// Nombre_clase nombre = new Nombre_Constructor

		
		coche.setColor(JOptionPane.showInputDialog("Introduce el color del coche: "));
		JOptionPane.showMessageDialog(null, coche.getDatos());

		
		coche.setAsientos(JOptionPane.showInputDialog("¿Quieres asientos de cuero?"));
		coche.setClimatizador(JOptionPane.showInputDialog("¿Quieres climatizador?"));
		
		JOptionPane.showMessageDialog(null, coche.getsetpesoCoche());
		JOptionPane.showMessageDialog(null, "El precio final del coche es: " + coche.getPrecio() + "€");
	}

}
