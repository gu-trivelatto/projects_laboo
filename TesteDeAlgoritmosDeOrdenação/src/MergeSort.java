/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
public class MergeSort implements InterfaceAlgoritmos 
{

	@Override
	public int[] metodoDeOrdenacaoInt(int[] sequencia) 
	{
		mergeSortInt(sequencia, 0, sequencia.length - 1);
		return sequencia;
	}
	
	void mergeSortInt(int[] sequencia, int baixo, int alto) 
	{
	    if (alto <= baixo) return;

	    int meio = (baixo+alto)/2;
	    mergeSortInt(sequencia, baixo, meio);
	    mergeSortInt(sequencia, meio+1, alto);
	    mergeInt(sequencia, baixo, meio, alto);
	}
	
	void mergeInt(int[] sequencia, int baixo, int medio, int alto) 
	{
	    int sequenciaEsquerda[] = new int[medio - baixo + 1];
	    int sequenciaDireita[] = new int[alto - medio];

	    for (int i = 0; i < sequenciaEsquerda.length; i++)
	        sequenciaEsquerda[i] = sequencia[baixo + i];
	    for (int i = 0; i < sequenciaDireita.length; i++)
	        sequenciaDireita[i] = sequencia[medio + i + 1];

	    int indiceEsquerdo = 0;
	    int indiceDireito = 0;

	    for (int i = baixo; i < alto + 1; i++) 
	    {
	        if (indiceEsquerdo < sequenciaEsquerda.length && indiceDireito < sequenciaDireita.length) 
	        {
	            if (sequenciaEsquerda[indiceEsquerdo] < sequenciaDireita[indiceDireito]) 
	            {
	               sequencia[i] = sequenciaEsquerda[indiceEsquerdo];
	               indiceEsquerdo++;
	            } 
	            else 
	            {
	                sequencia[i] = sequenciaDireita[indiceDireito];
	                indiceDireito++;
	            }
	        } 
	        else if (indiceEsquerdo < sequenciaEsquerda.length) 
	        {
	            sequencia[i] = sequenciaEsquerda[indiceEsquerdo];
	            indiceEsquerdo++;
	        } 
	        else if (indiceDireito < sequenciaDireita.length) 
	        {
	            sequencia[i] = sequenciaDireita[indiceDireito];
	            indiceDireito++;
	        }
	    }
	}

	@Override
	public float[] metodoDeOrdenacaoFloat(float[] sequencia) 
	{
		mergeSortFloat(sequencia, 0, sequencia.length - 1);
		return sequencia;
	}
	
	void mergeSortFloat(float[] sequencia, int baixo, int alto) 
	{
	    if (alto <= baixo) return;

	    int meio = (baixo+alto)/2;
	    mergeSortFloat(sequencia, baixo, meio);
	    mergeSortFloat(sequencia, meio+1, alto);
	    mergeFloat(sequencia, baixo, meio, alto);
	}
	
	void mergeFloat(float[] sequencia, int baixo, int medio, int alto) 
	{
	    float sequenciaEsquerda[] = new float[medio - baixo + 1];
	    float sequenciaDireita[] = new float[alto - medio];

	    for (int i = 0; i < sequenciaEsquerda.length; i++)
	        sequenciaEsquerda[i] = sequencia[baixo + i];
	    for (int i = 0; i < sequenciaDireita.length; i++)
	        sequenciaDireita[i] = sequencia[medio + i + 1];

	    int indiceEsquerdo = 0;
	    int indiceDireito = 0;

	    for (int i = baixo; i < alto + 1; i++) 
	    {
	        if (indiceEsquerdo < sequenciaEsquerda.length && indiceDireito < sequenciaDireita.length)
	        {
	            if (sequenciaEsquerda[indiceEsquerdo] < sequenciaDireita[indiceDireito]) 
	            {
	               sequencia[i] = sequenciaEsquerda[indiceEsquerdo];
	               indiceEsquerdo++;
	            } 
	            else 
	            {
	                sequencia[i] = sequenciaDireita[indiceDireito];
	                indiceDireito++;
	            }
	        } 
	        else if (indiceEsquerdo < sequenciaEsquerda.length) 
	        {
	            sequencia[i] = sequenciaEsquerda[indiceEsquerdo];
	            indiceEsquerdo++;
	        } 
	        else if (indiceDireito < sequenciaDireita.length) 
	        {
	            sequencia[i] = sequenciaDireita[indiceDireito];
	            indiceDireito++;
	        }
	    }
	}

	@Override
	public double[] metodoDeOrdenacaoDouble(double[] sequencia) 
	{
		mergeSortDouble(sequencia, 0, sequencia.length - 1);
		return sequencia;
	}
	
	void mergeSortDouble(double[] sequencia, int baixo, int alto) 
	{
	    if (alto <= baixo) return;

	    int meio = (baixo+alto)/2;
	    mergeSortDouble(sequencia, baixo, meio);
	    mergeSortDouble(sequencia, meio+1, alto);
	    mergeDouble(sequencia, baixo, meio, alto);
	}
	
	void mergeDouble(double[] sequencia, int baixo, int medio, int alto) 
	{
	    double sequenciaEsquerda[] = new double[medio - baixo + 1];
	    double sequenciaDireita[] = new double[alto - medio];

	    for (int i = 0; i < sequenciaEsquerda.length; i++)
	        sequenciaEsquerda[i] = sequencia[baixo + i];
	    for (int i = 0; i < sequenciaDireita.length; i++)
	        sequenciaDireita[i] = sequencia[medio + i + 1];

	    int indiceEsquerdo = 0;
	    int indiceDireito = 0;

	    for (int i = baixo; i < alto + 1; i++) 
	    {
	        if (indiceEsquerdo < sequenciaEsquerda.length && indiceDireito < sequenciaDireita.length) {
	            if (sequenciaEsquerda[indiceEsquerdo] < sequenciaDireita[indiceDireito]) {
	               sequencia[i] = sequenciaEsquerda[indiceEsquerdo];
	               indiceEsquerdo++;
	            } 
	            else 
	            {
	                sequencia[i] = sequenciaDireita[indiceDireito];
	                indiceDireito++;
	            }
	        } 
	        else if (indiceEsquerdo < sequenciaEsquerda.length) 
	        {
	            sequencia[i] = sequenciaEsquerda[indiceEsquerdo];
	            indiceEsquerdo++;
	        } 
	        else if (indiceDireito < sequenciaDireita.length) 
	        {
	            sequencia[i] = sequenciaDireita[indiceDireito];
	            indiceDireito++;
	        }
	    }
	}

}
