package com.capgemini;


public class Carta {
	private int valor;
	private palosBarajaEspañola palo;


	public Carta (int valor, palosBarajaEspañola palo) {
		this.valor = valor;
		this.palo = palo;		
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}
	
}


