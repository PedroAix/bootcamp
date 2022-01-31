package com.capgemini;

public class Decodificar {

	public static void main(String[] args) {
		String cadena = "3+4+3,4-7*1=";
		cadena = cadena.replace(",",".");
		String[] cadena_separada = cadena.split("(?<=[-+*/()])");
		System.out.println(cadena);
		
		for (int i = 0; i < cadena_separada.length; i++) {
//			System.out.println(cadena.charAt(i) );
//			cadena_separada[i] = cadena_separada[i].replace("+"," +");
//			cadena_separada[i] = cadena_separada[i].replace("-"," -");
//			cadena_separada[i] = cadena_separada[i].replace("*"," *");
//			cadena_separada[i] = cadena_separada[i].replace("="," =");

			System.out.println(cadena_separada[i].charAt(0) + " " + cadena_separada[i].charAt(1));
		}
	}

}
