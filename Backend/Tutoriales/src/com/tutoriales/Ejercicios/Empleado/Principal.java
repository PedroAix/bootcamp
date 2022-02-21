package com.tutoriales.Ejercicios.Empleado;

public class Principal {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Pedro");
		Empleado e2 = new Empleado("Mariola");
		Empleado e3 = new Empleado("Airon");
		Operario e4 = new Operario("Manolo");
		Oficial e5 = new Oficial("María");
		Técnico e6 = new Técnico("Pablo");
		Directivo e7 = new Directivo("Carmen");

		Empleado[] array = { e1, e2, e3, e4, e5, e6, e7 };

		for (Empleado persona : array) {
			System.out.println(persona);
		}

	}

}
