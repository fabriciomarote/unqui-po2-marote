package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {

	private String nombre;
	private ArrayList<Persona> integrantes;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		this.integrantes = new ArrayList<Persona>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}
	
	public void agregarIntegrante(Persona persona) {
		this.integrantes.add(persona);
	}
	
	public Integer promedioEdadDeIntegrantes() {
		Integer promedio = 0;
		for (Persona integrante:integrantes) {
			promedio = promedio + integrante.edad();
		}
		promedio = promedio / this.getIntegrantes().size();
		return promedio;
	}
}
