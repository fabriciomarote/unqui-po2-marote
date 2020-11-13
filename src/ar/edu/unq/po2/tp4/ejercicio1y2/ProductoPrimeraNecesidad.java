package ar.edu.unq.po2.tp4.ejercicio1y2;

public class ProductoPrimeraNecesidad extends Producto {

	private Double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean precioCuidado, Double descuento) {
		super(nombre, precio, precioCuidado);
		this.setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
	}

	@Override
	public Double getPrecio() {
		return this.getPrecio() * this.getDescuento();
	}
	
	public Double getDescuento() {
		return descuento;
	}
	
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
}