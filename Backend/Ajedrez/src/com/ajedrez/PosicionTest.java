package com.ajedrez;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PosicionTest {
	Posicion posicion1, posicion2, posicion3;

	@Nested
	class Constructores {
		@Test
		void test_posicion_entero() {
			assertAll("P_Válida", 
					() -> assertEquals(1, new Posicion(1, 1).getColumna()),
					() -> assertEquals(1, new Posicion(1, 1).getFila()),
					() -> assertEquals(8, new Posicion(8, 8).getColumna()),
					() -> assertEquals(8, new Posicion(8, 8).getFila()),
					() -> assertEquals(4, new Posicion(4, 7).getColumna()),
					() -> assertEquals(7, new Posicion(4, 7).getFila()));
		}

		@Test
		void test_posicion_char() {
			assertAll("P_Válida", 
					() -> assertEquals(1, new Posicion('A', '7').getColumna()),
					() -> assertEquals(8, new Posicion('A', '7').getFila()),
					() -> assertEquals(8, new Posicion('H', '3').getColumna()),
					() -> assertEquals(4, new Posicion('H', '3').getFila()),
					() -> assertEquals(6, new Posicion('F', '2').getColumna()),
					() -> assertEquals(3, new Posicion('F', '2').getFila()));
		}

		@Test
		void test_posicion_int_fallo() {
			assertAll("P_noVálida",
					() -> assertThrows(JuegoException.class, () -> new Posicion(0, 7)),
					() -> assertThrows(JuegoException.class, () -> new Posicion(2, 9)),
					() -> assertThrows(JuegoException.class, () -> new Posicion(0, 2)),
					() -> assertThrows(JuegoException.class, () -> new Posicion(8, 9)));
		}

		@Test
		void test_posicion_char_fallo() {
			assertAll("P_noVálida",
					() -> assertThrows(JuegoException.class, () -> new Posicion('K', '5')),
					() -> assertThrows(JuegoException.class, () -> new Posicion('H', '9')),
					() -> assertThrows(JuegoException.class, () -> new Posicion('A', '0')),
					() -> assertThrows(JuegoException.class, () -> new Posicion('b', '4')));
		}

		@Test
		void test_igual() throws JuegoException {
			posicion1 = new Posicion(6, 3);
			posicion2 = new Posicion('F', '2');
			posicion3 = new Posicion(8, 2);
			assertAll("Compara", 
					() -> assertTrue(posicion1.equals(posicion2)),
					() -> assertTrue(posicion2.equals(posicion1)), 
					() -> assertFalse(posicion3.equals(posicion1)),
					() -> assertFalse(posicion2.equals(posicion3)));

		}
	}
}
