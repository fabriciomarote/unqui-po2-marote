package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class IndividuoTest {

	private Individuo individuo1;
	private Individuo individuo2;
	
	@BeforeEach
	void setUp() throws Exception {
		individuo1 = new Individuo("Marcelo", LocalDate.of(2003,1,9));
		individuo2 = new Individuo("Carlos", LocalDate.of(1982,12,6));

	}
	
	@Test
	void testEdad() {
		assertEquals(17, individuo1.edad());
	}

	@Test
	void testMenorQue() {
		assertTrue(individuo1.menorQue(individuo2));
	}
}
