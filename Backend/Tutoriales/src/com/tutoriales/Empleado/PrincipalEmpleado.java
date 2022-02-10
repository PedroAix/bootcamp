package com.tutoriales.Empleado;


public class PrincipalEmpleado {

	public static void main(String[] args) {

		Empleado[] arrayEmple = new Empleado[2];

		arrayEmple[0] = new Empleado("Pedro Aix", 1100, 2022, 1, 25);
		arrayEmple[1] = new Empleado("Mariola Navarro", 1500, 2020, 8, 12);

		for (Empleado empleado : arrayEmple) {
				empleado.setSubirSueldo(25);
				System.out.println("Nombre: " + empleado.getNombreEmple() + "\nSueldo: " + empleado.getSueldoEmple()
					+ "\nFecha de alta: " + empleado.getAltaEmple() + "\n------------------------");
		}
	}
}
