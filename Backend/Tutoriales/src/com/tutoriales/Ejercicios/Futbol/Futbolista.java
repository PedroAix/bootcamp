package com.tutoriales.Ejercicios.Futbol;

public class Futbolista {

	private String nombre;
	private int dorsal;
	private Posicion posicion;
	private Equipo equipo;
	
	
	public Futbolista(String nombre, int dorsal, Posicion posicion, Equipo equipo) {
		
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.equipo = equipo;

	}
	
	public Futbolista(String nombre, int dorsal, int posicion, Equipo equipo) {
		
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.posicion = Posicion.getPosicionEnum(posicion);
		this.equipo = equipo;
	}
	
	
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Dorsal: " + dorsal + 
				", Posicion: " + posicion + ", Equipo: " + equipo;
	}


	public String getNombre() {
		return nombre;
	}
	
	public int getDorsal() {
		return dorsal;
	}


}
