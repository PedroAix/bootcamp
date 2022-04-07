package com.bootcamp.JuegoCartas;

import java.util.*;

public class Baraja {

	protected Stack<Carta> b = new Stack<Carta>();
	protected ArrayList<Carta> lista = new ArrayList<Carta>();

	public Baraja() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 13; j++) {
				Carta c = new Carta(valoresCarta.getEnum(j), palosBarajaEspañola.getEnum(i));
				b.add(c);
			}
		}
		barajar();
	}

	public void barajar() {
		Collections.shuffle(b);
	}

	
	public ArrayList<Carta> repartir(int cantidadCartas) {
		if ((cantidadCartas <= 0) || (cantidadCartas > b.size())) {
			throw new IllegalArgumentException ("No hay tantas cartas disponibles en la baraja");
		}
		for (int i = 0; i < cantidadCartas; i++) {
			lista.add(b.pop());
		}
		return lista;
	}

	public Object getBaraja() {
		return b.clone();
	}
}
