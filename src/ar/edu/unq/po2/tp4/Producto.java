package ar.edu.unq.po2.tp4;

public class Producto {
    
	private String nombre;
	private Double precio;
	protected Boolean esPreciosCuidados;
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPreciosCuidados = false;
	}
	
	public Producto(String nombre, Double precio, Boolean precioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPreciosCuidados = precioCuidado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public Boolean esPrecioCuidado() {
		return esPreciosCuidados;
	}
	
	public void aumentarPrecio(Double precio) {
		this.precio += precio;
	}
}