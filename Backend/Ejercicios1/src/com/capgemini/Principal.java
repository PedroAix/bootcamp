package com.capgemini;

import java.util.Random;
import javax.swing.JOptionPane;

public class Principal {

	public void inicializar() {//MENSAJE DE INICIO
		JOptionPane.showMessageDialog(null, "Adivina el número!\nTienes 10 intentos\n\n");
	}
	
	public static int recogerNumero(int a) {// MUESTRA LOS INTENTOS Y RECOGE EL NUMERO INTRODUCIDO
		try {
			int b = Integer.parseInt(JOptionPane.showInputDialog(null, "INTENTO Nº" + a +"\nIntroduce un número del 1 al 100"));
			return b;
		}
		catch (NumberFormatException ex0b) {
			int b = recogerNumero(a);
			return b;
		}
	}
	
	public static void aproximacionNumero(int num_aleatorio, int num) {// MUESTRA SI EL NÚMERO ES MÁS GRANDE O PEQUEÑO
		if (num > num_aleatorio)
			JOptionPane.showMessageDialog(null, "**INCORRECTO**\nEl número es más pequeño");
		else
			JOptionPane.showMessageDialog(null, "**INCORRECTO**\nEl número es más grande");
	}

	public void jugada() {//PROGRAMA PRINCIPAL

		var rnd = new Random();
		
		int num_aleatorio = rnd.nextInt(100);
		int intento = 1;
		int num = 0;

		do {
			num = recogerNumero(intento);
			if (num_aleatorio == num) {
				JOptionPane.showMessageDialog(null, "CORRECTO!");
				break;
			} 
			else {	
				intento++;
				aproximacionNumero(num_aleatorio, num);
			}
		} while (intento <= 10); // CONDICION DE PERMANENCIA
		
		if (intento > 10) JOptionPane.showMessageDialog(null, "Te has quedado sin intentos!\nEl número secreto era: " + num_aleatorio);
	}

}
