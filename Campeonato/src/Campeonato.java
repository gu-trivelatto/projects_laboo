/*
 * Augusto Vaccarelli Costa 10770197
 * Gustavo Trivelatto Gabriel 11260908
 * 
 */

public class Campeonato {
	Data atual;
	Time partipantes[];
	Jogo calendario[]; 
	int numeroDeTimes;
	
	
	
	
	/*	Metodo que analisa um resultado e atualiza 
	 * 	as estatiscas dos times envolvidos num jogo*/
	void analisaJogo (Jogo jogo, Data atual){
		if(jogo.jogoDisputado(jogo, atual)) {
			jogo.daCasa.jogosDisputados++;
			jogo.visitante.jogosDisputados++;
			jogo.daCasa.golsPro += jogo.golsDaCasa;
			jogo.visitante.golsPro +=jogo.golsVisitante;
			
			if(jogo.golsDaCasa > jogo.golsVisitante) {
				jogo.daCasa.vitorias++;
				jogo.visitante.derrotas++;
				jogo.daCasa.saldoDeGols += jogo.golsDaCasa - jogo.golsVisitante;
				jogo.visitante.saldoDeGols -= jogo.golsDaCasa - jogo.golsVisitante;
				jogo.daCasa.pontos += 3;
			}
			else if(jogo.golsDaCasa < jogo.golsVisitante){
				jogo.daCasa.derrotas++;
				jogo.visitante.vitorias++;
				jogo.daCasa.saldoDeGols -= jogo.golsVisitante - jogo.golsDaCasa;
				jogo.visitante.saldoDeGols += jogo.golsVisitante - jogo.golsDaCasa;;
				jogo.visitante.pontos += 3;
			}
			else { //Empates
				jogo.daCasa.empates++;
				jogo.visitante.empates++;
				jogo.daCasa.pontos++;
				jogo.visitante.pontos++;
			}
		}
	}
	
	String analisaCampeonato (Time participantes[], int numeroDeTimes) {
		
		String campeao = "Campeão: ";
		int campeaoCounter = 0;
		Campeonato campeonato = new Campeonato();
		
		
		if(campeonato.testaEmpatePorPontos(participantes, numeroDeTimes, campeaoCounter)) {
			campeaoCounter = 0;
			if(campeonato.testaEmpatePorVitorias(participantes, numeroDeTimes, campeaoCounter)) {
				campeaoCounter = 0;
				if(campeonato.testaEmpatePorGols(participantes, numeroDeTimes, campeaoCounter)) {
					campeaoCounter = 0;
					if(campeonato.testaEmpatePorSaldoGols(participantes, numeroDeTimes, campeaoCounter)) {
						campeaoCounter = 0;
						if(campeonato.testaEmpatePorDerrotas(participantes, numeroDeTimes, campeaoCounter)) {
							campeao = "Campeões: ";
							for(int i = 0; i < numeroDeTimes; i++) {
								if(participantes[i].empatadoNoCampeonato) 
									campeao = (campeao + participantes[i].nome + " ");
							}
						}
						else 
							campeao += participantes[campeaoCounter].nome;	
					}
					else
						campeao += participantes[campeaoCounter].nome;
				}
				
				else
					campeao += participantes[campeaoCounter].nome;
			}
			
			else
				campeao += participantes[campeaoCounter].nome;
		}
		
		else
			campeao += participantes[campeaoCounter].nome;
		
		
		
		return campeao;
	}
	
	boolean testaEmpatePorPontos (Time participantes[], int numeroDeTimes, int campeaoCounter) {
		boolean haEmpate = false;
		for(int n = 1; n < numeroDeTimes; n++) {
			if(participantes[campeaoCounter].pontos < participantes[n].pontos) {
				campeaoCounter = n;
				haEmpate = false;
				for(int i = 0; i < numeroDeTimes; i++) {
					participantes[i].empatadoNoCampeonato = false;
				}
			}
			else if(participantes[campeaoCounter].pontos == participantes[n].pontos) {
				participantes[n].empatadoNoCampeonato = true;
				participantes[campeaoCounter].empatadoNoCampeonato = true;
				haEmpate = true;	
			}
		}
		return haEmpate;
	}
	
	boolean testaEmpatePorVitorias (Time participantes[], int numeroDeTimes, int campeaoCounter) {
		boolean haEmpate = false;
		for(int n = 1; n < numeroDeTimes; n++) {
			if(participantes[campeaoCounter].vitorias < participantes[n].vitorias) {
				campeaoCounter = n;
				haEmpate = false;
				for(int i = 0; i < numeroDeTimes; i++) {
					participantes[i].empatadoNoCampeonato = false;
				}
			}
			else if(participantes[campeaoCounter].vitorias == participantes[n].vitorias) {
				participantes[n].empatadoNoCampeonato = true;
				participantes[campeaoCounter].empatadoNoCampeonato = true;
				haEmpate = true;	
			}
		}
		return haEmpate;
	}
	
	boolean testaEmpatePorGols (Time participantes[], int numeroDeTimes, int campeaoCounter) {
		boolean haEmpate = false;
		for(int n = 1; n < numeroDeTimes; n++) {
			if(participantes[campeaoCounter].golsPro < participantes[n].golsPro) {
				campeaoCounter = n;
				haEmpate = false;
				for(int i = 0; i < numeroDeTimes; i++) {
					participantes[i].empatadoNoCampeonato = false;
				}
			}
			else if(participantes[campeaoCounter].golsPro == participantes[n].golsPro) {
				participantes[n].empatadoNoCampeonato = true;
				participantes[campeaoCounter].empatadoNoCampeonato = true;
				haEmpate = true;	
			}
		}
		return haEmpate;
	}
	
	boolean testaEmpatePorSaldoGols (Time participantes[], int numeroDeTimes, int campeaoCounter) {
		boolean haEmpate = false;
		for(int n = 1; n < numeroDeTimes; n++) {
			if(participantes[campeaoCounter].saldoDeGols < participantes[n].saldoDeGols) {
				campeaoCounter = n;
				haEmpate = false;
				for(int i = 0; i < numeroDeTimes; i++) {
					participantes[i].empatadoNoCampeonato = false;
				}
			}
			else if(participantes[campeaoCounter].saldoDeGols == participantes[n].saldoDeGols) {
				participantes[n].empatadoNoCampeonato = true;
				participantes[campeaoCounter].empatadoNoCampeonato = true;
				haEmpate = true;	
			}
		}
		return haEmpate;
	}
	
	boolean testaEmpatePorDerrotas (Time participantes[], int numeroDeTimes, int campeaoCounter) {
		boolean haEmpate = false;
		for(int n = 1; n < numeroDeTimes; n++) {
			if(participantes[campeaoCounter].derrotas > participantes[n].derrotas) {
				campeaoCounter = n;
				haEmpate = false;
				for(int i = 0; i < numeroDeTimes; i++) {
					participantes[i].empatadoNoCampeonato = false;
				}
			}
			else if(participantes[campeaoCounter].derrotas == participantes[n].derrotas) {
				participantes[n].empatadoNoCampeonato = true;
				participantes[campeaoCounter].empatadoNoCampeonato = true;
				haEmpate = true;	
			}
		}
		return haEmpate;
	}
	

}
