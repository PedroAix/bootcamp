package com.example;

public class CalculadoraCientifica extends Calculadora implements Grafico {
	public CalculadoraCientifica() {
		this(0);
	}
	public CalculadoraCientifica(int i) {
		super(i);
	}
	
	public double divide(double a, double b) {
		return a / b;
	}
	
	
	
	//@Override
	public int suma(int a, int b) {
		return a - b;
	}
	
	
	private int contador = 0;
	
	public void inicializa(int contador) {
		this.contador = contador;
//		otro.registra(this)
	}
}
