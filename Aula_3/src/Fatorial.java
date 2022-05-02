
public class Fatorial {
	
	long fatorial(long xeni) {
		long resultado = 1;
		if(xeni < 0)
			return -1;
		else if(xeni == 0) {
			return 1;
		}
		else {
			while(xeni > 0) {
				resultado *= xeni;
				xeni--;
			}
		}
		return resultado;
	}
}
