package com.tutoriales.Coche;

public class Furgoneta extends Coche{
	//HERENCIA
	//Furgoneta se convierte en subclase (o clase hijo/a), hereda de la clase Coche
	//Coche se convierte en superclase (o clase padre)
	//Furgoneta va a heredar todas las características y métodos de Coche, más los suyos propios

	//REGLA PARA EL DISEÑO DE HERENCIA: Preguntar: ¿clase_hijo es un clase_abuelo?
										//EJ: Coche es un vehículo (sí) Furgoneta es un venhículo (sí), Moto es un vehículo(?)...
	
	//NO EXISTE LA HERENCIA MÚLTIPLE, pero a cambio dispone de INTERFACES
	
	
	private double capacidadCarga;
	private int plazasExtra;
	
	
	public Furgoneta(int plazasExtra, double capacidadCarga) {
		
		super();
		//super llama al constructor de la clase padre (Coche)
		//Entrará dentro del construtor Coche e inicializará las variables (atributos)
		
		this.plazasExtra = plazasExtra;
		this.capacidadCarga = capacidadCarga;
		
	}
	
	public String getDatosFurgoneta() {
		return "La capacidad de carga es: " + capacidadCarga + " kg\nLas plazas"
				+ " son: " + plazasExtra;
	}
	
	
	
}
