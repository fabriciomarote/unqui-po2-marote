package ar.edu.unq.po2.tp7.sueldosRecargado;


public class Planta extends Empleado{
	
	public Planta(Double horasTrabajadas, Double cantidadDeHijos) {
		super(horasTrabajadas, cantidadDeHijos);
	}
	
	@Override
	public Double sueldoPorHora(Double sueldo) {
		return 0d;
	}

	@Override
	public Double sueldoBasico(Double sueldo) {
		return sueldo += 3000d;
	}
	
	@Override
	public Double otrosConceptos(Double sueldo) {
		return sueldo += this.getCantidadDeHijos() * 150;
	}
}
