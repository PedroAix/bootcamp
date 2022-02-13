package com.ajedrez;

public class Juego {

	private Tablero tablero;
	private Color turno;
	private boolean partidaActiva = false;
	
	public Tablero getTablero() {
		return (Tablero)tablero.Clone();
	}
	
	
	public Color getTurno() throws JuegoException {
		if (partidaActiva) {
			return turno;
		}
		throw new JuegoException("La partida no está iniciada");
		
	}
	
	
	public void Inicializar() throws JuegoException {
		
		tablero.setPieza(1, 2, new Peon(Color.BLANCO));
		tablero.setPieza(2, 2, new Peon(Color.BLANCO));
		tablero.setPieza(3, 2, new Peon(Color.BLANCO));
		tablero.setPieza(4, 2, new Peon(Color.BLANCO));
		tablero.setPieza(5, 2, new Peon(Color.BLANCO));
		tablero.setPieza(6, 2, new Peon(Color.BLANCO));
		tablero.setPieza(7, 2, new Peon(Color.BLANCO));
		tablero.setPieza(8, 2, new Peon(Color.BLANCO));
		
		tablero.setPieza(1, 1, new Torre(Color.BLANCO));
		tablero.setPieza(2, 1, new Caballo(Color.BLANCO));
		tablero.setPieza(3, 1, new Alfil(Color.BLANCO));
		tablero.setPieza(4, 1, new Dama(Color.BLANCO));
		tablero.setPieza(5, 1, new Rey(Color.BLANCO));
		tablero.setPieza(6, 1, new Alfil(Color.BLANCO));
		tablero.setPieza(7, 1, new Caballo(Color.BLANCO));
		tablero.setPieza(8, 1, new Torre(Color.BLANCO));
		
		
		tablero.setPieza(1, 7, new Peon(Color.NEGRO));
		tablero.setPieza(2, 7, new Peon(Color.NEGRO));
		tablero.setPieza(3, 7, new Peon(Color.NEGRO));
		tablero.setPieza(4, 7, new Peon(Color.NEGRO));
		tablero.setPieza(5, 7, new Peon(Color.NEGRO));
		tablero.setPieza(6, 7, new Peon(Color.NEGRO));
		tablero.setPieza(7, 7, new Peon(Color.NEGRO));
		tablero.setPieza(8, 7, new Peon(Color.NEGRO));
		
		tablero.setPieza(1, 8, new Torre(Color.NEGRO));
		tablero.setPieza(2, 8, new Caballo(Color.NEGRO));
		tablero.setPieza(3, 8, new Alfil(Color.NEGRO));
		tablero.setPieza(4, 8, new Dama(Color.NEGRO));
		tablero.setPieza(5, 8, new Rey(Color.NEGRO));
		tablero.setPieza(6, 8, new Alfil(Color.NEGRO));
		tablero.setPieza(7, 8, new Caballo(Color.NEGRO));
		tablero.setPieza(8, 8, new Torre(Color.NEGRO));
		
		turno = Color.BLANCO;
		partidaActiva = true;
		
	}
	
	public void Jugada(String jugada) throws JuegoException {
		if(partidaActiva) {
			Movimiento movimiento = new Movimiento(jugada);
			Mover(movimiento);
		}
		else{
			throw new JuegoException("La partida no está iniciada");
		}
	}

	
	private void Mover(Movimiento movimiento) throws JuegoException {
		Pieza pieza = tablero.getPieza(movimiento.getPosIni());
		pieza.mover(movimiento, tablero);
		CambiaTurno();
	}
	
	private void CambiaTurno() {
		if (turno == Color.BLANCO) {
			turno = Color.NEGRO;
		}
		else
			turno = Color.BLANCO;
	}	
}
