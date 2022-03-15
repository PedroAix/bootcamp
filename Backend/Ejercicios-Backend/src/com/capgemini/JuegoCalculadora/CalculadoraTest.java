package com.capgemini.JuegoCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
		@Test
		void divide_enterosOK() {
			assertEquals(1,Calculadora.divide(3, 2));
		}
		
		@Test
		void divide_por_0_enteros() {
			assertEquals(0,Calculadora.divide(3, 0));
		}
		
		@Test
		void divide_con_decimales_OK() {
			assertEquals(1.5,Calculadora.divide(3.0, 2.0));
		}
		
		@Test
		void divide_por_0_con_decimales() {
			assertEquals(0,Calculadora.divide(3.0, 0));
		}
	}

