package com.ajedrez;

public class Tablero {

	private Pieza[][] piezas = new Pieza[8][8];

	public Pieza getPieza(int columna, int fila) throws JuegoException {

		if (!esValido(columna) || !esValido(fila)) {
			throw new JuegoException("La columna o la fila no son válidas");
		}
		return piezas[columna][fila];
	}

	public Pieza getPieza(Posicion posicion) {

		int columna = posicion.getColumna();
		int fila = posicion.getFila();

		return piezas[columna][fila];
	}

	public void setPieza(int columna, int fila, Pieza pieza) throws JuegoException {
		if (!esValido(columna) || !esValido(fila)) {
			throw new JuegoException("La columna o la fila no son válidas");
		}
		if (pieza == null) {
			throw new IllegalArgumentException("Pieza es null");
		}

		if (HayPieza(columna, fila)) {
			if (piezas[columna][fila].getColor() != pieza.getColor()) {
				QuitaPieza(columna, fila);
				piezas[columna][fila] = pieza;
			} else {
				throw new JuegoException("La casilla está ocupada por una pieza de tu color");
			}

		} else {
			piezas[columna][fila] = pieza;
		}
	}

	public void setPieza(Posicion posicion, Pieza pieza) throws JuegoException {
		int columna = posicion.getColumna();
		int fila = posicion.getFila();
		setPieza(columna, fila, pieza);
	}

	private boolean esValido(int i) {
		return 1 <= i && i <= 8;
	}

	public boolean HayPieza(int columna, int fila) throws JuegoException {
		if (!esValido(columna) || !esValido(fila)) {
			throw new JuegoException("La columna o la fila no son válidas");
		}
		return piezas[columna][fila] != null;
	}

	public boolean HayPieza(Posicion posicion) {
		int columna = posicion.getColumna();
		int fila = posicion.getFila();

		return piezas[columna][fila] != null;
	}

	public void QuitaPieza(int columna, int fila) throws JuegoException {
		if (!esValido(columna) || !esValido(fila)) {
			throw new JuegoException("La columna o la fila no son válidas");
		}
		piezas[columna][fila] = null;
	}

	public void QuitaPieza(Posicion posicion) {

		int columna = posicion.getColumna();
		int fila = posicion.getFila();

		piezas[columna][fila] = null;
	}

	public void Mover(Movimiento movimiento) throws JuegoException {
		if (movimiento == null) {
			throw new IllegalArgumentException("Movimiento es null");
		}
		if (HayPieza(movimiento.getPosIni())) {
			setPieza(movimiento.getPosFin(), getPieza(movimiento.getPosIni()));
		} else
			throw new JuegoException("No hay pieza en la posición inicial");
	}

	public Object Clone() {
		return piezas.clone();
	}

	public Color ColorEscaque(int columna, int fila) throws JuegoException {
		if (!esValido(columna) || !esValido(fila)) {
			throw new JuegoException("La columna o la fila no son válidas");
		}
		else {
			if ((columna + fila + 1) % 2 == 0){
				return Color.BLANCO;
		}else 
			return Color.NEGRO;
		}
	}

	public boolean HayPiezasEntre(Movimiento movimiento) throws JuegoException {
		if (movimiento == null) {
			throw new IllegalArgumentException("El movimiento es null");
		}

		if (movimiento.esVertical() || movimiento.esHorizontal() || movimiento.esDiagonal()) {

			int columnaInicial = movimiento.getPosIni().getColumna();
			int columnaFinal = movimiento.getPosFin().getColumna();
			int filaInicial = movimiento.getPosIni().getFila();
			int filaFinal = movimiento.getPosFin().getFila();

			int columnaAuxiliar = columnaInicial;
			int filaAuxiliar = filaInicial;

			while (columnaInicial != columnaFinal && filaInicial != filaFinal) {

				columnaAuxiliar = columnaAuxiliar + movimiento.deltaColumna();
				filaAuxiliar = filaAuxiliar + movimiento.deltaFila();

				if (HayPieza(columnaAuxiliar, filaAuxiliar)) {
					return true;
				}
			}

		} else {
			throw new JuegoException("El movimiento no es válido");
		}
		return false;
	}
}
