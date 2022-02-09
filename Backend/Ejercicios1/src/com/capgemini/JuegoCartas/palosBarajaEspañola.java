package com.capgemini.JuegoCartas;

public enum palosBarajaEspa�ola {
	OROS(1), COPAS(2), ESPADAS(3), BASTOS(4);

	private int valor;

	private palosBarajaEspa�ola(int valor) {
		this.valor = valor;
	}

	public static palosBarajaEspa�ola getEnum(int valor) {
		switch (valor) {
		case 1:
			return palosBarajaEspa�ola.OROS;
		case 2:
			return palosBarajaEspa�ola.COPAS;
		case 3:
			return palosBarajaEspa�ola.ESPADAS;
		case 4:
			return palosBarajaEspa�ola.BASTOS;
		default:
			throw new IllegalArgumentException("Valor inesperado: " + valor);
		}
	}
}

