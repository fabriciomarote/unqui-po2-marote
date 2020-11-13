package ar.edu.unq.po2.tp7.sueldosRecargado;

public class Pasante extends Empleado{
	
	public Pasante(Double horasTrabajadas) {
        super(horasTrabajadas);
	}

	@Override
	public Double sueldoPorHora(Double sueldo) {
		return sueldo += 40 * this.horasTrabajadas;
	}
	
	@Override
	public Double sueldoBasico(Double sueldo) {
		return 0d;
	}

	@Override
	public Double otrosConceptos(Double sueldo) {
		return 0d;
	}
}