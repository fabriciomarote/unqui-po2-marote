package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
     
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fecha;
	}
	
	public Persona() {
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public Integer edad() {
		LocalDate hoy = LocalDate.now();
		return Period.between(this.getFechaDeNacimiento(),hoy).getYears();
	}
	
	public Boolean esMenorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
}

