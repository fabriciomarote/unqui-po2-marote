package ar.edu.unq.po2.tp5;

public class ProductoTradicional extends ProductoComercial{

	public ProductoTradicional(Double precio) {
		super(precio);
	}
	
	@Override
	public Double getPrecioTotal() {
		return this.getPrecio();
	}
}
