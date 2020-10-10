package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Individuo {

	  private String nombre;
	  private LocalDate fechaDeNacimiento;
	  
	  public Individuo(String nombre, LocalDate fecha) {
		  this.nombre = nombre;
		  this.fechaDeNacimiento = fecha;
	  }
	  
	  public Individuo() {
	  }
	  
	  public String getNombre() {
		  return nombre;
	  }
	  
	  public void setNombre(String unNombre) {
		  this.nombre = unNombre;
	  }
	  
	  public LocalDate getFechaDeNacimiento() {
		  return fechaDeNacimiento;
	  }
	  
	  public Integer edad() {
		  LocalDate hoy = LocalDate.now();
		  return Period.between(this.getFechaDeNacimiento(),hoy).getYears();
	  }
	  
	  public Boolean menorQue(Individuo unIndividuo) {
		  return this.edad() < unIndividuo.edad();
	  }
}