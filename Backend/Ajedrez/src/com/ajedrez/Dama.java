package com.ajedrez;

public class Dama extends Pieza {

	public Dama(Color color) {
		super(color);
	}
	
	@Override
	protected boolean esValido (Movimiento movimiento, Tablero tablero) {
		return true;
	}

}
