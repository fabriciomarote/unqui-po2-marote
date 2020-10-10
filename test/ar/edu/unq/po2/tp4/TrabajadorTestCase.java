package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {

	private Trabajador trabajador;
	private IngresoImponible ingresoImponible;
	private IngresoPorHorasExtras ingresoPorHorasExtras;
	
	@BeforeEach
	public void setUpo() {
		trabajador = new Trabajador();
		ingresoImponible = new IngresoImponible(3, "Sueldo", 30000d);
		ingresoPorHorasExtras = new IngresoPorHorasExtras(3, "Sueldo", 10000d, 10);
		trabajador.agregarIngreso(ingresoImponible);
		trabajador.agregarIngreso(ingresoPorHorasExtras);
	}
	
	@Test
	public void testVerificarElMontoTotaPercibidoPorElTrabajador() {
		assertEquals(30000, trabajador.getTotalPercibido());
	}

	@Test
	public void testVerificarElMontoImponible() {
		assertEquals(30000, trabajador.getMontoImponible());
	}
	
	@Test
	public void testVerificarElValorDeLosImpuestosAPagar() {
		assertEquals(600, trabajador.getImpuestoAPagar());
	}
}