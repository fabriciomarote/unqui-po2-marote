package ar.edu.unq.po2.tp8.punto1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	//encargada de verificar si en una ronda del juego, un jugador ha recibido, en un conjunto de 5 cartas,cuatro cartas iguales en su valor
	// verificar(String,String,String,String,String)
	
	//setUp
	private PokerStatus pokerStatus;
	
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();
			
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroTodasJunatasAlPrincipioTienePoker() {
		assertTrue(pokerStatus.verificar("4D","4P","4C","4T","8T")); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroTodasAlFinalTienePoker() {
		assertTrue(pokerStatus.verificar("8D","AP","AC","AT","AD")); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroMezcladasTienePoker() {
		assertTrue(pokerStatus.verificar("8D","4P","8C","8T","8P")); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasAtrasYLasOtrasDosRestantesDeOtrosNumerosNoTienePoker() {
		assertFalse(pokerStatus.verificar("3D","8T","4C","4P","4T")); 
	}
	
	@Test  // verify
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasMezcladasYLasOtrasDosRestantesDeOtrosNumerosNoTienePoker() {
		assertFalse(pokerStatus.verificar("3D","8T","4C","4P","4T"));
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasAdelanteYLasOtrasDosRestantesDeOtrosNumerosNoTienePoker() {
		assertFalse(pokerStatus.verificar("4D","4P","4C","3P","8T")); 
	}
}
