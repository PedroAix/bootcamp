package com.tutoriales;


public class Prueba {
	
	public static void main (String[] args) {
	
		Wolf l = new Wolf();
		
		System.out.println(l.makeNoise(false));
		
		
	}
	
	
	
}


class Dog { 
    String makeNoise(boolean isAngry) { 
        if (isAngry) { 
            return "Grrrrr!"; 
        } else { 
            return "Woof!"; 
        } 
    } 
} 
 
class Wolf extends Dog { 
	@Override 
    String makeNoise(boolean isAngry) { 
        if (isAngry) { 
            return "Grrrrr!"; 
        } else { 
            return "Aaoouuuuuuuu!"; 
        } 
    } 
}
