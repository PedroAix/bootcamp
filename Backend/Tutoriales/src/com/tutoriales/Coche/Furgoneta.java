package com.tutoriales.Coche;

public class Furgoneta extends Coche{
	//HERENCIA
	//Furgoneta se convierte en subclase (o clase hijo/a), hereda de la clase Coche
	//Coche se convierte en superclase (o clase padre)
	//Furgoneta va a heredar todas las caracter�sticas y m�todos de Coche, m�s los suyos propios

	//REGLA PARA EL DISE�O DE HERENCIA: Preguntar: �clase_hijo es un clase_abuelo?
										//EJ: Coche es un veh�culo (s�) Furgoneta es un venh�culo (s�), Moto es un veh�culo(?)...
	
	//NO EXISTE LA HERENCIA M�LTIPLE, pero a cambio dispone de INTERFACES
	
	
	private double capacidadCarga;
	private int plazasExtra;
	
	
	public Furgoneta(int plazasExtra, double capacidadCarga) {
		
		super();
		//super llama al constructor de la clase padre (Coche)
		//Entrar� dentro del construtor Coche e inicializar� las variables (atributos)
		//Como el constructor padre no recibe par�metros dejamos super() sin pasarle par�metros
		
		this.plazasExtra = plazasExtra;
		this.capacidadCarga = capacidadCarga;
		
	}
	
	public String getDatosFurgoneta() {
		return "La capacidad de carga es: " + capacidadCarga + " kg\nLas plazas"
				+ " son: " + plazasExtra;
	}
	
	
	
}
