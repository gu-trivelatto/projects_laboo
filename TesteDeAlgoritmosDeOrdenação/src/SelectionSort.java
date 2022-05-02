/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
public class SelectionSort implements InterfaceAlgoritmos {

	@Override
	public int[] metodoDeOrdenacaoInt(int[] sequencia) 
	{
		for (int fixo = 0; fixo < sequencia.length - 1; fixo++) 
		{
		    int menor = fixo;
		   
		    for (int i = menor + 1; i < sequencia.length; i++) 
		    {
		       if (sequencia[i] < sequencia[menor]) 
		       {
		    	   menor = i;
		       }
		    }
		    if (menor != fixo) 
		    {
		    	int t = sequencia[fixo];
		    	sequencia[fixo] = sequencia[menor];
		    	sequencia[menor] = t;
		    }
		  }
		return sequencia;
	}

	@Override
	public float[] metodoDeOrdenacaoFloat(float[] sequencia) 
	{
		for (int fixo = 0; fixo < sequencia.length - 1; fixo++) 
		{
		    int menor = fixo;
		   
		    for (int i = menor + 1; i < sequencia.length; i++) 
		    {
		       if (sequencia[i] < sequencia[menor]) 
		       {
		    	   menor = i;
		       }
		    }
		    if (menor != fixo) 
		    {
		    	float t = sequencia[fixo];
		    	sequencia[fixo] = sequencia[menor];
		    	sequencia[menor] = t;
		    }
		  }
		return sequencia;
	}

	@Override
	public double[] metodoDeOrdenacaoDouble(double[] sequencia)
	{
		for (int fixo = 0; fixo < sequencia.length - 1; fixo++) 
		{
		    int menor = fixo;
		   
		    for (int i = menor + 1; i < sequencia.length; i++) 
		    {
		       if (sequencia[i] < sequencia[menor]) 
		       {
		    	   menor = i;
		       }
		    }
		    if (menor != fixo) 
		    {
		    	double t = sequencia[fixo];
		    	sequencia[fixo] = sequencia[menor];
		    	sequencia[menor] = t;
		    }
		  }
		return sequencia;
	}

}
