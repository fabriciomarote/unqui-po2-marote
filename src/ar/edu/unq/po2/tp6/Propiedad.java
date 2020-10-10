package ar.edu.unq.po2.tp6;

public class Propiedad {
    
	private String descripcion;
	private String direccion;
	private Double valorFiscal;
	
	public Propiedad(String descripcion, String direccion, Double valor) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public Double getValorFiscal() {
		return valorFiscal;
	}
}
