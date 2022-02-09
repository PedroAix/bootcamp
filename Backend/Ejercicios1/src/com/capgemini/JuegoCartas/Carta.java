package com.capgemini.JuegoCartas;

public class Carta {
	private final valoresCarta valor;
	private final palosBarajaEspa�ola palo;


	public Carta (valoresCarta valor, palosBarajaEspa�ola palo) {
		this.valor = valor;
		this.palo = palo;		
	}

	@Override
	public String toString() {
		return valor + " de " + palo;
	}
	
}


