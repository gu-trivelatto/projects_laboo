/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VetoresDezTest {
	int elevado = 1;
	int tamanho = (int)Math.pow(10, elevado);
	
	InsertionSort insertion = new InsertionSort();
	SelectionSort selection = new SelectionSort();
	QuickSort quick = new QuickSort();
	MergeSort merge = new MergeSort();
	CastDeArray cast = new CastDeArray();
	CriaVetores gera = new CriaVetores();
	
	int [] vetorInt = new int[tamanho];
	float [] vetorFloat = new float[tamanho];
	double [] vetorDouble = new double[tamanho];
	
	//Geração dos vetores ordenados para verificação após aplicar os algoritmos de ordenação
	int [] checkInt = gera.vetorControle(tamanho);
	float [] checkFloat = cast.castIntToFloat(checkInt);
	double [] checkDouble = cast.castIntToDouble(checkInt);
	
	long tempoInicial;
	long tempoFinal;
	
	//Criação de Strings que serão usadas para o output de tempo no console
	String quantidadeElementos = "dez ";
	String organizacaoVetor;
	String tipoAlgoritmo;
	
	//Geração dos vetores quase ordenados para serem usados na bateria de testes a seguir
	@BeforeEach
	void testesQuaseOrganizado(){
		vetorInt = gera.vetorQuaseOrdenado(vetorInt);
		vetorFloat = cast.castIntToFloat(vetorInt);
		vetorDouble = cast.castIntToDouble(vetorInt);
		
	}
	
	@Test
	void insertionSortQuaseOrganizado() {
		
		//Definição das strings para o output
		organizacaoVetor = "quase organizado ";
		tipoAlgoritmo = "Insertion sort ";
				
		//Aplicação do algoritmo nos três tipos de variável
		//O tempo é calculado em nanosegundos (exceto para um milhão de elementos, em que foram usados milissegundos)
		tempoInicial = System.nanoTime();
		//Armazenamento do resultado da comparação em um Boolean para análise posterior no assert
		boolean teste1 = Arrays.equals(checkInt, insertion.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		//Output com o tempo gasto para execução
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		//Os dados são exportados para um log através das configurações de run do Eclipse
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, insertion.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, insertion.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		//Verificação por assert dos resultados obtidos
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	@Test
	void selectionSortQuaseOrganizado() {
		
		organizacaoVetor = "quase organizado ";
		tipoAlgoritmo = "Selection sort ";
		
		tempoInicial = System.nanoTime();
		boolean teste1 = Arrays.equals(checkInt, selection.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, selection.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, selection.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	@Test
	void quickSortQuaseOrganizado() {
		
		organizacaoVetor = "quase organizado ";
		tipoAlgoritmo = "Quick sort ";
		
		tempoInicial = System.nanoTime();
		boolean teste1 = Arrays.equals(checkInt, quick.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, quick.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, quick.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	@Test
	void mergeSortQuaseOrganizado() {
		
		organizacaoVetor = "quase organizado ";
		tipoAlgoritmo = "Merge sort ";
		
		tempoInicial = System.nanoTime();
		boolean teste1 = Arrays.equals(checkInt, merge.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, merge.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, merge.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	//Geração de vetores aleatórios para a bateria de testes seguinte
	@BeforeEach
	void testesTotalmenteAleatorios() {
		vetorInt = gera.vetorAleatorio(vetorInt);
		vetorFloat = cast.castIntToFloat(vetorInt);
		vetorDouble = cast.castIntToDouble(vetorInt);
		
	}
	
	@Test
	void insertionSortTotalmenteAleatorio() {
		
		organizacaoVetor = "aleatorio ";
		tipoAlgoritmo = "Insertion sort ";
		
		tempoInicial = System.nanoTime();
		boolean teste1 = Arrays.equals(checkInt, insertion.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, insertion.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, insertion.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	@Test
	void selectionSortTotalmenteAleatorio() {
		
		organizacaoVetor = "aleatorio ";
		tipoAlgoritmo = "Selection sort ";
		
		tempoInicial = System.nanoTime();
		boolean teste1 = Arrays.equals(checkInt, selection.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, selection.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, selection.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	@Test
	void quickSortTotalmenteAleatorio() {
		
		organizacaoVetor = "aleatorio ";
		tipoAlgoritmo = "Quick sort ";
		
		tempoInicial = System.nanoTime();
		boolean teste1 = Arrays.equals(checkInt, quick.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, quick.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, quick.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	@Test
	void mergeSortTotalmenteAleatorio() {
		
		organizacaoVetor = "aleatorio ";
		tipoAlgoritmo = "Merge sort ";
		
		tempoInicial = System.nanoTime();
		boolean teste1 = Arrays.equals(checkInt, merge.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, merge.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, merge.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	//Geração de vetores invertidos para a bateria de testes seguinte
	@BeforeEach
	void testesInvertido(){
		vetorInt = gera.vetorInvertido(vetorInt);
		vetorFloat = cast.castIntToFloat(vetorInt);
		vetorDouble = cast.castIntToDouble(vetorInt);
		
	}
	
	@Test
	void insertionSortTotalmenteInvertido() {
		
		organizacaoVetor = "invertido ";
		tipoAlgoritmo = "Insertion sort ";
		
		tempoInicial = System.nanoTime();
		boolean teste1 = Arrays.equals(checkInt, insertion.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, insertion.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, insertion.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	@Test
	void selectionSortTotalmenteInvertido() {
		
		organizacaoVetor = "invertido ";
		tipoAlgoritmo = "Selection sort ";
		
		tempoInicial = System.nanoTime();
		boolean teste1 = Arrays.equals(checkInt, selection.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, selection.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, selection.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	@Test
	void quickSortTotalmenteInvertido() {
		
		organizacaoVetor = "invertido ";
		tipoAlgoritmo = "Quick sort ";
		
		tempoInicial = System.nanoTime();
		boolean teste1 = Arrays.equals(checkInt, quick.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, quick.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, quick.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	@Test
	void mergeSortTotalmenteInvertido() {
		
		organizacaoVetor = "invertido ";
		tipoAlgoritmo = "Merge sort ";
		
		tempoInicial = System.nanoTime();
		boolean teste1 = Arrays.equals(checkInt, merge.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, merge.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, merge.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		assertEquals(teste1, true);
		assertEquals(teste2, true);
		assertEquals(teste3, true);
		
	}
	
	

}
