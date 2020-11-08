package ar.edu.unq.po2.tp8.punto3;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	private Carta cartaMock1;
	private Carta cartaMock2;
	private Carta cartaMock3;
	private Carta cartaMock4; 
	private Carta cartaMock5;
	private Carta cartaMock6;
	private Carta cartaMock7;
	private Carta cartaMock8;
	private Carta cartaMock9;
	
    private PokerStatus pokerStatus;
    
    //setUp
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();
		cartaMock1 = mock(Carta.class);
		cartaMock2 = mock(Carta.class);
		cartaMock3 = mock(Carta.class);
		cartaMock4 = mock(Carta.class);
		cartaMock5 = mock(Carta.class);
		cartaMock6 = mock(Carta.class);
		cartaMock7 = mock(Carta.class);
		cartaMock8 = mock(Carta.class);
		cartaMock9 = mock(Carta.class);
		
		when(this.cartaMock1.getPalo()).thenReturn("D");
		when(this.cartaMock1.getValor()).thenReturn(Valor.CUATRO);
		
		when(this.cartaMock2.getPalo()).thenReturn("P");
		when(this.cartaMock2.getValor()).thenReturn(Valor.CUATRO);
		
		when(this.cartaMock3.getPalo()).thenReturn("C");
		when(this.cartaMock3.getValor()).thenReturn(Valor.CUATRO);
		
		when(this.cartaMock4.getPalo()).thenReturn("T");
		when(this.cartaMock4.getValor()).thenReturn(Valor.CUATRO);
		
		when(this.cartaMock5.getPalo()).thenReturn("T");
		when(this.cartaMock5.getValor()).thenReturn(Valor.OCHO);
		
		when(this.cartaMock6.getPalo()).thenReturn("T");
		when(this.cartaMock6.getValor()).thenReturn(Valor.SEIS);
		
		when(this.cartaMock7.getPalo()).thenReturn("D");
		when(this.cartaMock7.getValor()).thenReturn(Valor.A);
		
		when(this.cartaMock8.getPalo()).thenReturn("T");
		when(this.cartaMock8.getValor()).thenReturn(Valor.A);
		
		when(this.cartaMock9.getPalo()).thenReturn("T");
		when(this.cartaMock9.getValor()).thenReturn(Valor.TRES);
		}
	
	@Test // verify
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroTodasJunatasAlPrincipioTienePoker() {
		assertEquals("Es poquer",pokerStatus.verificar(cartaMock1,cartaMock2,cartaMock3,cartaMock4,cartaMock5)); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasAtrasYLasOtrasDosRestantesDeOtrosNumerosTieneTrio() {
		assertEquals("Es trio",pokerStatus.verificar(cartaMock8,cartaMock6,cartaMock3,cartaMock2,cartaMock4)); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeLasCincoCartasDelMismoNumeroPalo() {
		assertEquals("Es color",pokerStatus.verificar(cartaMock4,cartaMock5,cartaMock6,cartaMock8, cartaMock9)); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeCincoCartasDeDistintoPaloYDistintoNumeroNoTieneNada() {
		assertEquals("No es nada", pokerStatus.verificar(cartaMock2,cartaMock3,cartaMock5,cartaMock7,cartaMock9));
	}
}
