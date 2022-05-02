/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import java.io.BufferedReader;
import java.io.FileReader;

public class LeituraTiposIngredientes {
	
	String [] ingredientesPossiveis(String nomeArquivo) {
		ContaLinhas contaLinhas = new ContaLinhas();
		String [] tiposIngredientes = new String[contaLinhas.numeroDeLinhas(nomeArquivo)];
		try {
			if(!(nomeArquivo.endsWith(".txt")))
				throw new FormatoDeArquivoErrado();
			FileReader fr = new FileReader(nomeArquivo);
			BufferedReader br = new BufferedReader(fr);
			int traco;
			for(int i = 0; i < (contaLinhas.numeroDeLinhas(nomeArquivo)); i++) {
				tiposIngredientes[i] = br.readLine();
				traco = tiposIngredientes[i].indexOf("-") - 1;
				tiposIngredientes[i] = tiposIngredientes[i].substring(0, traco);
			}
			br.close();
		}
		catch (Exception e) {
			System.out.println("Erro no arquivo dos ingredientes: " + e);
			return null;
		}
		return tiposIngredientes;
	}
}
