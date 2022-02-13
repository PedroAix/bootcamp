package com.ajedrez;

public class Caballo extends Pieza {

	public Caballo(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean esValido(Movimiento movimiento, Tablero tablero) {
		if (movimiento.SaltoHorizontal() == 2 && movimiento.SaltoVertical() == 1) {
			return true;
		} else if (movimiento.SaltoHorizontal() == 1 && movimiento.SaltoVertical() == 2) {
			return true;
		}
		return false;
	}
}
