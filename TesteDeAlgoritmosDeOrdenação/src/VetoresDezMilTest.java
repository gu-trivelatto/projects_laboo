/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VetoresDezMilTest {
	int elevado = 4;
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
	
	int [] checkInt = gera.vetorControle(tamanho);
	float [] checkFloat = cast.castIntToFloat(checkInt);
	double [] checkDouble = cast.castIntToDouble(checkInt);
	
	long tempoInicial;
	long tempoFinal;
	
	String quantidadeElementos = "dez mil ";
	String organizacaoVetor;
	String tipoAlgoritmo;

	@BeforeEach
	void testesQuaseOrganizado(){
		vetorInt = gera.vetorQuaseOrdenado(vetorInt);
		vetorFloat = cast.castIntToFloat(vetorInt);
		vetorDouble = cast.castIntToDouble(vetorInt);
		
	}
	
	@Test
	void insertionSortQuaseOrganizado() {
		
		organizacaoVetor = "quase organizado ";
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
