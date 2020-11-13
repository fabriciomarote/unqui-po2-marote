package ar.edu.unq.po2.tp7.llamadaTelefonica;

public abstract class LlamadaTelefonica {
	
	private Integer tiempo;
	private Integer horaDelDia;
	
	public LlamadaTelefonica(Integer tiempo, Integer horaDelDia){
	    this.tiempo = tiempo;
	    this.horaDelDia = horaDelDia;
	}
	
	// primitiva
	public Integer getTiempo(){
	   return this.tiempo;
	}
	
	// primitiva
	public Integer getHoraDelDia(){
	   return this.horaDelDia;
	}
	
	/*
	 * templete method
	 */
	public float costoFinal(){
		if(this.esHoraPico()){
		    return this.costoNeto()*1.2f*this.getTiempo();
		}else{
		    return this.costoNeto()* this.getTiempo();
		}
	}
		
	protected abstract boolean esHoraPico();

	public float costoNeto(){
		return this.getTiempo()*1;  // hook method
	}
	
}