/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import java.io.FileWriter;
import java.io.PrintWriter;

public class ImprimeLista {
	void escreveNoArquivo(String [] todosIngredientes,
						  int [] quantidadeListaDeCompras,
						  String [] unidades) {
		try {
			FileWriter writer = new FileWriter("Saida/listaDeCompra.txt", false);
			PrintWriter print = new PrintWriter(writer);
			
			for(int i = 0; i < todosIngredientes.length; i++) {
				print.printf( "%s" + "%n" , (todosIngredientes[i] +
											 " - " +
											 quantidadeListaDeCompras[i] +
											 " " +
											 unidades[i]));
			}
			print.close();
		}
		catch (Exception e) {
			System.out.println("Problema na impressão: " + e);
		}
	}
}
