package com.capgemini;

import java.util.Random;
import java.util.Scanner;

public class Principal {
	
	public static void MostrarIntentos(int a) {//MUESTRA LOS INTENTOS
		System.out.println("INTENTO N�" + a);
	}
	
	public static void Tama�oNumero(int num_aleatorio, int num) {//MUESTRA SI EL N�MERO ES M�S GRANDE O PEQUE�O
		if (num > num_aleatorio) System.out.println("El n�mero es m�s peque�o\n");
		else System.out.println("El n�mero es m�s grande\n");
	}
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		var rnd = new Random();
		
		System.out.println("Adivina el n�mero!\nTienes 10 intentos\n\n");
		int num_aleatorio = rnd.nextInt(100);
		int intento = 1;
		
		
		do {
			MostrarIntentos(intento);
			System.out.print("Introduce un n�mero del 1 al 100: ");
			int num = teclado.nextInt();
			if (num_aleatorio == num) {
				System.out.println("CORRECTO!");
				break;
				
			}
			else {
				System.out.println("**INCORRECTO**");
				intento++;
				Tama�oNumero(num_aleatorio,num);
			}
		} while (intento <= 10); //CONDICION DE PERMANENCIA
	}

}
