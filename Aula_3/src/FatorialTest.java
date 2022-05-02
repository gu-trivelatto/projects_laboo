import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FatorialTest {

	@Test
	void fatorialSimples() {
		Fatorial teste = new Fatorial();
	
		assertEquals(120, teste.fatorial(5));
	}
	
	@Test
	void fatorialDeUm() {
		Fatorial teste = new Fatorial();
	
		assertEquals(1, teste.fatorial(1));
	}
	
	@Test
	void fatorialZero() {
		Fatorial teste = new Fatorial();
	
		assertEquals(1, teste.fatorial(0));
	}
	
	@Test
	void fatorialNegativo() {
		Fatorial teste = new Fatorial();
	
		assertEquals(-1 , teste.fatorial(-5));
	}
	
	@Test
	void fatorialValorAlto() {
		Fatorial teste = new Fatorial();
	
		assertEquals(2432902008176640000L, teste.fatorial(20)); //para um long precisa do L dps do numero
	}

}
