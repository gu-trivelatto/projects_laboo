/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
public class SomaIngredientes {
	
	int [] somarIngredientes(String [] todosIngredientes,
								  String [] ingredientesReceita,
								  int [] quantidadeListaDeCompras,
								  int [] quantidadeIngredientesReceita) {
		
		for(int i = 0; i < ingredientesReceita.length; i++) {
			if(ingredientesReceita[i] != null) {
				int j = 0;
				while(!(ingredientesReceita[i].equalsIgnoreCase(todosIngredientes[j]))) {
					j++;
				}
				quantidadeListaDeCompras[j] += quantidadeIngredientesReceita[i];
			}
		}
		return quantidadeListaDeCompras;
	}
}
