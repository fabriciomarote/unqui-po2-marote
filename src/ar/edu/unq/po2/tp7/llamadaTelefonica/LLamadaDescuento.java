package ar.edu.unq.po2.tp7.llamadaTelefonica;

public class LLamadaDescuento extends LlamadaTelefonica{
	
    public LLamadaDescuento(Integer tiempo, Integer horaDelDia) {
		super(tiempo, horaDelDia);
	}
		
	@Override
	public boolean esHoraPico() {
	  return false;
    }
		
    @Override
    public float costoNeto(){
	   return this.getTiempo()*0.95f;
    }
}
