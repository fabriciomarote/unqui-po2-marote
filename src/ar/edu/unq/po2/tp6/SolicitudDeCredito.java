package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {

	private Cliente cliente;
	private Double montoSolicitado;
	private Integer plazo;
	
	public SolicitudDeCredito(Cliente cliente, Double monto) {
		this.cliente = cliente;
        this.montoSolicitado = monto;
	}
	
	public SolicitudDeCredito(Cliente cliente, Double monto, Integer plazo) {
        this.cliente = cliente;
        this.montoSolicitado = monto;
        this.plazo = plazo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public Double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getPlazo() {
		return plazo;
	}
	
	public Double montoDeCuotaMensual() {
	    return this.getMontoSolicitado() / this.getPlazo();	
	}
	
	public abstract boolean realizarChequeo();
}
