package com.ajedrez;

public class Rey extends Pieza {

	public Rey(Color color) {
		super(color);
	}

	@Override
	protected boolean esValido(Movimiento movimiento, Tablero tablero) {
		if (movimiento.SaltoHorizontal() == 1 && movimiento.SaltoVertical() == 1) {
			return true;
		} else if (movimiento.SaltoHorizontal() == 0 && movimiento.SaltoVertical() == 1) {
			return true;
		} else if (movimiento.SaltoHorizontal() == 1 && movimiento.SaltoVertical() == 0) {
			return true;
		}
		return false;
	}

}
