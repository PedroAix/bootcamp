package com.tutoriales;

import java.util.Scanner;//Para introducir valor por consola
import javax.swing.JOptionPane;//Para GUI

public class Tutorial1 {
	
	public static void main(String[] args) {
		
		
//		double x = 3.54;
//		double y = -10;
		
//		double z = Math.max(x, y); Cuál es el mayor de ambos
//		double z = Math.abs(y); Valor absoluto
//		double z = Math.sqrt(121); Raíz cuadrada
//		double z = Math.round(x); Redondeo normal
//		double z = Math.ceil(x); Redondeo siempre hacia arriba
//		double z = Math.floor(x); Redondeo siempre hacia abajo
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
		JOptionPane.showMessageDialog(null, "Tienes " + age + " años");
				
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
		
		System.out.print("Cuál es tu nombre?: ");
		String name = scanner.nextLine();
		System.out.print("Edad: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Comida favorita?: ");
		String food = scanner.nextLine();
		
		System.out.println("Hola, "+ name);
		System.out.println("Tienes " + age + " años");
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

		int x;// Declaración
		x = 123;// Asignación
		int y = 123;// Inicialización
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

