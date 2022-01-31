package com.capgemini;

public class Calculadora {
	private double total = 0.0;

	public double calculo(double operando, char operador) {
		switch (operador) {
		case '+':
			total += operando;
			break;
		case '-':
			total -= operando;
			break;
		case '*':
			total *= operando;
			break;
		case '=':
			total += operando;
		}
		
		return total;

	}

}
