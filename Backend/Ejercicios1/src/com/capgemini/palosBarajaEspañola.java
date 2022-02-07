package com.capgemini;

public enum palosBarajaEspa�ola {
	COPAS(1), ESPADAS(2), BASTOS(3), OROS(4);

	private int valor;

	private palosBarajaEspa�ola(int valor) {
		this.valor = valor;
	}

	public static palosBarajaEspa�ola getEnum(int valor) {
		switch (valor) {
		case 1:
			return palosBarajaEspa�ola.COPAS;
		case 2:
			return palosBarajaEspa�ola.ESPADAS;
		case 3:
			return palosBarajaEspa�ola.BASTOS;
		case 4:
			return palosBarajaEspa�ola.OROS;
		default:
			throw new IllegalArgumentException("Valor inesperado: " + valor);
		}
	}
}

