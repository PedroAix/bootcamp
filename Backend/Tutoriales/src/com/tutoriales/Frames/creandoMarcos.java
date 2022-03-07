package com.tutoriales.Frames;

import javax.swing.*;

public class creandoMarcos {

	public static void main(String[] args) {

		miMarco marco1 = new miMarco();
		
	}

}

class miMarco extends JFrame {

	// MOSTRAR LOS FRAMES CON setVisible
	// DARLES UN ANCHO Y ALTO CON setSize
	// ESTABLECER UN COMPORTAMIENTO AL CERRAR EL MARCO

	public miMarco() {

		setSize(500, 300);
		setVisible(true);//mostramos el frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//indicamos que se salga al cerrar (sin esto el programa continuará ejecutandose y consumiendo recursos
		
	}
}
