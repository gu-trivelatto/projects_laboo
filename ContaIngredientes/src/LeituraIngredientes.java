/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import java.io.FileReader;
import java.io.BufferedReader;

public class LeituraIngredientes {
	
	String [] leArquivo(String nomeArquivo, String [] ingredientesPossiveis) {
		ContaLinhas contaLinhas = new ContaLinhas();
		String [] conteudoLinhas = new String[contaLinhas.numeroDeLinhas(nomeArquivo)];
		
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(nomeArquivo);
			br = new BufferedReader(fr); 
			int traco;
			int i = 0;
			conteudoLinhas[i] = br.readLine();
			while(!(conteudoLinhas[i].equalsIgnoreCase("ingredientes:"))) {
				conteudoLinhas[i] = br.readLine();
			}
			String comparador = conteudoLinhas[i];
			boolean ingredienteExiste;
			while(!(comparador.equals(""))) {
				comparador = br.readLine();
				if(!(comparador.equals(""))) {
					conteudoLinhas[i] = comparador;
					traco = conteudoLinhas[i].indexOf("-") - 1;
					conteudoLinhas[i] = conteudoLinhas[i].substring(0, traco);
					ingredienteExiste = false;
					for(int j = 0; j < ingredientesPossiveis.length; j++) {
						if(conteudoLinhas[i].equalsIgnoreCase(ingredientesPossiveis[j])) {
							ingredienteExiste = true;
						}
					}
					if(ingredienteExiste == false) 
						throw new IngredienteDesconhecido();
				}
				i++;	
			} 	
		}
		catch (Exception e) {
			System.out.println("Erro no arquivo da receita: " + e);
			return null;
		}
		finally {
			try {
				if(br != null)
					br.close();
			}
			catch(Exception e) {
				System.out.println("Erro no arquivo da receita: " + e);
				return null;
			}
		}
		return conteudoLinhas;
	} 
	
	
}
