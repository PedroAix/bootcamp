package com.tutoriales.Empleado;

public interface Jefes extends Trabajadores {//Una interfaz dice qué tiene que hacer, pero no el cómo
	//	INTERFACES:
	//Solo pueden tener métodos abstractos y constantes, pero no variables
	//Al igual que las clases, las interfaces se guardan en un fichero .class
	//No se pueden instanciar
	//Todos los métodos son publicos y abstractos (si no se ponen se dan por hecho que lo son por defecto)
	//Al haber métodos abstractos estamos obligados a sobreescibir dichos métodos (igual que una clase abstracta)
	
	//Determinan el comportamiento de aquellas clases que van a implementar esa interfaz
	//Suelen aparecer en cursiva en los diagramas
	//MUY PARECIDAS A LAS CLASES ABSTRACTAS
	//DIFERENCIA: No pueden haber métodos normales (todos son abstractos) 
	//DIFERENCIA: Permiten la herencia múltiple (heredar una o varias interfaces, ya que en Java no se pueden hacer varios extends seguidos, pero sí implements)
	
	
	
	public abstract String tomaDecision(String decision);

	
}
