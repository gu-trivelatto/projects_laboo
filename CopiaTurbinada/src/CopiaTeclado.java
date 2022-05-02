import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CopiaTeclado implements CopiadorStrategy{

	@Override
	public String copia(String entrada, String senha) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String conteudo = br.readLine();
			br.close();
			return conteudo;
		}
		catch(Exception e) {
			System.out.println("Erro na leitura do teclado: " + e);
			return null;
		}
		finally {
			try {
				if(br != null)
					br.close();
			}
			catch(Exception e) {
				System.out.println("Erro ao fechar o BufferedReader: " + e);
				return null;
			}
		}
	}
}
