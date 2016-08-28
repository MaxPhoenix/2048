package paquete;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JugadorTest {

	
	private Jugador j1,j2;

	@Before
	public void preparePlayers(){
		 j1 = new Jugador("Esteban Quito");
		 j2 = new Jugador("Dolores de Barriga");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setScoreExceptiontest() {
		j1.increaseScore(-1);
		j2.increaseScore(0);
		
	}
	
	@Test
	public void setScoreTest(){
		j1.increaseScore(500);
		j1.increaseScore(100);
		assertEquals("Nombre: Esteban Quito Puntuacion: 600 Cant. movimientos: 0",j1.obtainStatus());
	}
	
	
	
}
