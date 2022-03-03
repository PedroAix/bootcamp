package com.tutoriales.Temporizador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;



public class Hora implements ActionListener {


	public void actionPerformed(ActionEvent e){
		
		Date ahora = new Date();
		System.out.println(ahora.toString().substring(11,20));
		
		
	}

}
