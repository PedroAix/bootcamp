package com.tutoriales.Frames;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class creandoMarcoCentrado {

	public static void main(String[] args) {
		marcoCentrado miMarco = new marcoCentrado();

	}

}


class marcoCentrado extends JFrame{
	
	public marcoCentrado() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit(); //Devuelve el medio por el que se está ejecutando el programa (en una pantalla u otro dispositivo)
		Dimension resolucion = miPantalla.getScreenSize(); //Guardar el tamaño de la pantalla (width y heigh)
		
		int heigh = resolucion.height;
		int width = resolucion.width;
		
		setSize(width/2, heigh/2);
		setLocation(width/4, heigh/4);//Centramos la imagen
		
		setTitle("Marco centrado");
		
		Image icono = miPantalla.getImage("src/com/tutoriales/Frames/mario.jpg");
		setIconImage(icono);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
}
