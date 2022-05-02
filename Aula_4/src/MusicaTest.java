import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MusicaTest {
	Musica musicas[] = new Musica[10];
	Musica teste = new Musica();
	@BeforeEach
	void inicializacao() {
		
		musicas[0] = new MusicaCD();
		musicas[1] = new MusicaCD();
		musicas[2] = new MusicaCD();
		musicas[3] = new MusicaMP3(36425);
		musicas[4] = new MusicaMP3(41259);
		musicas[5] = new MusicaMP3(30247);
		musicas[6] = new FaixaLP(45);
		musicas[7] = new FaixaLP(78);
		musicas[8] = new FaixaLP(33);
		musicas[9] = new FaixaLP(33);
		
		musicas[0].titulo = "This love";
		musicas[0].album = "Songs About Jane";
		musicas[0].compositor = "Adam Levine";
		musicas[0].interprete = "Maroon 5";
		musicas[0].ano = 2004;
		
		musicas[1].titulo = "Numb";
		musicas[1].album = "Meteora";
		musicas[1].compositor = "Linkin Park";
		musicas[1].interprete = "Linkin Park";
		musicas[1].ano = 2003;
		
		musicas[2].titulo = "Vou deixar";
		musicas[2].album = "Cosmotron";
		musicas[2].compositor = "Skank";
		musicas[2].interprete = "Skank";
		musicas[2].ano = 2003;
		
		musicas[3].titulo = "Pumped Up Kicks";
		musicas[3].album = "Torches";
		musicas[3].compositor = "Mark Foster";
		musicas[3].interprete = "Foster the People";
		musicas[3].ano = 2010;
		
		musicas[4].titulo = "Happy";
		musicas[4].album = "Girl";
		musicas[4].compositor = "Pharrell Williams";
		musicas[4].interprete = "Pharrell Williams";
		musicas[4].ano = 2013;
		
		musicas[5].titulo = "Billionaire";
		musicas[5].album = "Lazarus";
		musicas[5].compositor = "Travie McCoy";
		musicas[5].interprete = "Travie McCoy";
		musicas[5].ano = 2010;
		
		musicas[6].titulo = "Linger";
		musicas[6].album = "Everybody else is doing it, so why can't we?";
		musicas[6].compositor = "Dolores O'Riordan";
		musicas[6].interprete = "The Cranberries";
		musicas[6].ano = 1996;
		
		musicas[7].titulo = "Billie Jean";
		musicas[7].album = "Thriller";
		musicas[7].compositor = "Michael Jackson";
		musicas[7].interprete = "Michael Jackson";
		musicas[7].ano = 1983;
		
		musicas[8].titulo = "I will survive";
		musicas[8].album = "Love Tracks";
		musicas[8].compositor = "Gloria Gaynor";
		musicas[8].interprete = "Gloria Gaynor";
		musicas[8].ano = 1978;
		
		musicas[9].titulo = "Hey Jude";
		musicas[9].album = "Revolution";
		musicas[9].compositor = "Paul McCartney";
		musicas[9].interprete = "The Beattles";
		musicas[9].ano = 1968;
	
	}

	@Test
	void testaProcuraTitulo() {
		int arrayDeIndices[] = {5};
		areEqual(arrayDeIndices, teste.buscaPorTitulo(musicas, "Billionaire"));
	}
/*	
	@Test
	void testaProcuraCompositor() {
		int arrayDeIndices[] = {9, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		assertEquals(arrayDeIndices, teste.buscaPorCompositor(musicas, "Paul McCartney"));
	}
	
	@Test
	void testaProcuraInterprete() {
		int arrayDeIndices[] = {5, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		assertEquals(arrayDeIndices, teste.buscaPorInterprete(musicas, "Travie McCoy"));
	}
	
	@Test
	void testaProcuraPeriodo() {
		int arrayDeIndices[] = {6, 7, 0, 0, 0, 0, 0, 0, 0, 0};
		int arrayDePeriodo[] = {1981, 1999};
		assertEquals(arrayDeIndices, teste.buscaPorPeriodo(musicas, arrayDePeriodo));
	}
	
	@Test
	void testaProcuraTamanhoMax() {
		int arrayDeIndices[] = {4, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		assertEquals(arrayDeIndices, teste.buscaPorTamanhoMax(musicas, 40000));
	}
*/
}
