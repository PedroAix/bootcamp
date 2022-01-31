package com.tutoriales;

public class Tutorial2 {
	
	public static void main (String[] args) {
		
//		substring devuelve una subcadena desde la posicion inicial hasta la final -1
//		charAt devuelve el carácter en la posición indicada
//		equals compara si dos String son iguales (devuelve booleano)
//		equalsIgnoreCase es igual que equals pero sin distinguir en mayusculas o minusculas
		
		String nombre = "Pedro Aix Vinaroz";
		
		System.out.println("Hola, mi nombre es " + nombre);
		
		System.out.println("Tiene " + nombre.length() + " letras");
		
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));//o nombre.substring(0,1)
		
		int ultimaletra = nombre.length();
		System.out.println("La última letra es " + nombre.charAt(ultimaletra - 1));// o nombre.substring(ultimaletra) - 1)
		
		String alumno1, alumno2;
		alumno1 = "PEDRo";
		alumno2 = "Pedro";
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}
}
