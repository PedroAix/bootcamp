package com.tutoriales.Empleado;

public class PrincipalEmpleado {

	public static void main(String[] args) {

		Jefatura jefeRRHH = new Jefatura("Paco Gutierrez", 40000.0, 1990, 12, 01);
		jefeRRHH.setIncentivo(1500);

		Empleado[] arrayEmple = new Empleado[6];

		arrayEmple[0] = new Empleado("Pedro Aix", 1100, 2022, 1, 25);
		arrayEmple[1] = new Empleado("Mariola Navarro", 1500, 2020, 8, 12);
		arrayEmple[2] = new Empleado("Veronica Aix");
		arrayEmple[3] = new Empleado();// LLAMADA AL CONSTRUCTOR POR DEFECTO
		arrayEmple[4] = jefeRRHH; // POLIMORFISMO, PRINCIPIO DE SUSTITUCI�N
		// PRINCIPIO DE SUSTITUCI�N: Se puede utilizar un objeto de la subclase (hijo)
		// siempre y cuando el programa espere un objeto de la superclase (padre)
		// En este caso, espera guardar en el array un objeto Empleado, pero guardamos
		// un objeto Jefatura

		
		arrayEmple[5] = new Jefatura("Maria Canovas", 5000, 1999, 11, 02);// POLIMORFISMO DE NUEVO
		Jefatura jefaFinanzas = (Jefatura) arrayEmple[5];//CASTING para convertir un tipo de objeto en otro
		//El casting funciona porque convertimos un objeto de tipo Jefatura guardado en la pos5 en su tipo padre
		jefaFinanzas.setIncentivo(5000);
		
		
		//Jefatura jefaFinanzas2 = (Jefatura) arrayEmple[1];
		//Esta l�nea da error porque no puedo convertir un objeto de tipo Empleado (Padre)
		//en otro objeto de tipo hijo (Jefatura)
		
		
		for (Empleado empleado : arrayEmple) {
			empleado.setSubirSueldo(25);
			System.out.println("Nombre: " + empleado.getNombreEmple() + "\nSueldo: " + empleado.getSueldoEmple()
					+ "\nFecha de alta: " + empleado.getAltaEmple() + "\n------------------------");
			// Cuando les toque a los objetos de Jefatura, la variable empleado ser� de tipo
			// jefatura,
			// por lo que llamar� al m�todo getSueldoEmple de la clase Jefatura y le a�adir�
			// el incentivo a los jefes,
			// mientras que en el resto de ocasiones llamar� a los m�todos de la clase
			// Empleado
			// POLIMORFISMO
			// Como es capaz de detectar la MV la clase a la que tiene que llamar? ->
			// Enlazado din�mico
			
			// Enlazado din�mico: saber en tiempo de ejecuci�n a qu� metodo llamar
			// (perteneciente a la clase padre o a la subclase)
		}
	}
}
