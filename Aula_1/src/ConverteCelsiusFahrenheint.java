
public class ConverteCelsiusFahrenheint {
	
	public static void main(String args[]) {
		float graus_entrada = 30;
		ConverteCelsiusFahrenheint conversor = new ConverteCelsiusFahrenheint();
		if (args[0].equals("C2F")) {
			conversor.conversorCelsiusParaFahrenheint(30);
		}
		if (args[0].equals("F2C")) {
			conversor.conversorFahrenheintParaCelsius(graus_entrada);
		}
		if (args[0].equals("F2K")) {
			conversor.conversorFahrenheintParaKelvin(graus_entrada);
		}
		if (args[0].equals("C2K")) {
			conversor.conversorCelsiusParaKelvin(graus_entrada);
		}
		if (args[0].equals("K2C")) {
			conversor.conversorKelvinParaCelsius(graus_entrada);
		}
		if (args[0].equals("K2F")) {
			conversor.conversorKelvinParaFahrenheint(graus_entrada);
		}
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
