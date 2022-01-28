package com.capgemini;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		var rnd = new Random();
		
		System.out.println("Adivina el n�mero!\nTienes 10 intentos\n\n");
		int num_aleatorio = rnd.nextInt(100);
		int intento = 1;
		
		
		do {
			System.out.println("INTENTO N�" + intento);
			System.out.print("Introduce un n�mero del 1 al 100: ");
			int num = teclado.nextInt();
			if (num_aleatorio == num) {
				System.out.println("CORRECTO!");
				break;
			}
			else {
				System.out.println("**INCORRECTO**");
				intento++;
				if (num > num_aleatorio) System.out.println("El n�mero es m�s peque�o\n");
				if (num < num_aleatorio) System.out.println("El n�mero es m�s grande\n");
			}
		} while (intento <= 10); //CONDICION DE PERMANENCIA
	}
}
