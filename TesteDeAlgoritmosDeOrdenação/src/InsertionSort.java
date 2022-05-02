/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
public class InsertionSort implements InterfaceAlgoritmos {

	@Override
	public int[] metodoDeOrdenacaoInt(int[] sequencia) 
	{
		int j;
	    int memoria;
	    int i;
	    
	    for (j = 1; j < sequencia.length; j++)
	    {
	    	memoria = sequencia[j];
	    	for (i = j - 1; (i >= 0) && (sequencia[i] > memoria); i--)
	    	{
	    		sequencia[i + 1] = sequencia[i];
	    	}
	        sequencia[i + 1] = memoria;
	    }
	    
		return sequencia;
	}

	@Override
	public float[] metodoDeOrdenacaoFloat(float[] sequencia) 
	{
		int j;
	    float memoria;
	    int i;
	    
	    for (j = 1; j < sequencia.length; j++)
	    {
	    	memoria = sequencia[j];
	    	for (i = j - 1; (i >= 0) && (sequencia[i] > memoria); i--)
	    	{
	    		sequencia[i + 1] = sequencia[i];
	    	}
	        sequencia[i + 1] = memoria;
	    }
	    
		return sequencia;
	}

	@Override
	public double[] metodoDeOrdenacaoDouble(double[] sequencia) 
	{
		int j;
	    double memoria;
	    int i;
	    
	    for (j = 1; j < sequencia.length; j++)
	    {
	    	memoria = sequencia[j];
	    	for (i = j - 1; (i >= 0) && (sequencia[i] > memoria); i--)
	    	{
	    		sequencia[i + 1] = sequencia[i];
	    	}
	        sequencia[i + 1] = memoria;
	    }
	    
		return sequencia;
	}

}
