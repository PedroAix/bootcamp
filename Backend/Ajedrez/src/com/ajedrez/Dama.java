package com.ajedrez;

public class Dama extends Pieza {

	public Dama(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido(Movimiento movimiento, Tablero tablero) {
		if (movimiento.esDiagonal() || movimiento.esHorizontal() || movimiento.esVertical()) {
			return true;
		}
		return false;
	}

}
