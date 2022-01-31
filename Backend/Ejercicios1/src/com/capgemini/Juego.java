package com.capgemini;

import java.util.Random;


public class Juego {
//	private int intento;
//	private Random rnd = new Random();
//	private int num_aleatorio;
//	private String mensaje;
//	private boolean terminado;
	
	/**
	 * En vez de inicializar los atributos como aparece arriba
	 * y declarar el m�todo  public void inicializar(), el cual
	 * llamamos en la clase JuegoDelNumero.java, podemos
	 * crear un m�todo del mismo nombre que la clase (constructor) y
	 * llamar dentro al m�todo inicializar. De esta forma,
	 * no es necesario llamar al metodo inicializar en la clase JuegoDelNumero.java
	 * ya que al llamar al constructor autom�ticamente se va a ejecutar lo que
	 * cuelgue de �l
	 * 
	 */
	
	private int intento, num_aleatorio;
	Random rnd = new Random();
	private String mensaje;
	private boolean terminado;

	public Juego() { //CONSTRUCTOR
	inicializar();
	}

	private void inicializar() {
		intento = 1;
		mensaje = "";
		num_aleatorio = rnd.nextInt(100);
		terminado = false;
	}
	
	
//	public void inicializar() { //Este inicializar era el que usaba para llamar 
//		intento = 1;			en la clase JuegoDelNumero.java de forma manual
//		num_aleatorio = rnd.nextInt(100);
//		mensaje = "";
//		terminado = false;
//	}
	
	public void jugada(int num) {
		if (num_aleatorio == num) {
			mensaje = "CORRECTO!";
			terminado = true;
			return;
		} 
		else {
			intento++;
			if (num > num_aleatorio) mensaje = "**INCORRECTO**\nEl n�mero es m�s peque�o";
			else mensaje = "**INCORRECTO**\nEl n�mero es m�s grande";
		}
		if (intento > 10) {
			mensaje = "**INCORRECTO**\nTe has quedado sin intentos!\nEl n�mero secreto era: " + num_aleatorio;
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
