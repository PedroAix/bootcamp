package com.tutoriales;


import java.util.Scanner;

public class Prueba {
	public static void main (String[] args) {
		
		int[][] tablero = new int[8][8];
				
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if ((j + i + 1) % 2 == 0) {//SI TRUE PINTA 1 (BLANCO)
					tablero[i][j] = 1;
				}
				else
					tablero[i][j] = 0;//EN OTRO CASO PINTA 0 (NEGRO)
			}
		}
		tablero[0][0]=2;
		
		for (int[] fila:tablero) {
			System.out.println();
			for (int casilla:fila) {
				System.out.print(casilla + "  ");
			}
		}
		
//  boolean isLight = (row % 2) == (column % 2);
//  boolean isDark = (row % 2) != (column % 2);
		
		
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("COLUMNA: "); 
//		int columna = teclado.nextInt();
//		
//		System.out.println("FILA: "); 
//		int fila = teclado.nextInt();
//
//		 
//		if ((columna + fila + 1) % 2 == 0){
//			System.out.println("BLANCO");
//		}
//		else
//			System.out.println("NEGRO");
//		
		
	}

}
