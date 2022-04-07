package com.bootcamp.JuegoNumero;

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
		juego.numeroAleatorio = 50;
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
			assertAll("Jugada", () -> assertEquals("CORRECTO!", juego.getMessage()),
					() -> assertTrue(juego.getTerminado()), () -> assertEquals(1, juego.getIntento()));
		}

		@Test
		void test_es_mayor() {
			juego.jugada(51);
			assertAll("Jugada", () -> assertEquals("**INCORRECTO**\nEl número es más pequeño", juego.getMessage()),
					() -> assertFalse(juego.getTerminado()), () -> assertEquals(2, juego.getIntento()));
		}

		@Test
		void test_es_menor() {
			juego.jugada(49);
			assertAll("Jugada", () -> assertEquals("**INCORRECTO**\nEl número es más grande", juego.getMessage()),
					() -> assertFalse(juego.getTerminado()), () -> assertEquals(2, juego.getIntento()));
		}

		@Test
		void test_mensaje_intentos_maximo() {
			for (int i = 0; i < 10; i++) { // PARA AUMENTAR EL NÚMERO DE INTENTOS
				juego.jugada(49);
			}
			assertAll("Jugada",
					() -> assertEquals("**INCORRECTO**\nTe has quedado sin intentos!\nEl número secreto era: 50",
							juego.getMessage()),
					() -> assertTrue(juego.getTerminado()), () -> assertEquals(11, juego.getIntento()));
		}
	}
}
