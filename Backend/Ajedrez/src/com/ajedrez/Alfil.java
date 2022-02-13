package com.ajedrez;

public class Alfil extends Pieza {

	public Alfil(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido(Movimiento movimiento, Tablero tablero) {

		if (movimiento.esDiagonal()) {
			return true;
		}

		return false;
	}

}
