/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import java.io.BufferedReader;
import java.io.FileReader;

public class ContaLinhas {
	int numeroDeLinhas(String nomeArquivo) {
		int nLinhas = 0;
		try {
			FileReader fr = new FileReader(nomeArquivo);
			BufferedReader br = new BufferedReader(fr);
			while (br.readLine() != null) {
				nLinhas++;
			}
			br.close();
		}
		catch (Exception e) {
			System.out.println("Erro na contagem de linhas: " + e);
			return 0;
		}
		return nLinhas;
	}
}
