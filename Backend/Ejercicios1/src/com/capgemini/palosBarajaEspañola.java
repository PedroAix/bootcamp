package com.capgemini;

public enum palosBarajaEspaņola {
	COPAS(1), ESPADAS(2), BASTOS(3), OROS(4);

	private int valor;

	private palosBarajaEspaņola(int valor) {
		this.valor = valor;
	}

	public static palosBarajaEspaņola getEnum(int valor) {
		switch (valor) {
		case 1:
			return palosBarajaEspaņola.COPAS;
		case 2:
			return palosBarajaEspaņola.ESPADAS;
		case 3:
			return palosBarajaEspaņola.BASTOS;
		case 4:
			return palosBarajaEspaņola.OROS;
		default:
			throw new IllegalArgumentException("Valor inesperado: " + valor);
		}
	}
}

