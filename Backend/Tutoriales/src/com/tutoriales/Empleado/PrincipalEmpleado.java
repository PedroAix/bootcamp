package com.tutoriales.Empleado;

import java.util.Arrays;

public class PrincipalEmpleado {

	public static void main(String[] args) {

		Jefatura jefeRRHH = new Jefatura("Paco Gutierrez", 40000.0, 1990, 12, 01);
		jefeRRHH.setIncentivo(1500);

		Empleado[] arrayEmple = new Empleado[6];

		arrayEmple[0] = new Empleado("Pedro Aix", 1100, 2022, 1, 25);
		arrayEmple[1] = new Empleado("Mariola Navarro", 1500, 2020, 8, 12);
		arrayEmple[2] = new Empleado("Veronica Aix");
		arrayEmple[3] = new Empleado();// LLAMADA AL CONSTRUCTOR POR DEFECTO
		arrayEmple[4] = jefeRRHH; // POLIMORFISMO, PRINCIPIO DE SUSTITUCIÓN
		// PRINCIPIO DE SUSTITUCIÓN: Se puede utilizar un objeto de la subclase (hijo)
		// siempre y cuando el programa espere un objeto de la superclase (padre)
		// En este caso, espera guardar en el array un objeto Empleado, pero guardamos
		// un objeto Jefatura

		
		arrayEmple[5] = new Jefatura("Maria Canovas", 5000, 1999, 11, 02);// POLIMORFISMO DE NUEVO
		Jefatura jefaFinanzas = (Jefatura) arrayEmple[5];//CASTING para convertir un tipo de objeto en otro
		//El casting funciona porque convertimos un objeto de tipo Jefatura guardado en la pos5 en su tipo padre
		jefaFinanzas.setIncentivo(5000);
		
		
		System.out.println(jefaFinanzas.tomaDecision("Dar más días de vacaciones a los empleados"));
		
		
		
		//Jefatura jefaFinanzas2 = (Jefatura) arrayEmple[1];
		//Esta línea da error porque no puedo convertir un objeto de tipo Empleado (Padre)
		//en otro objeto de tipo hijo (Jefatura)
		
		
		
//		Empleado directorComercial = new Jefatura("Sandra González", 7800, 1997, 10, 10);//Principio de sustitución
//		Comparable ejemplo = new Empleado("Elisabeth", 95000, 2000, 8, 14);//Principio de sustitución
//		
//		if (directorComercial instanceof Empleado) //Instance of comprueba si la variable hereda de la clase o interfaz indicada (si implementa a esa clase o interfaz)
//			System.out.println("Es de tipo jefatura");
//		if (ejemplo instanceof Comparable)
//			System.out.println("Implementa la interfaz Comparable");
		
		
		
		Arrays.sort(arrayEmple);
		
		
		
		for (Empleado empleado : arrayEmple) {
			empleado.setSubirSueldo(25);
			System.out.println("Nombre: " + empleado.getNombreEmple() + "\nSueldo: " + empleado.getSueldoEmple()
					+ "\nFecha de alta: " + empleado.getAltaEmple() + "\n------------------------");
			// Cuando les toque a los objetos de Jefatura, la variable empleado será de tipo
			// jefatura,
			// por lo que llamará al método getSueldoEmple de la clase Jefatura y le añadirá
			// el incentivo a los jefes,
			// mientras que en el resto de ocasiones llamará a los métodos de la clase
			// Empleado
			// POLIMORFISMO
			// Como es capaz de detectar la MV la clase a la que tiene que llamar? ->
			// Enlazado dinámico
			
			// Enlazado dinámico: saber en tiempo de ejecución a qué metodo llamar
			// (perteneciente a la clase padre o a la subclase)
		}
	}
}
