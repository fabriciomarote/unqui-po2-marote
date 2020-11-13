package ar.edu.unq.po2.tp4.ejercicio1y2;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> catalogo;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.catalogo = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public ArrayList<Producto> getCatalogo() {
		return catalogo;
	}
	
	public void agregarProducto(Producto unProducto) {
		catalogo.add(unProducto);
	}
	
	public Integer getCantidadDeProductos() {
		return catalogo.size();
	}
	
	public Double getPrecioTotal() {
	 Double precioTotal = catalogo.stream().mapToDouble(p->p.getPrecio()).sum();
     return precioTotal;
	}
}
