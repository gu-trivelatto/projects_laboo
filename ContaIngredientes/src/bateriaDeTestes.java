/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bateriaDeTestes {
	LeituraReceitas lerReceitas = new LeituraReceitas();
	LeituraIngredientes lerIngredientes = new LeituraIngredientes();
	LeituraTiposIngredientes lerTipos = new LeituraTiposIngredientes();
	LeituraQuantidadeIngredientes lerQuantidade = new LeituraQuantidadeIngredientes();
	ContaLinhas contaLinhas = new ContaLinhas();

	@Test
	void arquivoNaoTxt() {
		assertEquals(null, lerReceitas.receitas("Receitas/receitasNaoTxt.txt"));
	}
	
	@Test
	void ingredienteInexistente() {
		assertEquals(null, lerIngredientes.leArquivo("Receitas/ingredientesComErros.txt", 
													 lerTipos.ingredientesPossiveis("Receitas/tiposDeIngredientes.txt")));
	}
	
	@Test
	void arquivoInexistente() {
		assertEquals(null, lerReceitas.receitas("Receitas/receita.txt"));
	}
	
	@Test
	void caminhoNulo() {
		assertEquals(null, lerTipos.ingredientesPossiveis(""));
	}
	
	@Test
	void letrasNasUnidades() {
		assertEquals(null, lerQuantidade.leArquivo("Receitas/assadoDeTofuComErro.txt"));
	}
	
	@Test
	void arquivoVazio() {
		assertEquals(0, contaLinhas.numeroDeLinhas("Receitas/vazio.txt"));
	}

}
