package com.tutoriales.Ejercicios.Futbol;

public class Principal {

	public static void main(String[] args) {
		
		Futbolista f1 = new Futbolista("Pedro Aix", 10, Posicion.PORTERO, Equipo.SEVILLA);
		Futbolista f2 = new Futbolista("Mariola Navarro", 12, Posicion.DELANTERO, Equipo.REAL_MADRID);
		Futbolista f3 = new Futbolista("Dar�o Bermejo", 7, Posicion.CENTROCAMPISTA, Equipo.VILLAREAL);
		Futbolista f4 = new Futbolista("V�ctor Mar�n", 3, Posicion.DEFENSA, Equipo.BAR�A);
		
		Futbolista[] array = {f1, f2, f3, f4};
		
		for(Futbolista jugador: array) {
			System.out.println(jugador.toString());
		}
		
	}
}
