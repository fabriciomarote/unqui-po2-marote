package ar.edu.unq.po2.tp5;

public abstract class ProductoComercial implements Producto{

	protected Double precio;
	
	public ProductoComercial(Double precio) {
	    this.precio = precio;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public void registrarEn(Agencia agencia) {
	}

	abstract public Double getPrecioTotal();
}
