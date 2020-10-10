package ar.edu.unq.po2.tp6;

public class CreditoHipotecario extends SolicitudDeCredito{

	private Propiedad propiedad;
	
	public CreditoHipotecario(Cliente cliente, Double monto, Integer plazo , Propiedad propiedad) {
		super(cliente, monto, plazo);
		this.propiedad = propiedad;
	}
	
	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	@Override
	public boolean realizarChequeo() {
	   boolean verificaMontoDeCuota = this.montoDeCuotaMensual() < this.getCliente().getSueldoNetoMensual() * 0.5d;
	   boolean verificarMontoSolicitado = this.getMontoSolicitado() < this.getPropiedad().getValorFiscal() * 0.3;
	   boolean verificarEdad = this.getCliente().getEdad() < 65 && this.getPlazo() < 12;
			
       return verificaMontoDeCuota && verificarMontoSolicitado && verificarEdad;
	}

	    //public boolean verificarMontoDeCuota() {
		//	return this.montoDeCuotaMensual() < this.getSolicitante().getSueldoNetoMensual() * 0.5d;
		//}
		
		//public boolean verificarMontoSolicitado() {
		  //  return this.getMontoSolicitado() < this.getPropiedad().getValorFiscal() * 0.3;
		//}
		    		
		//public boolean verificarEdad() {
			//return this.getSolicitante().getEdad() < 65 && this.getPlazo() < 12;
		//}
	

}
