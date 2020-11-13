package ar.edu.unq.po2.tp7.sueldosRecargado;


import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> empleados;
	
	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}
	
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public void realizarPagos() {
	}
}