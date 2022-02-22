package com.tutoriales.Empleado;

/*final*/ public class Jefatura extends Empleado {//Con FINAL indicamos que otra clase no puede heredar de Jefatura
	
	
	//SI LO DEJAMOS VACÍO LLAMAMOS AL CONSTRUCTOR POR DEFECTO

	private double incentivo;
	
	
	public Jefatura(String nombre, double sueldo, int año, int mes, int dia) {
		
		super(nombre, sueldo, año, mes, dia);
		//Pasamos parámetros porque los constructores de la clase padre reciben parámetros.
		//Dependiendo de los parámetros que le pasemos, se llamará a un constructor o a otro (De la clase padre)
		
		
		
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	@Override
	public double getSueldoEmple() {
		//Cuando heredamos un método de la clase padre y, por otro lado, creamos un método que se llama igual
		//el método hijo sobreescribe al método de la clase padre (indicado con un triangulo verde)
		
		double sueldoJefe = super.getSueldoEmple();
		//Con super.metodo indicamos que vamos a llamar al método padre y no al hijo
		return sueldoJefe + incentivo;
	}


}
