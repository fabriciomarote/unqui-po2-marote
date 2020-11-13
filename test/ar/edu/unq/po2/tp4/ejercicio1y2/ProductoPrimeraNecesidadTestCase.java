package ar.edu.unq.po2.tp4.ejercicio1y2;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.ejercicio1y2.ProductoPrimeraNecesidad;

class ProductoPrimeraNecesidadTestCase {
    
	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
	}
	
	@Test
	void test() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}

}
