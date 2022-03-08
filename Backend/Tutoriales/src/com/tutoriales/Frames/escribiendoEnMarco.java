package com.tutoriales.Frames;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class escribiendoEnMarco {

	public static void main(String[] args) {
		
		MarcoConTexto miMarco = new MarcoConTexto();
	}
}


class MarcoConTexto extends JFrame {
	
	public MarcoConTexto() {
		
	
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension resolucion = pantalla.getScreenSize();
		setBounds(resolucion.width/4,resolucion.height/4,resolucion.width/2,resolucion.height/2);
		
		setTitle("Marco con texto");
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Lamina lamina = new Lamina();
		add(lamina);
	}
}

class Lamina extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawString("Mi primer mensaje", 100, 100);
	}
}