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
	
	//Gera��o dos vetores ordenados para verifica��o ap�s aplicar os algoritmos de ordena��o
	int [] checkInt = gera.vetorControle(tamanho);
	float [] checkFloat = cast.castIntToFloat(checkInt);
	double [] checkDouble = cast.castIntToDouble(checkInt);
	
	long tempoInicial;
	long tempoFinal;
	
	//Cria��o de Strings que ser�o usadas para o output de tempo no console
	String quantidadeElementos = "dez ";
	String organizacaoVetor;
	String tipoAlgoritmo;
	
	//Gera��o dos vetores quase ordenados para serem usados na bateria de testes a seguir
	@BeforeEach
	void testesQuaseOrganizado(){
		vetorInt = gera.vetorQuaseOrdenado(vetorInt);
		vetorFloat = cast.castIntToFloat(vetorInt);
		vetorDouble = cast.castIntToDouble(vetorInt);
		
	}
	
	@Test
	void insertionSortQuaseOrganizado() {
		
		//Defini��o das strings para o output
		organizacaoVetor = "quase organizado ";
		tipoAlgoritmo = "Insertion sort ";
				
		//Aplica��o do algoritmo nos tr�s tipos de vari�vel
		//O tempo � calculado em nanosegundos (exceto para um milh�o de elementos, em que foram usados milissegundos)
		tempoInicial = System.nanoTime();
		//Armazenamento do resultado da compara��o em um Boolean para an�lise posterior no assert
		boolean teste1 = Arrays.equals(checkInt, insertion.metodoDeOrdenacaoInt(vetorInt));
		tempoFinal = System.nanoTime();
		//Output com o tempo gasto para execu��o
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " int: " + (tempoFinal - tempoInicial) + "ns");
		//Os dados s�o exportados para um log atrav�s das configura��es de run do Eclipse
		
		tempoInicial = System.nanoTime();
		boolean teste2 = Arrays.equals(checkFloat, insertion.metodoDeOrdenacaoFloat(vetorFloat));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " float: " + (tempoFinal - tempoInicial) + "ns");
		
		tempoInicial = System.nanoTime();
		boolean teste3 = Arrays.equals(checkDouble, insertion.metodoDeOrdenacaoDouble(vetorDouble));
		tempoFinal = System.nanoTime();
		System.out.println(tipoAlgoritmo + quantidadeElementos + organizacaoVetor + " double: " + (tempoFinal - tempoInicial) + "ns");
		System.out.println("");
		
		//Verifica��o por assert dos resultados obtidos
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
	
	//Gera��o de vetores aleat�rios para a bateria de testes seguinte
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
	
	//Gera��o de vetores invertidos para a bateria de testes seguinte
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
