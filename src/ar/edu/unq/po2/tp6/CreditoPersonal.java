package ar.edu.unq.po2.tp6;

public class CreditoPersonal extends SolicitudDeCredito{

	public CreditoPersonal(Cliente cliente, Double monto, Integer plazo) {
		super(cliente, monto, plazo);
	}

	@Override
	public boolean realizarChequeo() {
		return this.getCliente().montoNetoAnual() >= 15000d && 
			   this.montoDeCuotaMensual() <= this.getCliente().getSueldoNetoMensual() * 0.7d;
	}

}
