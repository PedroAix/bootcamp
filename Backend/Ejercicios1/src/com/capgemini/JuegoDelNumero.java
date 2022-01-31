package com.capgemini;

import javax.swing.JOptionPane;


public class JuegoDelNumero {

	
	public static void main(String[] args) {
		
		int num;
		Juego juego = new Juego();
		//juego.inicializar(); Esta era la llamada al método que hacía antes.
		//Ahora es el propio constructor el que se encarga de hacer la llamada.
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "INTENTO Nº" + juego.getIntento() +"\nIntroduce un número del 1 al 100"));			
			juego.jugada(num);
			JOptionPane.showMessageDialog(null, juego.getMessage());
			
		} while (!juego.getTerminado());
	}
}
