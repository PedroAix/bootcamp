package com.tutoriales.Tallas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

//		Talla S = Talla.PEQUEÑO;//Los enumerados no permiten la creación de objetos (Talla t = new..., no se puede invocar a un constructor)
//		Talla M = Talla.MEDIANO;
//		Talla L = Talla.GRANDE;
//		Talla XL = Talla.MUY_GRANDE;

//		Talla XXL = Talla.ENORME; Error porque dentro del enumerado no existe ENORME

		String data;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe una talla: PEQUEÑO, MEDIANO, GRANDE, MUY_GRANDE");
		data = teclado.nextLine().toUpperCase();

		Talla la_talla = Enum.valueOf(Talla.class, data);// valueof devuelve el nombre del enumerado especificando el nombre de la clase y el nombre exacto del enumerado
														 //(es un método static, por lo que para llamarlo hay que usar el nombre								
														 // de la clase (Enum))

		System.out.println("TALLA: " + la_talla + ", ABREVIATURA: " + la_talla.getAbreviatura());

//	-----------------------------------------------------------------------------------
//	AL REVÉS: PEDIR LA TALLA A PARTIR DE SU ABREVIATURA

		System.out.println("Escribe una abreviatura: S, M, L, XL");
		data = teclado.nextLine().toUpperCase();
		
		System.out.println("ABREVIATURA: " + data + ", TALLA: " + Talla.getTalla(data));
		
		teclado.close();

	}

}
