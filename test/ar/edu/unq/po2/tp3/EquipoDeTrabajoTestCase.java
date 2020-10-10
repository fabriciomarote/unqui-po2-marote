package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
    
	private EquipoDeTrabajo equipoDeTrabajo;
	
	private Persona persona1;
	private Persona persona2;
	private Persona persona3;
	private Persona persona4;
	private Persona persona5;
	
	@BeforeEach
	void setUp() throws Exception {
		equipoDeTrabajo = new EquipoDeTrabajo("nombre");
		
		persona1 = new Persona("Maria", LocalDate.of(1990,1,9));
		persona2 = new Persona("Jose", LocalDate.of(1995,10,7));
		persona3 = new Persona("Pedro", LocalDate.of(1990,3,4));
		persona4 = new Persona("Ana", LocalDate.of(1985,6,2));
		persona5 = new Persona("Patricia", LocalDate.of(2000,1,1));
		
		// Agrego al ArrayList 5 personas
		
		equipoDeTrabajo.agregarIntegrante(persona1);
		equipoDeTrabajo.agregarIntegrante(persona2);
		equipoDeTrabajo.agregarIntegrante(persona3);
		equipoDeTrabajo.agregarIntegrante(persona4);
		equipoDeTrabajo.agregarIntegrante(persona5);
	}
	
	@Test
	void testPromedioEdadDeIntegrantes() {
		assertEquals(28, equipoDeTrabajo.promedioEdadDeIntegrantes());
	}
}