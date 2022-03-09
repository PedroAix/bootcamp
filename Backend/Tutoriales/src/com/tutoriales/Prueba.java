package com.tutoriales;


public class Prueba {
	public static void main(String[] args) {
		
		Meses mes1 = Meses.JULIO;
		System.out.println(mes1);
		System.out.println("Numero: " + mes1.getNumeroMes());
		
		System.out.println("----------------------------------------");
		
		int mes2 = 3;
		System.out.println(Meses.getNombreMes(mes2));
		 
		 
		
		
	}

	enum Meses {
		ENERO(1), FEBRERO(2), MARZO(3), ABRIL(4), MAYO(5), JUNIO(6), JULIO(7), AGOSTO(8), 
		SEPTIEMBRE(9), OCTUBRE(10), NOVIEMBRE(11), DICIEMBRE(12);
		
		private int numeroMes;
		
		
		private Meses(int numeroMes) {
			this.numeroMes = numeroMes;
		}
		
		
		
		public int getNumeroMes() {
			
			return numeroMes;
		}
		
		public static Meses getNombreMes(int numeroMes) {
			switch(numeroMes) {
			case 1: return Meses.ENERO;
			case 2: return Meses.FEBRERO;
			case 3: return Meses.MARZO;
			case 4: return Meses.ABRIL;
			case 5: return Meses.MAYO;
			case 6: return Meses.JUNIO;
			case 7: return Meses.JULIO;
			case 8: return Meses.AGOSTO;
			case 9: return Meses.SEPTIEMBRE;
			case 10: return Meses.OCTUBRE;
			case 11: return Meses.NOVIEMBRE;
			case 12: return Meses.DICIEMBRE;
			default:
				throw new IllegalArgumentException("Numero de mes no válido");
			}
			
		}
		
		
		
	}
}
