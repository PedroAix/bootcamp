package com.capgemini;


public class Carta {
	private int valor;
	private palosBarajaEspa�ola palo;


	public Carta (int valor, palosBarajaEspa�ola palo) {
		this.valor = valor;
		this.palo = palo;		
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}
	
}


