package com.capgemini;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Decodificar {
	
	public static void main(String[] args) {
		
		String cadena = "";
		
		try {
			File archivo = new File("C:\\Curso\\Backend\\Ejercicios1\\src\\com\\capgemini\\calculadoraEntrada.txt");
			Scanner leer = new Scanner(archivo);
			while (leer.hasNextLine()) {
				cadena = leer.nextLine();
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		cadena = cadena.replace(",", ".");
		String[] cadena_separada = cadena.split("(?<=[-+*/])");
		double total = 0.0;
		
		Calculadora calcular = new Calculadora();

		for (int i = 0; i < cadena_separada.length; i++) {

			Double operando = Double.parseDouble(cadena_separada[i].substring(0, cadena_separada[i].length() - 1));
			char operador = cadena_separada[i].charAt(cadena_separada[i].length() - 1);

			System.out.println(operando + " " + operador);
			total = calcular.calculo(operando, operador);
		}
		System.out.println("\n\nEl total es: " + total);
	}
}