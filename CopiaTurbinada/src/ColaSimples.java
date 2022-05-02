import java.io.FileWriter;
import java.io.PrintWriter;

public class ColaSimples implements ColaArquivo{

	@Override
	public void colar(String destino, String conteudo, String senha) {
		try {
			FileWriter writer = new FileWriter("Saida/" + destino, false);
			PrintWriter print = new PrintWriter(writer);
			
			print.printf( "%s" + "%n" , conteudo);
			
			print.close();
		}
		catch (Exception e) {
			System.out.println("Problema na impressão: " + e);
		}
		
	}

}
