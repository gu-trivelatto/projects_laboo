/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import java.io.BufferedReader;
import java.io.FileReader;

public class LeituraReceitas {
	
	String [] receitas(String nomeArquivo) {
		ContaLinhas contaLinhas = new ContaLinhas();
		String [] receita = new String[contaLinhas.numeroDeLinhas(nomeArquivo)];
		
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(nomeArquivo);
			br = new BufferedReader(fr);
			for(int i = 0; i < (contaLinhas.numeroDeLinhas(nomeArquivo)); i++) {
				receita[i] = "Receitas/" + br.readLine();
				if(!(receita[i].endsWith(".txt"))) {
					throw new FormatoDeArquivoErrado();
				}
			}
			br.close();
		}
		catch (Exception e) {
			System.out.println("Erro no arquivo das receitas: " + e);
			return null;
		}
		finally {
			try {
				if(br != null)
					br.close();
			}
			catch(Exception e) {
				System.out.println("Erro no arquivo das receitas: " + e);
				return null;
			}
		}
		return receita;
	}	
}
