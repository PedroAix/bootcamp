package com.capgemini;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void MostrarIntentos(int a) {// MUESTRA LOS INTENTOS
		System.out.println("INTENTO Nº" + a);
	}

	public static void AproximacionNumero(int num_aleatorio, int num) {// MUESTRA SI EL NÚMERO ES MÁS GRANDE O PEQUEÑO
		if (num > num_aleatorio)
			System.out.println("El número es más pequeño\n");
		else
			System.out.println("El número es más grande\n");
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		var rnd = new Random();

		System.out.println("Adivina el número!\nTienes 10 intentos\n\n");
		int num_aleatorio = rnd.nextInt(100);
		int intento = 1;

		do {
			MostrarIntentos(intento);
			System.out.print("Introduce un número del 1 al 100: ");
			int num = teclado.nextInt();
			if (num_aleatorio == num) {
				System.out.println("CORRECTO!");
				break;
			} else {
				System.out.println("**INCORRECTO**");
				intento++;
				AproximacionNumero(num_aleatorio, num);
			}
		} while (intento <= 10); // CONDICION DE PERMANENCIA
	}

}
