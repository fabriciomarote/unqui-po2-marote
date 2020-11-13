package ar.edu.unq.po2.tp7.sueldosRecargado;

public class Temporario extends Empleado{

	private Boolean tieneConyuge;
	
	public Temporario(Double cantidadDeHijos, Double horasTrabajadas) {
		super(cantidadDeHijos, horasTrabajadas);
		this.tieneConyuge = false;
	}

	public Boolean tieneConyuge() {
		return tieneConyuge;
	}

	@Override
	public Double sueldoPorHora(Double sueldo) {
		return sueldo = sueldo + 5 * this.horasTrabajadas; 
	}
	
	@Override
	public Double sueldoBasico(Double sueldo) {
		return sueldo += 1000d;
	}
	
	@Override
	public Double otrosConceptos(Double sueldo) {
		if (this.tieneConyuge() || this.getCantidadDeHijos() > 0) {
			return sueldo += 100;
		} else {
			return 0d;
		}
	}
}
