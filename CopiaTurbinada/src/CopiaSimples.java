import java.io.BufferedReader;
import java.io.FileReader;

public class CopiaSimples implements CopiaArquivo {

	@Override
	public String copia(String entrada, String senha) {
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("Entrada/" + entrada);
			br = new BufferedReader(fr);
			String atual = br.readLine();
			String conteudo = atual;
			while(atual != null) {
				atual = br.readLine();
				if(atual != null) {
					conteudo = conteudo + "\n" + atual;
				}
				
			}
			br.close();
			return conteudo;
		}
		catch (Exception e) {
			System.out.println("Erro no arquivo: " + e);
			return null;
		}
		finally {
			try {
				if(br != null)
					br.close();
			}
			catch(Exception e) {
				System.out.println("Erro no arquivo: " + e);
				return null;
			}
		}
	}

}
