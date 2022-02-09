package com.ajedrez;

public class Movimiento {

	private Posicion posIni, posFin;

	
	public Movimiento(String notacionInternacional) throws JuegoException {
		if(notacionInternacional == null || notacionInternacional.length()!= 4) {
			throw new IllegalArgumentException("No está en la notación internacional");
		}
		
		//NOTACION INTERNACIONAL: CFCF
		posIni = new Posicion(notacionInternacional.charAt(0),notacionInternacional.charAt(1));
		posFin = new Posicion(notacionInternacional.charAt(2),notacionInternacional.charAt(3));
	
		if (posIni.equals(posFin)) {
			throw new JuegoException("La posición inicial es la posición final");
		}
	}
	
	
	public Movimiento(Posicion posIni, Posicion posFin) throws JuegoException {
		
		if(posIni == null) {
			throw new IllegalArgumentException("La posición inicial es obligatoria");
		}
		if(posFin == null) {
			throw new IllegalArgumentException("La posición final es obligatoria");
		}
		
		if (posIni.equals(posFin)) {
			throw new JuegoException("La posición inicial es la posición final");
		}
		
		this.posIni = posIni;
		this.posFin = posFin;
	}

	public boolean esVertical() {
		
		return posIni.getColumna() == posFin.getColumna();
	}

	public boolean esHorizontal() {
		
		return posIni.getFila() == posFin.getFila();
	}

	public boolean esDiagonal() {
		return SaltoVertical() == SaltoHorizontal();
	}

	public int SaltoVertical() {//filainicial - filafinal (diferencia entre una y otra) 
		return Math.abs(posIni.getFila()-posFin.getFila());
	}

	public int SaltoHorizontal() { //columnainicial - columnafinal ("")
		return Math.abs(posIni.getColumna()-posFin.getColumna());
	}

	public int deltaFila() {// delta es lo que tengo que sumar para llegar a la posicion a chequear si hay pieza, 
		if(posIni.getFila()<posFin.getFila()) {
			return 1;
		}
		else if(posIni.getFila()==posFin.getFila()) {
			return 0;
		}
		else return -1;			
	}

	public int deltaColumna() {
		if(posIni.getColumna()<posFin.getColumna()) {
			return 1;
		}
		else if(posIni.getColumna()==posFin.getColumna()) {
			return 0;
		}
		else return -1;	
	}

	public Posicion getPosIni() {
		return posIni;
	}
	
	public Posicion getPosFin() {
		return posFin;
	}
}
