package com.tutoriales.Temporizador;


import javax.swing.*;


public class PrincipalTemporizador {

	public static void main(String[] args) {
		
		Hora listener = new Hora();
		
		Timer temporizador = new Timer(1000, listener);
		temporizador.start();
	
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		temporizador.stop();
	}

}
