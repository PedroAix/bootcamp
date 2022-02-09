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
		return total;		  //calcularlo en la próxima iteración

	}
	
	
	//PRUEBAS JUNIT
	public static Double divide(double operando1, double operando2) {
		return operando1 / operando2;
	}

	public static int divide(int operando1, int operando2) {
		return operando1 / operando2;
	}
}
