package com.ajedrez;

import java.util.Objects;

public class Posicion {

	private int columna, fila;

	public Posicion(int columna, int fila) throws JuegoException {
		if (1 <= columna && columna <= 8) {
			this.columna = columna;
		} else {
			throw new JuegoException("La columna debe estar entre el 1 y el 8");
		}
		if (1 <= fila && fila <= 8) {
			this.fila = fila;
		} else {
			throw new JuegoException("La fila debe estar entre el 1 y el 8");
		}
	}

	public Posicion(char columna, char fila) throws JuegoException {
		if ('A' <= columna && columna <= 'H') {
			this.columna = columna - 'A' + 1;
		} else {
			throw new JuegoException("La columna debe estar entra la A y la H");
		}
		if ('1' <= fila && fila <= '8') {
			this.fila = fila - '0' + 1;
		} else {
			throw new JuegoException("La fila debe estar entra el 1 y el 8");
		}
	}

	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}
}
