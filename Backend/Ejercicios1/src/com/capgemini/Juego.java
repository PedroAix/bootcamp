package com.capgemini;

import java.util.Random;


public class Juego {
	private int numeroIntentos;
	private Random rnd = new Random();
	int numeroAleatorio;
	private String mensaje;
	private boolean terminado;

	public Juego() {
	inicializar();
	}

	private void inicializar() {
		numeroIntentos = 1;
		mensaje = "";
		numeroAleatorio = rnd.nextInt(100);
		terminado = false;
	}
	
	public void jugada(int num) {
		if (numeroAleatorio == num) {
			mensaje = "CORRECTO!";
			terminado = true;
			return;
		} 
		else {
			numeroIntentos++;
			if (num > numeroAleatorio) mensaje = "**INCORRECTO**\nEl número es más pequeño";
			else mensaje = "**INCORRECTO**\nEl número es más grande";
		}
		if (numeroIntentos > 10) {
			mensaje = "**INCORRECTO**\nTe has quedado sin intentos!\nEl número secreto era: " + numeroAleatorio;
			terminado = true;
		}
	}
	
	
	public String getMessage() {
		return mensaje;
	}
	
	public boolean getTerminado() {
		return terminado;
	}
	
	public int getIntento() {
		return numeroIntentos;
	}
}
