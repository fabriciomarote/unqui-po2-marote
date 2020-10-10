package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {

	private Agencia agencia;
	
	private Stock stock;
	private Caja caja1;
	private Producto leche;
	private Producto pan;
	private Producto azucar;
	private Producto papel;
	private Producto facturaLuz;
	private Producto impuesto;
	
	@BeforeEach
	public void setUp() {
		stock = new Stock();
		
		caja1 = new Caja(agencia, stock);
		leche = new ProductoTradicional(60d);
		pan = new ProductoTradicional(30d);
		azucar = new ProductoTradicional(50d);
		papel = new ProductoCooperativa(55d);
		facturaLuz = new Servicio(30d, 600);
		impuesto = new Impuesto(50d);
		stock.agregarProducto(leche, 3);
		stock.agregarProducto(azucar, 8);
		stock.agregarProducto(pan, 5);
		stock.agregarProducto(papel, 3);
		
	}
	
	@Test
	void testVerificarConstructor() {
		assertEquals(agencia, caja1.getAgencia());
		assertEquals(stock, caja1.getStock());
		assertEquals(0, caja1.getMontoAPagar());
	}
	
	@Test
	public void testVerificarMontoAPagarLuegoDeCompra() {
		caja1.registrar(leche);
		caja1.registrar(pan);
		caja1.registrar(azucar);
		
		assertEquals(135d, caja1.getMontoAPagar());
	}
	
	@Test
	public void testVerificarMontoAPagarLuegoDeFinalizadaLaCompra() {
		caja1.registrar(leche);
		caja1.registrar(pan);
		caja1.registrar(azucar);
		caja1.finalizarCompra();
		
		assertEquals(0d, caja1.getMontoAPagar());
	}
	
	

}
