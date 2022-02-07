package com.capgemini;

import javax.swing.JOptionPane;


public class JuegoDelNumero {

	
	public static void main(String[] args) {
		
		int numeroIntroducido;
		Juego juego = new Juego();
		
		do {
			try {
				numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog(null, "INTENTO Nº" +
						juego.getIntento() +"\nIntroduce un número del 1 al 100"));	
				juego.jugada(numeroIntroducido);
				JOptionPane.showMessageDialog(null, juego.getMessage());
				
			} catch (NumberFormatException error) {
				JOptionPane.showMessageDialog(null, "Introduce un tipo de dato válido");
			}
			
		} while (!juego.getTerminado() && juego.getIntento() <= 10);
	}
}
