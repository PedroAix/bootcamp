package com.ajedrez;

public class Tablero {

	Pieza[][] piezas = new Pieza[8][8];
	

	public Pieza getEscaque(int fila, int columna) {
		return null;
	}
	
	
	public Pieza getEscaque(Posicion posicion) {
		return null;
	}
	
	private boolean esValido(int i) {
		return true;
	}
	
	public boolean HayPieza(int fila, int columna) {
		return true;
	}
	
	public boolean HayPieza(Posicion posicion) {
		return true;
	}
	
	public void QuitaPieza(int fila, int columna) {
	}
	
	public void QuitaPieza(Posicion posicion) {
	}
	
	public void Mover(Movimiento movimiento) {
		
	}
	
	public Object Clone() {
		return null;
	}
	
	public Color ColorEscaque(int fila, int columna) {
		return;
	}
	
	public boolean HayPiezasEntre(Movimiento movimiento) {
		return true;
	}
	
	
}
