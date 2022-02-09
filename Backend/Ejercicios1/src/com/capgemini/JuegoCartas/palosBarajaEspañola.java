package com.capgemini.JuegoCartas;

public enum palosBarajaEspañola {
	OROS(1), COPAS(2), ESPADAS(3), BASTOS(4);

	private int valor;

	private palosBarajaEspañola(int valor) {
		this.valor = valor;
	}

	public static palosBarajaEspañola getEnum(int valor) {
		switch (valor) {
		case 1:
			return palosBarajaEspañola.OROS;
		case 2:
			return palosBarajaEspañola.COPAS;
		case 3:
			return palosBarajaEspañola.ESPADAS;
		case 4:
			return palosBarajaEspañola.BASTOS;
		default:
			throw new IllegalArgumentException("Valor inesperado: " + valor);
		}
	}
}

