package com.tutoriales.Excepciones;

import javax.swing.JOptionPane;

public class Fallos {
	
	//Los errores pueden ser heredados de:
	//IOException, (excepcion comprobada) RuntimeException (excepci�n no comprobada)
	
	//Los errores heredados de IOException deben ser usados con el
	//c�digo try{]catch(){}. Son errores que no tienen que ver con el programador
	
	//Los errores heredados de RuntimeException son errores de c�digo
	//producidos por el programador. Se solucionan depurando mejor el c�digo
	//No requieren uso del try catch pero lo podemos usar del mismo modo
	
	//Podemos usar en la firma del m�todo throws Error_Generado, pero
	//no est� muy bien visto
	
	
	//Si al llamar un m�todo puede generar un error lo mejor es capturarlo 
	//envolviendo la llamada del m�todo con el try catch y definiendo el throws
	//en la firma del m�todo
	
	//Tanto RuntimeException como IOException heredan de la misma clase: Exception
	//Utilizando Exception en try catch o en el throws abarcamos ambos tipos de errores
	//de una forma m�s general


	public static void main(String[] args) {
		int[] matriz = new int[5];
		
		matriz[0] = 5;
		matriz[1] = 38;
		matriz[2] = -15;
		matriz[3] = 92;
		matriz[4] = 71;
		
		try {
			matriz[5] = 1;
		} catch (Exception e) {
			System.out.println("Se ha genereado un error");
		}
		 
		
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.println("Posici�n " + i +" = " + matriz[i]);
		}
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
		
		JOptionPane.showMessageDialog(null, "Hola, " + nombre + "\nTienes " + edad + " a�os");
		System.out.println("Ejecuci�n terminada");
	}

	
}
