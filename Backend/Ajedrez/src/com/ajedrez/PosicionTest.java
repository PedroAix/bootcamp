package com.ajedrez;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PosicionTest {
	Posicion posicion;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		posicion = new Posicion(1,9);
		posicion = new Posicion('A','1');
	}

	@Test
	void test_Constructor() {
		assertNotNull(new Juego());
		
		@ParameterizedTest(name = "{displayName} => {0} de {1}")
		@CsvSource(value = {"1,9","1,8","'A',"})
		
		
		
		
	}
}
