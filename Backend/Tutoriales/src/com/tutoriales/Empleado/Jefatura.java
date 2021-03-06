package com.tutoriales.Empleado;

/*final*/ public class Jefatura extends Empleado implements Jefes {//Ejemplo de "herencia m?ltiple: hereda de una clase e implementa un interfaz
	//Con FINAL indicamos que otra clase no puede heredar de Jefatura
	
	
	//SI LO DEJAMOS VAC?O LLAMAMOS AL CONSTRUCTOR POR DEFECTO

	private double incentivo;
	
	
	public Jefatura(String nombre, double sueldo, int a?o, int mes, int dia) {
		
		super(nombre, sueldo, a?o, mes, dia);
		//Pasamos par?metros porque los constructores de la clase padre reciben par?metros.
		//Dependiendo de los par?metros que le pasemos, se llamar? a un constructor o a otro (De la clase padre)
		
	}
	
	public String tomaDecision (String decision) {
		return "Un miembro de la direcci?n ha tomado la decisi?n de: " + decision;
	}
	
	public double setBonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.bonusBase + gratificacion + prima;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	@Override
	public double getSueldoEmple() {
		//Cuando heredamos un m?todo de la clase padre y, por otro lado, creamos un m?todo que se llama igual
		//el m?todo hijo sobreescribe al m?todo de la clase padre (indicado con un triangulo verde)
		
		double sueldoJefe = super.getSueldoEmple();
		//Con super.metodo indicamos que vamos a llamar al m?todo padre y no al hijo
		return sueldoJefe + incentivo;
	}


}
