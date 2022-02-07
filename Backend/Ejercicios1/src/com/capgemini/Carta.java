package com.capgemini;


public class Carta {
	private int valor;
	private palosBarajaEspaņola palo;


	public Carta (int valor, palosBarajaEspaņola palo) {
		this.valor = valor;
		this.palo = palo;		
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}
	
}


