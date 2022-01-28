package com.example;

public class Principal {
	
	/**
	 * 
	 * @param args LISTA DE ARGUMENTOS
	 * @return 0 SI TERMINA BIEN
	 */
		
	public static void main(String[] args) {
		Object o;
		
		Factura f = new Factura(1);
		f.addLinea("Comida", 1, 9.0);
		if(f.getEstado() == Factura.Estado.PENDIENTE) {
			f.cancelar();
		}
		f.guardar();
		
		
		Grafico grafico = f;
		
		grafico.pintate();
		if (f instanceof Factura)
			((Factura)grafico).addLinea("Comida", 1, 9.0);
		
		if(o instanceof Grafico)
			((Grafico)o).pintate();
		
	}
	
	
	public static void ejemplos2(String[] args) {
		//	System.out.println("Hello World");
		//	Dias dia = Dias.DOMINGO;
		//	System.out.println(dia);
			
		Calculadora c = Calculadora.getCurrent();
		//System.out.println(c.avg());
		System.out.println(c.avg(5));
		System.out.println(c.avg(1,2,3,4,5));
		
		double i = Calculadora.suma(0, 0.0);
		CalculadoraCientifica cc = new CalculadoraCientifica();
		System.out.println(c.suma(5, 6));
		System.out.println("Elimino");
		cc = null;
		cc = new CalculadoraCientifica();
		System.out.println(cc.suma(1, 1));
		
		}

}
