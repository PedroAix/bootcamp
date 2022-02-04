package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class JuegoTest {
	Juego juego;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		juego = new Juego();
		juego.num_aleatorio = 50;
	}

	@Test
	void test_Constructor() {
		assertNotNull(new Juego());
	}

	
	@Nested
	class jugadas {
		@Test
		void test_es_igual() {
			juego.jugada(50);
			assertAll("Jugada",
			() -> assertEquals("CORRECTO!",juego.getMessage()),
			() -> assertTrue(juego.getTerminado()),
			() -> assertEquals(1,juego.getIntento()));
		}
		
		@Test
		void test_es_mayor() {
			juego.jugada(51);
			assertAll("Jugada",
			() -> assertEquals("**INCORRECTO**\nEl número es más pequeño",juego.getMessage()),
			() -> assertFalse(juego.getTerminado()),
			() -> assertEquals(2,juego.getIntento()));
		}
		
		@Test
		void test_es_menor() {
			juego.jugada(49);
			assertAll("Jugada",
			() -> assertEquals("**INCORRECTO**\nEl número es más grande",juego.getMessage()),
			() -> assertFalse(juego.getTerminado()),
			() -> assertEquals(2,juego.getIntento()));
		}
	}
	
	
	
	
//	@Test
//	void testJugada() {
//		
//		
//	}
//
//	@Test
//	void testGetMessage() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetTerminado() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetIntento() {
//		fail("Not yet implemented");
//	}

}
