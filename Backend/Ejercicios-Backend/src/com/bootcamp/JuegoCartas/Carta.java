package com.bootcamp.JuegoCartas;

public class Carta {
	private final valoresCarta valor;
	private final palosBarajaEspañola palo;


	public Carta (valoresCarta valor, palosBarajaEspañola palo) {
		this.valor = valor;
		this.palo = palo;		
	}

	@Override
	public String toString() {
		return valor + " de " + palo;
	}
	
}


