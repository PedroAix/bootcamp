package com.capgemini;

import java.util.Random;


public class Juego {
	private int intento = 1;
	private Random rnd = new Random();
	private int num_aleatorio = rnd.nextInt(100);
	private String mensaje = "";
	private boolean terminado = false;
	
	
	public void inicializar() {
		intento = 1;
		num_aleatorio = rnd.nextInt(100);
		mensaje = "";
		terminado = false;
	}
	
	public void jugada(int num) {
		if (num_aleatorio == num) {
			mensaje = "CORRECTO!";
			terminado = true;
			return;
		} 
		else {
			intento++;
			if (num > num_aleatorio) mensaje = "**INCORRECTO**\nEl número es más pequeño";
			else mensaje = "**INCORRECTO**\nEl número es más grande";
		}
		if (intento > 10) {
			mensaje = "Te has quedado sin intentos!\nEl número secreto era: " + num_aleatorio;
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
		return intento;
	}
}
