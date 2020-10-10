package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StockTestCase {

    private Agencia agencia;
	
	private Stock stock;
	private Caja caja1;
	private Caja caja2;
	private Producto azucar;
	private Producto pan;
	private Producto leche;
	private Producto papel;
	private Producto facturaLuz;
	private Producto impuesto;
	
	@BeforeEach
	public void setUp() {
		stock = new Stock();
		
		caja1 = new Caja(agencia,stock);
		azucar = new ProductoTradicional(55d);
		pan = new ProductoTradicional(30d);
		leche = new ProductoTradicional(60d);
		papel = new ProductoCooperativa(55d);
		facturaLuz = new Servicio(30d, 600);
		impuesto = new Impuesto(50d);
		stock.agregarProducto(leche, 3);
		stock.agregarProducto(azucar, 10);
		stock.agregarProducto(pan, 5);
		stock.agregarProducto(papel, 3);
	}
	
	@Test
	public void testVerificarStock() {
		caja1.registrar(leche);
		caja1.registrar(leche);
		caja1.registrar(leche);
		caja1.registrar(azucar);
		caja1.registrar(pan);
		caja1.registrar(pan);
		assertEquals(0, stock.stockDe(leche));
		assertEquals(9, stock.stockDe(azucar));
		assertEquals(0, stock.stockDe(pan));
	}
	
	@Test
	public void verificarStockVariasCajas() {
		caja2 = new Caja(agencia, stock);
		caja1.registrar(leche);
		caja1.registrar(leche);
		caja2.registrar(leche);
		caja1.registrar(azucar);
		caja2.registrar(pan);
		caja1.registrar(pan);
		assertEquals(0, stock.stockDe(leche));
		assertEquals(9, stock.stockDe(azucar));
		assertEquals(0, stock.stockDe(pan));
		
	}

}
