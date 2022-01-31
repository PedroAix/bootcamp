package com.capgemini;

public class Calculadora {
	private double total = 0.0;
	private char pendiente = '+'; //Variable que guarda el operador
	public double calculo(double operando, char operador) {
		switch (pendiente) {
		case '+':
			total += operando;
			break;
		case '-':
			total -= operando;
			break;
		case '*':
			total *= operando;
			break;
		case '/':
			total /= operando;
			break;
		case '=':
			total += operando;
		}
		pendiente = operador; //El actual operador lo asignamos a pendiente para  
		return total;		  //calcularlo en la pr�xima iteraci�n

	}

}
