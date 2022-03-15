package com.tutoriales.DiasLaborales;

public enum DiasLaborales {
	LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5);
	
	
	private int value;
	
	
	private DiasLaborales(int value){
		this.value = value;
	}
	
	
	public int getValue() {
		return value;
	}
	
	
	public static DiasLaborales getEnum(int value) {
		switch (value) {
		case 1: return DiasLaborales.LUNES;
		case 2: return DiasLaborales.MARTES;
		case 3: return DiasLaborales.MIERCOLES;
		case 4: return DiasLaborales.JUEVES;
		case 5: return DiasLaborales.VIERNES;
		default:
			throw new IllegalArgumentException("Unexpected value: " + value);
		}
	}
}
