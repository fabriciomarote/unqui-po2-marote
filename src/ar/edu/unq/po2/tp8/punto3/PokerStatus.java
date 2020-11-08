package ar.edu.unq.po2.tp8.punto3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus {

	public PokerStatus() {
	}

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5){
		List<Carta> juego1 = new ArrayList<Carta>();
		juego1.add(carta1);
		juego1.add(carta2);
		juego1.add(carta3);
		juego1.add(carta4);
		juego1.add(carta5);
			
		Valor valorDeLaPrimerCarta = carta1.getValor();
		Valor valorDeLaSegundaCarta = carta2.getValor();
		Valor valorDeLaTercerCarta = carta3.getValor();
		
		String paloDeLaPrimerCarta = carta1.getPalo();
		
		String resultado = ( this.esPoquer(juego1, valorDeLaPrimerCarta, valorDeLaSegundaCarta)) ? "Es poquer" :
			               ( this.esColor(juego1, paloDeLaPrimerCarta)) ? "Es color" :
			               ( this.esTrio(juego1, valorDeLaPrimerCarta, valorDeLaSegundaCarta, valorDeLaTercerCarta)) ? "Es trio" :
			                 "No es nada";
		return resultado;	
	}

	private boolean esPoquer(List<Carta> juego1, Valor valor1, Valor valor2) {
		return juego1.stream().map(carta -> carta.getValor()).filter(caracter -> caracter.equals(valor1)).collect(Collectors.toList()).size() == 4
				|| juego1.stream().map(carta -> carta.getValor()).filter(caracter -> caracter.equals(valor2)).collect(Collectors.toList()).size() == 4;
	}
	
	private boolean esColor(List<Carta> juego1, String palo) {
		return juego1.stream().map(carta -> carta.getPalo()).filter(caracter -> caracter.equals(palo)).collect(Collectors.toList()).size() == 5;			
	}
     
    private boolean esTrio(List<Carta> juego1, Valor valor1, Valor valor2, Valor valor3) {	
 		return juego1.stream().map(carta -> carta.getValor()).filter(caracter -> caracter.equals(valor1)).collect(Collectors.toList()).size() == 3
				|| juego1.stream().map(carta -> carta.getValor()).filter(caracter -> caracter.equals(valor2)).collect(Collectors.toList()).size() == 3
				|| juego1.stream().map(carta -> carta.getValor()).filter(caracter -> caracter.equals(valor3)).collect(Collectors.toList()).size() == 3;			
 	}
}
