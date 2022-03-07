package com.tutoriales.Temporizador;

import javax.swing.*;
import javax.swing.Timer;

import java.awt.event.*;
import java.util.*;
import java.awt.Toolkit;

public class Hora2 {

	public static void main(String[] args) {

		Reloj reloj = new Reloj(3000, true);

		reloj.enMarcha();

		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");

		System.exit(0);

	}
}

class Reloj {

	private int intervalo;
	private boolean sonido;

	public Reloj(int intervalo, boolean sonido) {

		this.intervalo = intervalo;
		this.sonido = sonido;

	}

	public void enMarcha() {
		ActionListener listener = new Temporizador2();

		Timer temporizador = new Timer(intervalo, listener);

		temporizador.start();
	}

	private class Temporizador2 implements ActionListener {//CLASE INTERNA (Puede acceder a los datos de la clase que la engloba, aunque sean privados)

		public void actionPerformed(ActionEvent evento) {

			Date ahora = new Date();

			System.out.println("Hora cada " + intervalo + " ms: " + ahora);

			if (sonido)
				Toolkit.getDefaultToolkit().beep();
		}
	}

}
