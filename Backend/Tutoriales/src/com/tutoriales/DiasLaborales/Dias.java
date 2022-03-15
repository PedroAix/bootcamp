package com.tutoriales.DiasLaborales;

public class Dias {

	public static void main(String[] args) {
		DiasLaborales d = DiasLaborales.JUEVES;
		
		int i = d.getValue();
		System.out.println(i);
		
		 d = DiasLaborales.getEnum(1);
		 System.out.println(d);
	}

}
