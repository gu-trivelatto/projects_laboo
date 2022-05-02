/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import java.io.FileReader;
import java.io.BufferedReader;

public class LeituraQuantidadeIngredientes {
	
	int [] leArquivo(String nomeArquivo) {
		ContaLinhas contaLinhas = new ContaLinhas();
		String [] quantidades = new String[contaLinhas.numeroDeLinhas(nomeArquivo)];
		int [] quantidadesInt = new int[contaLinhas.numeroDeLinhas(nomeArquivo)];
		
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(nomeArquivo);
			br = new BufferedReader(fr);
			
			int traco;
			int i = 0;
			quantidades[i] = br.readLine();
			while(!(quantidades[i].equalsIgnoreCase("ingredientes:"))) {
				quantidades[i] = br.readLine();
			}
			String comparador = quantidades[i];
			while(!(comparador.equals(""))) {
				comparador = br.readLine();
				if(!(comparador.equals(""))) {
					quantidades[i] = comparador;
					traco = quantidades[i].indexOf("-") + 2;
					quantidades[i] = quantidades[i].substring(traco);
					quantidadesInt[i] = Integer.parseInt(quantidades[i]);
				}
				i++;	
			} 
			
		}
		catch (Exception e) {
			System.out.println("Erro na quantidade: " + e);
			return null;
		}
		finally {
			try{
				if(br != null)
					br.close();
			}
			catch(Exception e) {
				System.out.println("Erro na leitura das quantidades: " + e);
				return null;
			}
		}
		return quantidadesInt;
	} 
	
	
}
