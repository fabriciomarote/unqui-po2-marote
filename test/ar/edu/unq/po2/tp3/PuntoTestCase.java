package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTestCase {

	private Punto punto1;
	private Punto punto2;
	private Punto punto3;
	
	@BeforeEach
	 void setUp() throws Exception {
		punto1 = new Punto(5,5);
		punto2 = new Punto(3,7);
		punto3 = new Punto();
	}

	@Test
	void testNuevoPunto() {
		assertEquals(0, punto3.getX());
		assertEquals(0,punto3.getY());
	}

	@Test
	void testMoverPunto() {
		punto2.moverPunto(5, 8);
		assertEquals(5, punto3.getX());
		assertEquals(8,punto3.getY());
	}
	
	@Test
	void testSumarPuntos() {
		punto1.sumarPuntos(punto2);
		assertEquals(8, punto1.getX());
		assertEquals(12,punto1.getY());
	}
}