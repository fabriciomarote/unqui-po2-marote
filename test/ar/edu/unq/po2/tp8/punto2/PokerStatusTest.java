package ar.edu.unq.po2.tp8.punto2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	//setUp
    private PokerStatus pokerStatus;
	
	
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();	
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroTodasJunatasAlPrincipioTienePoker() {
		assertEquals("Es poquer",pokerStatus.verificar("4D","4P","4C","4T","8T")); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroTodasAlFinalTienePoker() {
		assertEquals("Es poquer",pokerStatus.verificar("8D","AP","AC","AT","AD")); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeCuatroCartasDelMismoNumeroMezcladasTienePoker() {
		assertEquals("Es poquer",pokerStatus.verificar("8D","4P","8C","8T","8P")); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasAtrasYLasOtrasDosRestantesDeOtrosNumerosTieneTrio() {
		assertEquals("Es trio",pokerStatus.verificar("3D","8T","4C","4P","4T")); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasMezcladasYLasOtrasDosRestantesDeOtrosNumerosTieneTrio() {
		assertEquals("Es trio",pokerStatus.verificar("3D","8T","3C","4P","3T")); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeTresCartasDelMismoNumeroTodasAdelanteYLasOtrasDosRestantesDeOtrosNumerosTieneTrio() {
		assertEquals("Es trio",pokerStatus.verificar("4D","4P","4C","3P","8T")); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeLasCincoCartasDelMismoNumeroPalo() {
		assertEquals("Es color",pokerStatus.verificar("4D","3D","AD","QD","10D")); 
	}
	
	@Test // verify
	public void cuandoUnJugadorRecibeCincoCartasDeDistintoPaloYDistintoNumeroNoTieneNada() {
		assertEquals("No es nada", pokerStatus.verificar("AD", "10D", "3T", "5P", "7C"));
	}
}
