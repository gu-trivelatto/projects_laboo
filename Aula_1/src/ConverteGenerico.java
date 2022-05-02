public class ConverteGenerico {
	
	public static void main(String args[]) {
		float tempEntrada = Float.valueOf(args[0]).floatValue();
		ConverteGenerico conversor = new ConverteGenerico();
		conversor.ConverteGenerico(tempEntrada);
	}
	
	float conversorCelsiusParaFahrenheint(float graus_entrada) {
		float graus_saida = (9*graus_entrada/5) + 32;
		return graus_saida;
	}
	
	float conversorFahrenheintParaCelsius(float graus_entrada) {
		float graus_saida = 5*(graus_entrada - 32)/9;
		return graus_saida;
	}
	
	float conversorFahrenheintParaKelvin(float graus_entrada) {
		float graus_saida = ((9*graus_entrada/5) + 32) + 273;
		return graus_saida;
	}
	float conversorCelsiusParaKelvin(float graus_entrada) {
		float graus_saida = graus_entrada + 273;
		return graus_saida;
	}
	float conversorKelvinParaCelsius(float graus_entrada) {
		float graus_saida = graus_entrada - 273;
		return graus_saida;
	}
	float conversorKelvinParaFahrenheint(float graus_entrada) {
		float graus_saida = (9*(graus_entrada - 273)/5) + 32;
		return graus_saida;
	}
}