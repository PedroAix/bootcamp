package com.ajedrez;

public class Torre extends Pieza {

	public Torre(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean esValido (Movimiento movimiento, Tablero tablero) {
		return true;
	}

}
