package com.tutoriales.Empleado;

public interface Jefes extends Trabajadores {//Una interfaz dice qu� tiene que hacer, pero no el c�mo
	//	INTERFACES:
	//Solo pueden tener m�todos abstractos y constantes, pero no variables
	//Al igual que las clases, las interfaces se guardan en un fichero .class
	//No se pueden instanciar
	//Todos los m�todos son publicos y abstractos (si no se ponen se dan por hecho que lo son por defecto)
	//Al haber m�todos abstractos estamos obligados a sobreescibir dichos m�todos (igual que una clase abstracta)
	
	//Determinan el comportamiento de aquellas clases que van a implementar esa interfaz
	//Suelen aparecer en cursiva en los diagramas
	//MUY PARECIDAS A LAS CLASES ABSTRACTAS
	//DIFERENCIA: No pueden haber m�todos normales (todos son abstractos) 
	//DIFERENCIA: Permiten la herencia m�ltiple (heredar una o varias interfaces, ya que en Java no se pueden hacer varios extends seguidos, pero s� implements)
	
	
	
	public abstract String tomaDecision(String decision);

	
}
