/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
public class LeReceita {  
	
	public static void main(String [] args) {
		ContaLinhas contaLinhas = new ContaLinhas();
		LeituraReceitas lerReceitas = new LeituraReceitas();
		LeituraIngredientes lerIngredientes = new LeituraIngredientes();
		LeituraTiposIngredientes lerTipos = new LeituraTiposIngredientes();
		LeituraQuantidadeIngredientes lerQuantidades = new LeituraQuantidadeIngredientes();
		LeituraUnidadesDeMedida lerUnidades = new LeituraUnidadesDeMedida();
		SomaIngredientes somarQuantidades = new SomaIngredientes();
		ImprimeLista printListaDeCompras = new ImprimeLista();
		GeradorDePDF geraPDF = new GeradorDePDF();
		
		int quantidadeDeIngredientes = contaLinhas.numeroDeLinhas("Receitas/tiposDeIngredientes.txt");
		int quantidadeDeReceitas = contaLinhas.numeroDeLinhas("Receitas/todasReceitas.txt");
		
		String [] listaDeReceitas = new String[quantidadeDeReceitas];
		String [] unidade = new String[quantidadeDeIngredientes];
		String [] todosIngredientes = new String[quantidadeDeIngredientes];
		String [] ingredientesReceita = new String[128];
		int [] quantidadeListaDeCompras = new int[quantidadeDeIngredientes];
		int [] quantidadeIngredientesReceita = new int[128];
		
		listaDeReceitas = lerReceitas.receitas("Receitas/todasReceitas.txt");
		
		todosIngredientes = lerTipos.ingredientesPossiveis("Receitas/tiposDeIngredientes.txt");
		for(int i = 0; i < listaDeReceitas.length; i++) {
			ingredientesReceita = lerIngredientes.leArquivo(listaDeReceitas[i], todosIngredientes);
			quantidadeIngredientesReceita = lerQuantidades.leArquivo(listaDeReceitas[i]);
			quantidadeListaDeCompras = somarQuantidades.somarIngredientes(todosIngredientes, ingredientesReceita, quantidadeListaDeCompras, quantidadeIngredientesReceita);
		}
		unidade = lerUnidades.leArquivo("Receitas/tiposDeIngredientes.txt");
		printListaDeCompras.escreveNoArquivo(todosIngredientes, quantidadeListaDeCompras, unidade);
		geraPDF.criaPDF("Receitas/todasReceitas.txt", listaDeReceitas.length);
		for(int i = 0; i < listaDeReceitas.length; i++) {
			geraPDF.escrevePDF(listaDeReceitas[i], i);
		}
		
	}
	
}  