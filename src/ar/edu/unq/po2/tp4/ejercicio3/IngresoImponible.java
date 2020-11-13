package ar.edu.unq.po2.tp4.ejercicio3;

public class IngresoImponible extends Ingreso {

	public IngresoImponible(Integer mes, String concepto, Double monto) {
		super(mes, concepto, monto);
	}

	@Override 
	public Double getMontoImponible() {
		return this.getMontoPercibido();
	}
}