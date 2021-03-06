package com.bootcamp.JuegoCartas;

public enum palosBarajaEspaņola {
	OROS(1), COPAS(2), ESPADAS(3), BASTOS(4);

	private int valor;

	private palosBarajaEspaņola(int valor) {
		this.valor = valor;
	}

	public static palosBarajaEspaņola getEnum(int valor) {
		switch (valor) {
		case 1:
			return palosBarajaEspaņola.OROS;
		case 2:
			return palosBarajaEspaņola.COPAS;
		case 3:
			return palosBarajaEspaņola.ESPADAS;
		case 4:
			return palosBarajaEspaņola.BASTOS;
		default:
			throw new IllegalArgumentException("Valor inesperado: " + valor);
		}
	}
}

