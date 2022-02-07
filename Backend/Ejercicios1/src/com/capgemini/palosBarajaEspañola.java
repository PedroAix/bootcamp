package com.capgemini;

public enum palosBarajaEspañola {
	COPAS(1), ESPADAS(2), BASTOS(3), OROS(4);

	private int valor;

	private palosBarajaEspañola(int valor) {
		this.valor = valor;
	}

	public static palosBarajaEspañola getEnum(int valor) {
		switch (valor) {
		case 1:
			return palosBarajaEspañola.COPAS;
		case 2:
			return palosBarajaEspañola.ESPADAS;
		case 3:
			return palosBarajaEspañola.BASTOS;
		case 4:
			return palosBarajaEspañola.OROS;
		default:
			throw new IllegalArgumentException("Valor inesperado: " + valor);
		}
	}
}

