package com.capgemini;

public class Decodificar {

	public static void main(String[] args) {
		
		String cadena = "3+4+3,4-7*1=";
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