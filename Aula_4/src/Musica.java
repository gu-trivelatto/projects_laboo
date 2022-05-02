
public class Musica {
	String titulo, album, compositor, interprete;
	int ano;


	public static void main(String args[]) {
		
	}
	
	int[] buscaPorTitulo (Musica musica[], String titulo) {
		int [] indicesMusica = new int[10];
		int indice = 0;
		for(int i = 0; i < musica.length; i++) {
			if(musica[i].titulo.equals(titulo)) {
				indicesMusica[indice] = i;
				indice++;
			}
		}
		
		return indicesMusica;
	}
	
	int[] buscaPorCompositor (Musica musica[], String compositor) {
		int [] indicesMusica = new int[10];
		int indice = 0;
		for(int i = 0; i < musica.length; i++) {
			if(musica[i].compositor.equals(compositor)) {
				indicesMusica[indice] = i;
				indice++;
			}
		}
		
		return indicesMusica;
	}
	
	int[] buscaPorInterprete (Musica musica[], String interprete) {
		int [] indicesMusica = new int[10];
		int indice = 0;
		for(int i = 0; i < musica.length; i++) {
			if(musica[i].interprete.equals(interprete)) {
				indicesMusica[indice] = i;
				indice++;
			}
		}
		
		return indicesMusica;
	}
	
	int[] buscaPorPeriodo (Musica musica[], int periodo[]) {
		int [] indicesMusica = new int[10];
		int indice = 0;
		for(int i = 0; i < musica.length; i++) {
			if(musica[i].ano >= periodo[0] && musica[i].ano <= periodo[1]) {
				indicesMusica[indice] = i;
				indice++;
			}
		}
		
		return indicesMusica;
	}
	
	int[] buscaPorTamanhoMax (Musica musica[], int tamanhoMax) {
		int [] indicesMusica = new int[10];
		int indice = 0;
		for(int i = 0; i < musica.length; i++) {
			if(musica[i] instanceof MusicaMP3)
				if(((MusicaMP3)musica[i]).tamanhoEmBytes > tamanhoMax) {
					indicesMusica[indice] = i;
					indice++;
				}
		}
		
		return indicesMusica;
	}
	

}