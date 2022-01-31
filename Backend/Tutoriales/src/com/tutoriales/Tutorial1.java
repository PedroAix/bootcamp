package com.tutoriales;

import java.util.Scanner;//Para introducir valor por consola
import javax.swing.JOptionPane;//Para GUI

public class Tutorial1 {
	
	public static void Strings (String[] args) {
		
//		substring devuelve una subcadena desde la posicion inicial hasta la final -1
//		charAt devuelve el car�cter en la posici�n indicada
//		equals compara si dos String son iguales (devuelve booleano)
//		equalsIgnoreCase es igual que equals pero sin distinguir en mayusculas o minusculas
		
		String nombre = "Pedro Aix Vinaroz";
		
		System.out.println("Hola, mi nombre es " + nombre);
		
		System.out.println("Tiene " + nombre.length() + " letras");
		
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));//o nombre.substring(0,1)
		
		int ultimaletra = nombre.length();
		System.out.println("La �ltima letra es " + nombre.charAt(ultimaletra - 1));// o nombre.substring(ultimaletra) - 1)
		
		String alumno1, alumno2;
		alumno1 = "PEDRo";
		alumno2 = "Pedro";
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}
	
	public static void Math(String[] args) {
		
		
//		double x = 3.54;
//		double y = -10;
		
//		double z = Math.max(x, y); Cu�l es el mayor de ambos
//		double z = Math.abs(y); Valor absoluto
//		double z = Math.sqrt(121); Ra�z cuadrada
//		double z = Math.round(x); Redondeo normal
//		double z = Math.ceil(x); Redondeo siempre hacia arriba
//		double z = Math.floor(x); Redondeo siempre hacia abajo
//		double z = Math.pow(3, 5); Potencia (base, exponente)
//		System.out.println(z);
		
		
		//Hayar hipotenusa pidiendo catetos a y b	
		Scanner scanner = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.print("Introduce el valor del cateto b: ");
		b = scanner.nextDouble();
		System.out.print("Introduce el valor del cateto c: ");
		c = scanner.nextDouble();
		
		a = Math.sqrt((b*b)+(c*c));
		
		System.out.println("El valor de la hipotenusa es: " + a);
		
		scanner.close();
		
		
		
	}
	
	public static void GUI(String[] args) {
		String name = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null,"Hola, " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		JOptionPane.showMessageDialog(null, "Tienes " + age + " a�os");
				
		double height = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu altura"));
		JOptionPane.showMessageDialog(null, "Mides " + height + " cm");
	}
	
	public static void operandos_casting(String[] arg) {
		
		/* expresion = operandos & operadores
		 * operandos = valores, variables, numeros, cantidad
		 * operadores = + - * / %
		 */
		
		double friends = 10;
		
//		friends = friends + 1;
//		friends++;
//		friends--;
		friends = (double) friends / 3;
		
		System.out.println(friends);
	}
	
	public static void input_output(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Cu�l es tu nombre?: ");
		String name = scanner.nextLine();
		System.out.print("Edad: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Comida favorita?: ");
		String food = scanner.nextLine();
		
		System.out.println("Hola, "+ name);
		System.out.println("Tienes " + age + " a�os");
		System.out.println("Te gusta: " + food);
		
		scanner.close();//Cerrar (no es necesario)

	}

	public static void cambio_variables(String[] args) {
		String x = "agua";
		String y = "aceite";
		var z = "";
		
		z = x;
		x = y;
		y = z;
		
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
	
	public static void introduccion(String[] args) {
//		System.out.print("hello world\n");
//		System.out.println("\tpizza");
//		System.out.println();

//		final int edad = 21; DECLARACION DE CONSTANTE

		int x;// Declaraci�n
		x = 123;// Asignaci�n
		int y = 123;// Inicializaci�n
		byte d = 32;
		short e = 900;
		long z = 12334558447384732L;// Para los long hay que poner la L siempre
		float a = 3.14f;// Para los float poner siempre f
		double b = 3.14;
		boolean c = true;
		char simbolo = 'r';
		String nombre = "Pedro Aix Vinaroz";

		System.out.println("Mi numero es: " + x);
		System.out.println("Hola, " + nombre);

// Comentario

		/*
		 * Comentario en lineas
		 */

	}
}

