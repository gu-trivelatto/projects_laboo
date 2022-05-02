/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import java.util.Random;

//Método para criação de vetores do tipo Int que serão posteriormente convertidos para Float e Double através da classe CastDeArray
public class CriaVetores {
	
	Random rand = new Random();
	
	//Cria um vetor ordenado para comparar com o resultado do algoritmo
	int [] vetorControle(int tamanho) {
		int [] vetor = new int[tamanho];
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = i;
		}
		return vetor;
	}
	
	//Cria um vetor quase ordenado
	//Através desse método é criado um vetor ordenado que em seguida tem dois números invertidos a cada cinco elementos
	int [] vetorQuaseOrdenado(int [] vetor) {
		for(int i = 0; i < vetor.length; i++)
			vetor[i] = i;
		for(int i = 2; i< vetor.length; i = i + 5) {
			vetor[i]++;
			vetor[i+1]--;
		}
		return vetor;
	}
	
	//Cria um vetor aleatório sem repetição e contendo todos os valores de 0 até o tamanho desejado no vetor
	int [] vetorAleatorio(int [] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			int proximoNumero = rand.nextInt(vetor.length);
			boolean numeroRepetido = false;
			if(i == 0)
				vetor[i] = proximoNumero;
			else {
				//Verifica se o número sorteado no random já foi inserido no vetor
				for(int j = i; j >= 0; j--) {
					if(proximoNumero == vetor[j]) {
						numeroRepetido = true;
					}
				}
				if(numeroRepetido == false)
					vetor[i] = proximoNumero;
				else
					i--;
			}
		}
		return vetor;
	}
	
	//Cria um vetor na ordem inversa
	int [] vetorInvertido(int [] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (vetor.length-1) - i;
		}
		return vetor;
	}
}
