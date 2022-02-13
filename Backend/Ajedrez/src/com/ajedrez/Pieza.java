package com.ajedrez;


public abstract class Pieza {
	private Color color;

	public Pieza(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	protected abstract boolean esValido(Movimiento movimiento, Tablero tablero);

	public void mover(Movimiento movimiento, Tablero tablero) throws JuegoException {
		if (esValido(movimiento,tablero)) {
			tablero.Mover(movimiento);
		}
		else {
			throw new JuegoException("El movimiento no es válido para esa pieza");
		}
	}
}
