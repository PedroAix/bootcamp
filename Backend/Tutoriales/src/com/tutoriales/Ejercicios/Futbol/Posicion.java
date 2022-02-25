package com.tutoriales.Ejercicios.Futbol;

public enum Posicion {
	PORTERO(0), DEFENSA(1), CENTROCAMPISTA(2), DELANTERO(3);



	private int valor;
	
	private Posicion(int valor) {
		this.valor = valor;
	}

	
	
	public int getValor() {
		return valor;
	}

	public static Posicion getPosicionEnum(int valor) {
		switch (valor) {
		case 0: return Posicion.PORTERO;
		case 1: return Posicion.DEFENSA;
		case 2: return Posicion.CENTROCAMPISTA;
		case 3: return Posicion.DELANTERO;
		default:
			throw new IllegalArgumentException("Valor desconocido: " + valor);
		}
	}

}



