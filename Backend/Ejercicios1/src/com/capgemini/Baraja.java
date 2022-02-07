package com.capgemini;
import java.util.*;

public class Baraja {

	
	public static void main(String[] args) {
		
		List<Object> baraja = new ArrayList<>();
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 13; j++) {
				Carta c = new Carta(j,palosBarajaEspañola.getEnum(i));
				baraja.add(c);
		}
		
	}
		for (int i = 0; i < baraja.size(); i++) {
			System.out.println(baraja.get(i));
		}
		
	}

}
