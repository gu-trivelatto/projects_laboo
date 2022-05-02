/*
 * Augusto Vaccarelli Costa 10770197
 * Gustavo Trivelatto Gabriel 11260908
 * 
 */

public class Jogo {
	Time visitante = new Time();
	Time daCasa = new Time();
	int golsVisitante = 0, 
			golsDaCasa = 0;
	Data data = new Data();
	
	boolean jogoDisputado(Jogo jogo, Data atual) {
		if(jogo.data.ano > atual.ano && 
			jogo.data.mes > atual.mes && 
			jogo.data.dia > atual.dia)
			return false;
		else
			return true;
	}
	
}
