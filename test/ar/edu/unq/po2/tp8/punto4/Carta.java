package ar.edu.unq.po2.tp8.punto4;

import ar.edu.unq.po2.tp8.punto3.Valor;

public class Carta {

	private Valor valor;
	private String palo;
			
	public Carta(Valor valor,String palo ) {
		this.valor = valor;
		this.palo = palo;			
	}

	public Valor getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}
			
	public boolean esSuperiorA(Carta carta) {		
		return this.valor.getValor() > carta.getValor().getValor();
	}
			
	public boolean esMismoPaloQue(Carta carta) {
		return carta.getPalo() == this.getPalo();
	}
	
	public Carta GanadorDeMano(Carta carta1, Carta carta2) {
		return
	}
}	