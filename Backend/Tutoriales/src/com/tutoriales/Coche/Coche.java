package com.tutoriales.Coche;


public class Coche {

	private int ruedasCoche, largoCoche, anchoCoche, motorCoche, pesoCoche, pesoTotalCoche;
	private String colorCoche;
	private boolean asientosCuero, climatizador;
	//Si los atributos de clase fueran public podría modificar
	//su valor al instanciar la clase Coche (coche.ruedasCoche=2000)
	//Encapsulandolas nos aseguramos de modificarlas a través de los métodos
	
	
	public Coche() {
		ruedasCoche = 4;
		largoCoche = 2000;
		anchoCoche = 100;
		motorCoche = 1600;
		pesoCoche = 300;
	}

	public String getDatos() {
		return "El color del coche es " + colorCoche + "\nLa plataforma del vehículo tiene " + ruedasCoche + " ruedas\nMide " + largoCoche / 100 + " metros\n"
				+ "Tiene un ancho de " + anchoCoche / 100 + " metros";
	}

	public String getLargo() {
		return "Largo del coche: " + largoCoche + " cm";
	}

	public int getRuedas() {// GETTER, DEVUELVE UN VALOR CUANDO ES PRIVATE
		return ruedasCoche;
	}

	public String getColor() {
		return "Color del coche: " + colorCoche;
	}

	public String getAsientos() {
		if (asientosCuero) {
			return "El coche tiene asientos de cuero";
		}
		return "El coche tiene asientos de serie";
	}
	
	public String getClimatizador() {
		if (climatizador) {
			return "El coche tiene climatizador";
		}
		else return "El coche tiene aire acondicionado";
	}

	public void setRuedas(int valor) {// SETTER, ESTABLECE UN VALOR CUANDO ES PRIVATE
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
		/**
		  * EL OPERADOR THIS SE USA CUANDO LA VARIABLE DE CLASE TIENE EL MISMO NOMBRE 
		  * QUE LA VARIABLE DEL PARÁMETRO.
		  * CON EL THIS INDICAMOS CUÁL ES LA VARIABLE DE LA CLASE
		  */
	
	}
	
	public void setClimatizador(String climatizador) {
		
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}
		else this.climatizador = false;
	}
	
	public String getsetpesoCoche() { //SETTER + GETTER NO RECOMENDADO, MEJOR DIVIDIR EN SETTER Y GETTER
		int pesoCarroceria = 500;
		
		pesoTotalCoche = pesoCoche + pesoCarroceria;
		if (asientosCuero) {
			pesoTotalCoche += 50;
		}
		
		if (climatizador) {
			pesoTotalCoche += 20;
		}
		return "El peso del coche es: " + pesoTotalCoche;
		
	}
	
	public int getPrecio() {
		
		int precioFinal = 10000;
		
		if (asientosCuero) {
			precioFinal += 200; 
		}
		if (climatizador){
			precioFinal += 1500;
		}
	
		return precioFinal;
	}
	
}
