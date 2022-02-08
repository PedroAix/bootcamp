package com.capgemini;

public enum valoresCarta {

	AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), SOTA(10),
	CABALLO(11), REY(12);

	private int valor;

	private valoresCarta(int valor) {
		this.valor = valor;
	}

	public static valoresCarta getEnum(int valor) {
		switch (valor) {
		case 1:
			return valoresCarta.AS;
		case 2:
			return valoresCarta.DOS;
		case 3:
			return valoresCarta.TRES;
		case 4:
			return valoresCarta.CUATRO;
		case 5:
			return valoresCarta.CINCO;
		case 6:
			return valoresCarta.SEIS;
		case 7:
			return valoresCarta.SIETE;
		case 8:
			return valoresCarta.OCHO;
		case 9:
			return valoresCarta.NUEVE;
		case 10:
			return valoresCarta.SOTA;
		case 11:
			return valoresCarta.CABALLO;
		case 12:
			return valoresCarta.REY;
		default:
			throw new IllegalArgumentException("Valor inesperado: " + valor);
		}
	}
	
}
