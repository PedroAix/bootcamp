package com.tutoriales.Temporizador;

import javax.swing.*;
import javax.swing.Timer;

import java.awt.event.*;
import java.util.*;
import java.awt.Toolkit;

public class Hora2 {

	public static void main(String[] args) {

		Reloj reloj = new Reloj(); //Constructor por defecto

		reloj.enMarcha(3000, true);

		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");

		System.exit(0);

	}
}

class Reloj {

	public void enMarcha(int intervalo, boolean sonido) {
		class Temporizador2 implements ActionListener {
			//CLASE INTERNA LOCAL, clase dentro de un método (como solo se utilizan una vez se añaden al método simplificando el código)
			//No debe llevar ningún modificador de acceso
			//Clase totalmente encapsulada
			//Puede acceder a las variables del método y de la clase padre, pero la clase externa no puede acceder a la interna
			
			public void actionPerformed(ActionEvent evento) {

				Date ahora = new Date();

				System.out.println("Hora cada " + intervalo + " ms: " + ahora);

				if (sonido)
					Toolkit.getDefaultToolkit().beep();
			}
		}
		
		ActionListener listener = new Temporizador2();

		Timer temporizador = new Timer(intervalo, listener);

		temporizador.start();
	}

}
