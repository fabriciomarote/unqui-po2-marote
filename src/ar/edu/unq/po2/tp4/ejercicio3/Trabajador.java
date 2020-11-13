package ar.edu.unq.po2.tp4.ejercicio3;

import java.util.ArrayList;

public class Trabajador {

	private ArrayList<Ingreso> ingresosPercibidos;
	
	public Trabajador() {
		this.ingresosPercibidos = new ArrayList<Ingreso>();
	}
	
	public ArrayList<Ingreso> getIngresosPercibidos() {
		return ingresosPercibidos;
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresosPercibidos.add(ingreso);
	}
	
	public Double getTotalPercibido() {
		return ingresosPercibidos.stream()
				.mapToDouble(Ingreso::getMontoImponible
				.sum());
	}

	public Double getMontoImponible() {
		//////////////////////////////
	}

    public Double getImpuestoAPagar() {
    	return this.getMontoImponible() * 0.02;
    }
}
