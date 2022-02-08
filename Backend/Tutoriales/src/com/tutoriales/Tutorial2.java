package com.tutoriales;

import java.util.Random;

public class Tutorial2 {

	public static void main(String[] args) {

		int[][] matriz = new int[5][2];

		Random rnd = new Random();

		for (int[] fila : matriz) {
			System.out.println();
			for (int elemento : fila) {
				elemento = rnd.nextInt(10);
				System.out.print(elemento + "   ");
			}
		}
	}
}
