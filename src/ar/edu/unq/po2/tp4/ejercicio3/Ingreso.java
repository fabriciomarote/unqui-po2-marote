package ar.edu.unq.po2.tp4.ejercicio3;

public abstract class Ingreso {

	private Integer mesDePercepcion;
	private String concepto;
	private Double montoPercibido;
	
	public Ingreso(Integer mes, String concepto, Double monto) {
		this.mesDePercepcion = mes;
		this.concepto = concepto;
		this.montoPercibido = monto;
	}
	
	public Integer getMesDePercepcion() {
		return mesDePercepcion;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	public Double getMontoPercibido() {
		return montoPercibido;
	}
	
	abstract public Double getMontoImponible();
}