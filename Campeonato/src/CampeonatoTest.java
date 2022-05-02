/*
 * Augusto Vaccarelli Costa 10770197
 * Gustavo Trivelatto Gabriel 11260908
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CampeonatoTest {
	
	@Test
	void testaCampeonato() {
		
		Campeonato partidas = new Campeonato();
		Time time[] = new Time[4];
		time[0] = new Time();
		time[1] = new Time();
		time[2] = new Time();
		time[3] = new Time();
		Jogo jogo[] = new Jogo[6];
		jogo[0] = new Jogo();
		jogo[1] = new Jogo();
		jogo[2] = new Jogo();
		jogo[3] = new Jogo();
		jogo[4] = new Jogo();
		jogo[5] = new Jogo();
		Data hoje = new Data();
		
		time[0].nome = "Palmeiras";
		time[1].nome = "Corinthians";
		time[2].nome = "São Paulo";
		time[3].nome = "Santos";
		
		hoje.ano = 2020;
		hoje.mes = 01;
		hoje.dia = 25;
		
		jogo[0].daCasa = time[0];
		jogo[0].golsDaCasa = 3;
		jogo[0].visitante = time[1];
		jogo[0].golsVisitante = 1;
		jogo[0].data.ano = 2020;
		jogo[0].data.mes = 01;
		jogo[0].data.dia = 20;
		partidas.analisaJogo(jogo[0], hoje);
		
		jogo[1].daCasa = time[0];
		jogo[1].golsDaCasa = 1;
		jogo[1].visitante = time[2];
		jogo[1].golsVisitante = 0;
		jogo[1].data.ano = 2020;
		jogo[1].data.mes = 01;
		jogo[1].data.dia = 20;
		partidas.analisaJogo(jogo[1], hoje);
		
		jogo[2].daCasa = time[0];
		jogo[2].golsDaCasa = 1;
		jogo[2].visitante = time[3];
		jogo[2].golsVisitante = 1;
		jogo[2].data.ano = 2020;
		jogo[2].data.mes = 01;
		jogo[2].data.dia = 20;
		partidas.analisaJogo(jogo[2], hoje);
		
		jogo[3].daCasa = time[1];
		jogo[3].golsDaCasa = 0;
		jogo[3].visitante = time[2];
		jogo[3].golsVisitante = 2;
		jogo[3].data.ano = 2020;
		jogo[3].data.mes = 01;
		jogo[3].data.dia = 20;
		partidas.analisaJogo(jogo[3], hoje);
		
		jogo[4].daCasa = time[1];
		jogo[4].golsDaCasa = 2;
		jogo[4].visitante = time[3];
		jogo[4].golsVisitante = 1;
		jogo[4].data.ano = 2020;
		jogo[4].data.mes = 01;
		jogo[4].data.dia = 20;
		partidas.analisaJogo(jogo[4], hoje);
		
		jogo[5].daCasa = time[2];
		jogo[5].golsDaCasa = 0;
		jogo[5].visitante = time[3];
		jogo[5].golsVisitante = 1;
		jogo[5].data.ano = 2020;
		jogo[5].data.mes = 01;
		jogo[5].data.dia = 20;
		partidas.analisaJogo(jogo[5], hoje);
		
		assertEquals(2, time[0].vitorias);
		assertEquals(0, time[0].derrotas);
		assertEquals(1, time[0].empates);
		assertEquals(3, time[0].saldoDeGols);
		assertEquals(5, time[0].golsPro);
		assertEquals(7, time[0].pontos);
		assertEquals(3, time[0].jogosDisputados);
		
		assertEquals(1, time[1].vitorias);
		assertEquals(2, time[1].derrotas);
		assertEquals(0, time[1].empates);
		assertEquals(-3, time[1].saldoDeGols);
		assertEquals(3, time[1].golsPro);
		assertEquals(3, time[1].pontos);
		assertEquals(3, time[1].jogosDisputados);
		
		assertEquals(1, time[2].vitorias);
		assertEquals(2, time[2].derrotas);
		assertEquals(0, time[2].empates);
		assertEquals(0, time[2].saldoDeGols);
		assertEquals(2, time[2].golsPro);
		assertEquals(3, time[2].pontos);
		assertEquals(3, time[2].jogosDisputados);
		
		assertEquals(1, time[3].vitorias);
		assertEquals(1, time[3].derrotas);
		assertEquals(1, time[3].empates);
		assertEquals(0, time[3].saldoDeGols);
		assertEquals(3, time[3].golsPro);
		assertEquals(4, time[3].pontos);
		assertEquals(3, time[3].jogosDisputados);
		
		assertEquals("Campeão: Palmeiras", partidas.analisaCampeonato(time, 4));
		
	}

	
	@Test
	void testaEmpateCompleto() {
		Campeonato partidas = new Campeonato();
		Time time[] = new Time[4];
		time[0] = new Time();
		time[1] = new Time();
		time[2] = new Time();
		time[3] = new Time();
		
		time[0].nome = "Palmeiras";
		time[0].pontos = 15;
		time[0].vitorias = 4;
		time[0].golsPro = 7;
		time[0].saldoDeGols = 5;
		time[0].derrotas = 1;
		time[1].nome = "Corinthians";
		time[1].pontos = 15;
		time[1].vitorias = 4;
		time[1].golsPro = 7;
		time[1].saldoDeGols = 5;
		time[1].derrotas = 1;
		time[2].nome = "São Paulo";
		time[2].pontos = 8;
		time[2].vitorias = 2;
		time[2].golsPro = 4;
		time[2].saldoDeGols = -1;
		time[2].derrotas = 5;
		time[3].nome = "Santos";
		time[3].pontos = 10;
		time[3].vitorias = 3;
		time[3].golsPro = 6;
		time[3].saldoDeGols = 3;
		time[3].derrotas = 4;
		
		assertEquals("Campeões: Palmeiras Corinthians ", partidas.analisaCampeonato(time, 4));
		
	}

}
