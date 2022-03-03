package com.tutoriales.Empleado;

public interface Trabajadores {
	
	public abstract double setBonus(double gratificacion);
	public final static double bonusBase = 1500;
	
	//POR DEFECTO LOS MÉTODOS Y CONSTANTES EN UNA INTERFAZ TIENEN SIEMPRE ESTOS MODIFICADORES
}
