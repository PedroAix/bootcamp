package com.tutoriales.Frames;

import java.awt.Frame;

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

		setBounds(400,250,200,200); //Los dos primeros par�metros indican la posici�n (x e y) y los dos �ltimos el tama�o del frame
		setResizable(false);//Permitir o impedir que el frame se pueda redimensionar ni maximizar
		setExtendedState(Frame.MAXIMIZED_BOTH);//Pantalla completa
		setTitle("Ventana de prueba");
		
		setVisible(true);//mostramos el frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//indicamos que se salga al cerrar (sin esto el programa continuar� ejecutandose y consumiendo recursos
		
	}
}
