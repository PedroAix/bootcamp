package com.bootcamp.JuegoCartas;

public class Carta {
	private final valoresCarta valor;
	private final palosBarajaEspaņola palo;


	public Carta (valoresCarta valor, palosBarajaEspaņola palo) {
		this.valor = valor;
		this.palo = palo;		
	}

	@Override
	public String toString() {
		return valor + " de " + palo;
	}
	
}


