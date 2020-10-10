package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {

	private ArrayList<Integer> enteros = new ArrayList<Integer>();
	private Multioperador multioperador;
	
	@BeforeEach
	  void setUp() throws Exception {
		
		multioperador = new Multioperador(enteros);
		
		//Agrego al ArrayList 10 numeros.
		
    	  enteros.add(1);
    	  enteros.add(2);
    	  enteros.add(3);
    	  enteros.add(4);
    	  enteros.add(5);
    	  enteros.add(6);
    	  enteros.add(7);
    	  enteros.add(8);
    	  enteros.add(9);
    	  enteros.add(10);
	}
	
	@Test
	void testSumaTotal() {
		assertEquals(55, multioperador.sumaTotal());
	}
	
	@Test
	void testRestaTotal() {
		assertEquals(-53, multioperador.restaTotal());
	}
	
	@Test
	void testMultiplicacionTotal() {
		assertEquals(3628800, multioperador.multiplicacionTotal());
	}
}