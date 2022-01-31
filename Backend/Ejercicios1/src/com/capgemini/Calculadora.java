package com.capgemini;

public class Calculadora {
	private double total = 0.0;

	public double calculo(double operando, char operador) {
		switch (operador) {
		case '+':
			total = total + operando;
			break;
		case '-':
			total = total - operando;
			break;
		case '*':
			total = total * operando;
			break;
		}
		
		return total;

	}

}
