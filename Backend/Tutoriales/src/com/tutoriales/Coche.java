package com.tutoriales;

public class Coche {

	private int ruedasCoche, largoCoche, 
			anchoCoche, motorCoche, pesoCoche, pesoTotalCoche;
	private String colorCoche;
	private boolean asientosCuero, climatizador;

	
	public Coche() {
		ruedasCoche = 4;
		largoCoche = 2000;
		anchoCoche = 100;
		motorCoche = 1600;
		pesoCoche = 300;
	}
	
	public String getDatos() {
		return "La plataforma del vehículo tiene " + ruedasCoche
				+ " ruedas\nMide " + largoCoche/100 + " metros\n"
						+ "Tiene un ancho de " + anchoCoche/100 +
						" metros";
	}
	
	public String getLargo() {
		return "Largo del coche: " + largoCoche + " cm";
	}
	
	public int getRuedas() {//GETTER, DEVUELVE UN VALOR CUANDO ES PRIVATE
		return ruedasCoche;
	}
	
	public String getColor() {
		return "Color del coche: " + colorCoche;	
	}
	
	public String getAsientos(){
		if(asientosCuero) {
			return "El coche tiene asientos de cuero";
		}
		return "El coche tiene asientos de serie";
	}
	
	public void setRuedas(int valor) {//SETTER, ESTABLECE UN VALOR CUANDO ES PRIVATE
		ruedasCoche = valor;
	}
	
	public void setColor(String color) {
		colorCoche = color;
	}
	
	public void setAsientos(String asientosCuero) {
		if (asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		}
		else {
			this.asientosCuero = false;
		}
		 //EL OPERADOR THIS SE USA CUANDO Lthis.asientosCuero = asientosCuero;A VARIABLE DE CLASE
											//TIENE EL MISMO NOMBRE QUE LA VARIABLE DEL PARÁMETRO.
											//CON EL THIS INDICAMOS LA VARIABLE DE LA CLASE
	}
	
	
}
