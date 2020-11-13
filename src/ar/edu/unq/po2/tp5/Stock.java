package ar.edu.unq.po2.tp5;

import java.util.HashMap;
import java.util.Map;

public class Stock {

	private Map<Producto, Integer> stockDeProductos;
	
	public Stock() {
		this.stockDeProductos = new HashMap<Producto, Integer>();
	}
	
	public void agregarProducto(Producto producto, Integer stock) {
		this.stockDeProductos.put(producto, stock);
	}
	
	public void quitarProducto(Producto producto) {
		this.stockDeProductos.remove(producto);
	}
	
    public Integer stockDe(Producto producto) {
    	return this.stockDeProductos.get(producto);
    }
    
    public void descontarStock(ar.edu.unq.po2.tp4.ejercicio1y2.Producto producto) {
    	Integer stockActualizado = this.stockDe(producto) -1;
    	this.stockDeProductos.replace(producto, stockActualizado);
    }
}
