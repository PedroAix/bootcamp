package com.ajedrez;

public class Caballo extends Pieza {

	public Caballo(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean esValido (Movimiento movimiento, Tablero tablero) {
		return true;
	}

}
