/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
public class QuickSort implements InterfaceAlgoritmos {

	@Override
	public int[] metodoDeOrdenacaoInt(int[] sequencia)
	{
		int inicio = 0;
		int fim = sequencia.length-1;
		int[] organizado = quickSortInt(sequencia, inicio, fim);
		return organizado;
	}
	
	public int[] quickSortInt(int[] vetor, int inicio, int fim) 
	{
        if (inicio < fim) 
        {
               int posicaoPivo = separarInt(vetor, inicio, fim);
               quickSortInt(vetor, inicio, posicaoPivo - 1);
               quickSortInt(vetor, posicaoPivo + 1, fim);
        }
        return vetor;
	}

  private static int separarInt(int[] vetor, int inicio, int fim) 
  {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) 
        {
               if (vetor[i] <= pivo)
                      i++;
               else if (pivo < vetor[f])
                      f--;
               else 
               {
                      int troca = vetor[i];
                      vetor[i] = vetor[f];
                      vetor[f] = troca;
                      i++;
                      f--;
               }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
  }

	@Override
	public float[] metodoDeOrdenacaoFloat(float[] sequencia) 
	{
		int inicio = 0;
		int fim = sequencia.length-1;
		float[] organizado = quickSortFloat(sequencia, inicio, fim);
		return organizado;
	}
	
	public float[] quickSortFloat(float[] vetor, int inicio, int fim) 
	{
        if (inicio < fim) 
        {
               int posicaoPivo = separarFloat(vetor, inicio, fim);
               quickSortFloat(vetor, inicio, posicaoPivo - 1);
               quickSortFloat(vetor, posicaoPivo + 1, fim);
        }
        return vetor;
	}
	
	private static int separarFloat(float[] vetor, int inicio, int fim) 
	{
        float pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) 
        {
               if (vetor[i] <= pivo)
                      i++;
               else if (pivo < vetor[f])
                      f--;
               else 
               {
                      float troca = vetor[i];
                      vetor[i] = vetor[f];
                      vetor[f] = troca;
                      i++;
                      f--;
               }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
  }

	@Override
	public double[] metodoDeOrdenacaoDouble(double[] sequencia) 
	{
		int inicio = 0;
		int fim = sequencia.length-1;
		double[] organizado = quickSortDouble(sequencia, inicio, fim);
		return organizado;
	}
	
	public double[] quickSortDouble(double[] vetor, int inicio, int fim) 
	{
        if (inicio < fim) 
        {
               int posicaoPivo = separarDouble(vetor, inicio, fim);
               quickSortDouble(vetor, inicio, posicaoPivo - 1);
               quickSortDouble(vetor, posicaoPivo + 1, fim);
        }
        return vetor;
	}
	
	private static int separarDouble(double[] vetor, int inicio, int fim) 
	{
        double pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f)
        {
               if (vetor[i] <= pivo)
                      i++;
               else if (pivo < vetor[f])
                      f--;
               else 
               {
                      double troca = vetor[i];
                      vetor[i] = vetor[f];
                      vetor[f] = troca;
                      i++;
                      f--;
               }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
  }

}
