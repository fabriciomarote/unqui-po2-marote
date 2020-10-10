package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {

	private ArrayList<Integer> enteros = new ArrayList<Integer>();
    private Counter counter;
	
	@BeforeEach
	 void setUp() throws Exception {
	    // Creo un ArrayList vacía e inicializo la variable 
	    // de instancia previamente definida.
	    counter = new Counter(enteros);
		
		// Agrego al ArrayList 7 numeros.	
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
	void testCantDePares() {
		assertEquals(5, counter.cantDePares());	
	}

	@Test
	void testCantDeImpares() {
		assertEquals(5, counter.cantDeImpares());	
	}

	@Test
	void testCantDeMultiplosDe() {
		assertEquals(2, counter.cantDeMultiploDe(4));	
	}
}