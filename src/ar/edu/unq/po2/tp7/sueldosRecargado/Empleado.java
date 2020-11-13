package ar.edu.unq.po2.tp7.sueldosRecargado;

public abstract class Empleado {
    
	public Double cantidadDeHijos;
	public Double horasTrabajadas;
	
	public Empleado(Double cantidadDeHijos, Double horasTrabajadas) {
		this.cantidadDeHijos = cantidadDeHijos;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public Empleado(Double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadDeHijos = 0d;
	}
	
	public Double getCantidadDeHijos() {
		return cantidadDeHijos;
	}
	
	public Double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public Double sueldo() {
	    Double sueldo = 0d;
	    this.sueldoBasico(sueldo) +
	    this.sueldoPorHora(sueldo) +
	    this.otrosConceptos(sueldo) -
	    this.descuento(sueldo);
	    return sueldo;
	} 
	
	public abstract Double sueldoBasico(Double sueldo);
	
	public abstract Double sueldoPorHora(Double sueldo);	

    public abstract Double otrosConceptos(Double sueldo);
    
    public Double descuento(Double sueldo) {
    	return sueldo * 0.13;
    }
}
