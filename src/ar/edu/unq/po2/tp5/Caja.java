package ar.edu.unq.po2.tp5;

import ar.edu.unq.po2.tp4.Producto;

public class Caja {
 
	private Double montoAPagar;
	private Agencia agencia;
	private Stock stock;
	
	public Caja(Agencia agencia, Stock stock) {
		this.montoAPagar = 0d;
		this.agencia = agencia;
		this.stock = stock;
	}
	
	public Double getMontoAPagar() {
		return montoAPagar;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
	public Stock getStock() {
		return stock;
	}
	
	public void registrar(Producto producto) {
		this.montoAPagar += producto.getPrecioTotal();
		stock.descontarStock(producto);
		producto.registrarEn(agencia);
	}
	
	public void finalizarCompra() {
		this.getMontoAPagar();
		this.montoAPagar = 0d;
	}
}
