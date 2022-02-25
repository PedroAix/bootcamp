package com.tutoriales.Tallas;

public enum Talla {// ENUMERADO: Almacenar solo y exclusivamente determinados valores

	//Ejemplo de enumerado sencillo:
//	PEQUE�O, MEDIANO, GRANDE, MUY_GRANDE

	// Los enumerados pueden admitir tambi�n valores:
	PEQUE�O("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

	private String abreviatura;

	// Los enumerados permiten la creaci�n de getters, setters y constructores
	// Como en los enumerados NO SON INSTANCIABLES, es decir, no se puede invocar a un constructor, �stos deben ser
	// privados para que no sean invocados desde fuera
	
	//En el constructor, abreviatura hace referencia a los valores del enumerado (S,M,L,XL)
	private Talla(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	
	
	//Los m�todos deben ser publicos para usarlos en otras clases
	public String getAbreviatura() {
		return abreviatura;
	}
	
	//Este m�todo lo he decidido poner static para convertirlo en un m�todo de clase y as� llamarlo
	//mediante el nombre de la clase, ya que va a recibir como par�metro un dato tipo String
	public static Talla getTalla(String abreviatura) {

		switch (abreviatura) {
		case "S": return Talla.PEQUE�O;
		case "M": return Talla.MEDIANO;
		case "L": return Talla.GRANDE;
		case "XL": return Talla.MUY_GRANDE;
		default:
			throw new IllegalArgumentException("Unexpected value: " + abreviatura);
		}

	}
}
