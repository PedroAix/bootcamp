package com.ajedrez;

public class Peon extends Pieza {

	public Peon(Color color) {
		super(color);
	}

	private boolean Avanza(Movimiento movimiento) {
		return true;
	}

	private boolean Inicia(Posicion posicion) {
		return true;
	}

	private boolean PuedeComer(Movimiento movimiento, Tablero tablero) {
		if (tablero.HayPieza(movimiento.getPosFin())) {
			return true;
		}
		return false;
	}

	private boolean NecesitaPromocion(Posicion posicion) {
		if (posicion.getFila() == 8 || posicion.getFila() == 1) {
			return true;
		}
		return false;
	}

	@Override
	protected boolean esValido(Movimiento movimiento, Tablero tablero) {
		if (movimiento.SaltoHorizontal() == 1 && movimiento.SaltoVertical() == 1) {
			if (PuedeComer(movimiento, tablero)) {
				return true;
			}
		} else if (movimiento.SaltoHorizontal() == 0 && movimiento.SaltoVertical() == 1) {
			return true;
		}
		return false;
	}

	public void Mover(Movimiento movimiento, Tablero tablero) {

	}
}
