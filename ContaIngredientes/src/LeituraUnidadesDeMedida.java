/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import java.io.FileReader;
import java.io.BufferedReader;

public class LeituraUnidadesDeMedida {
	
	String [] leArquivo(String nomeArquivo) {
		ContaLinhas contaLinhas = new ContaLinhas();
		String [] unidade = new String[contaLinhas.numeroDeLinhas(nomeArquivo)];
		try {
			FileReader fr = new FileReader(nomeArquivo);
			BufferedReader br = new BufferedReader(fr);
			int traco;
			for(int i = 0; i < (contaLinhas.numeroDeLinhas(nomeArquivo)); i++) {
				unidade[i] = br.readLine();
				traco = unidade[i].indexOf("-") + 2;
				unidade[i] = unidade[i].substring(traco);
			}
			br.close();
		}
		catch (Exception e) {
			System.out.println("Erro no arquivo dos ingredientes: " + e);
			return null;
		}
		return unidade;
	}
	
	
}
