package com.capgemini;

import javax.swing.JOptionPane;


public class JuegoDelNumero {

	
	public static void main(String[] args) {
		
		int num;
		Juego juego = new Juego();
		juego.inicializar();
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "INTENTO N�" + juego.getIntento() +"\nIntroduce un n�mero del 1 al 100"));			
			juego.jugada(num);
			JOptionPane.showMessageDialog(null, juego.getMessage());
			
		} while (!juego.getTerminado());
	}
}
