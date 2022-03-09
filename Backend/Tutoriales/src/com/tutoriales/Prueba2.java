package com.tutoriales;


public class Prueba2 {

	public static void main(String[] args) {
	
		Cuenta cuenta1 = new Cuenta("Pedro Aix Vinaroz", 2000);
		Cuenta cuenta2 = new Cuenta("Mariola Navarro Marín");
		
		System.out.println(cuenta1.toString());
		System.out.println();
		System.out.println(cuenta2.toString());
		
		cuenta1.retirarCantidad(2100);
		System.out.println(cuenta1.toString());
		cuenta1.ingresarCantidad(-4);
	}
	
	
}


class Cuenta {
	
	private String titular;
	private double cantidad;
	
	
	public Cuenta(String titular) {
		this.titular = titular;
	}
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	
	public void ingresarCantidad(double cantidad) {
		if (cantidad > 0) 
			this.cantidad += cantidad;
		else
			throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
	}
	
	public void retirarCantidad(double cantidad) {
		if (this.cantidad - cantidad < 0)
			this.cantidad = 0;
		
		else
			this.cantidad -= cantidad;
		
	}
	
	
	public String getTitular() {
		return titular;
	}
	
	public double getcantidad() {
		return cantidad;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setCantidad(double amount) {
		cantidad = amount;
	}
	
	@Override
	public String toString() {
		return "Titular: "+ titular + "\nCantidad: " + cantidad;
	}
}