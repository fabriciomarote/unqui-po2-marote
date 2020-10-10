package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {

	private Rectangulo rectangulo;
	private Punto punto;
	
	@BeforeEach
	public void setUp() throws Exception {
		punto = new Punto();
		rectangulo = new Rectangulo(5,10);
	}
	
	@Test
	public void testValidarConstructorEsquinaSuperiorIzquierda() {
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getX(),5);
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getY(),10);
	}

	@Test
	public void testValidarConstructorEsquinaSuperiorDerecha() {
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getX(),5);
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getY(),10);
	}
	
	@Test
	public void testValidarConstructorEsquinaInferiorDerecha() {
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getX(),5);
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getY(),0);
	}
	
	@Test
	public void calculoDeArea() {
		assertEquals(rectangulo.area(),50);
	}
	
	@Test
	public void calculoDePerimetro() {
		assertEquals(rectangulo.perimetro(),30);
	}
	
	@Test
	public void elRectanguloCosntruidoEsVertical() {
		assertFalse(rectangulo.esHorizontal());
		assertTrue(rectangulo.esVertical());
	}
}
