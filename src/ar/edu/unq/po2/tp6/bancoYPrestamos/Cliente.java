package ar.edu.unq.po2.tp6.bancoYPrestamos;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private Integer edad;
    private Double sueldoNetoMensual;
    
    public Cliente(String nombre, String apellido, String direccion, Integer edad, Double sueldo) {
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.direccion = direccion;
    	this.edad = edad;
    	this.sueldoNetoMensual = sueldo;
    }
    
    public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
    
    public Double montoNetoAnual() {
       	return this.sueldoNetoMensual * 12;
    }
    
    public void solicitarCredito(Banco banco, Double monto) {
        SolicitudDeCredito solicitud = new CreditoPersonal(this, monto, 12);
        banco.registrar(solicitud);
    }
    
    public void cobrarCredito() {	
	}
}
