/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
public class CastDeArray {
	
	//Métodos utilizados no cast de arrays de int para double e de int para float
	float [] castIntToFloat(int [] array) {
		float [] arrayConvertida = new float[array.length];
		for(int i = 0; i < array.length; i++) {
			arrayConvertida[i] = (float)array[i];
		}
		return arrayConvertida;
	}
	
	double [] castIntToDouble(int [] array) {
		double [] arrayConvertida = new double[array.length];
		for(int i = 0; i < array.length; i++) {
			arrayConvertida[i] = (double)array[i];
		}
		return arrayConvertida;
	}
}
