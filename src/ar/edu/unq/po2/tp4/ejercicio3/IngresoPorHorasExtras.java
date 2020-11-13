package ar.edu.unq.po2.tp4.ejercicio3;

public class IngresoPorHorasExtras extends Ingreso{
	private Integer cantDeHorasExtras;

	public IngresoPorHorasExtras(Integer mes, String concepto, Double monto, Integer cantHoras) {
		super(mes, concepto, monto);
		this.cantDeHorasExtras = cantHoras;
	}
	
	public Integer getCantDeHorasExtras() {
		return cantDeHorasExtras;
	}
	
	@Override
	public Double getMontoImponible() {
		return 0d; 
	}
}
