
public class Copiador {
	public static void main(String [] args) {
		String conteudo = null;
		
		
		if(args[1].equals("-teclado")) {
			CopiaTeclado copiaTeclado = new CopiaTeclado();
			conteudo = copiaTeclado.copia(null, null);
		}
		else if(args[1].equals("-arquivo")) {
			if(args[2].equals("-comprimido")) {
				if(args[3].equals("-criptografado")) {
					CopiaArquivo copiaCompleta = new CopiaCriptografado(new CopiaCompactado(new CopiaSimples()));
					conteudo = copiaCompleta.copia(args[6], args[5]);
				}
				else {
					CopiaArquivo copiaComprimido = new CopiaCompactado(new CopiaSimples());
					conteudo = copiaComprimido.copia(args[3], null);
				}
			}
			else if(args[2].equals("-criptografado")) {
				if(args[3].equals("-comprimido")) {
					CopiaArquivo copiaCompleta = new CopiaCriptografado(new CopiaCompactado(new CopiaSimples()));
					conteudo = copiaCompleta.copia(args[6], args[5]);
				}
				else {
					CopiaArquivo copiaCriptografado = new CopiaCriptografado(new CopiaSimples());
					conteudo = copiaCriptografado.copia(args[5], args[4]);
				}
			}
			else {
				CopiaArquivo copiaSimples = new CopiaSimples();
				conteudo = copiaSimples.copia(args[2], null);
			}	
			
		}
		else {
			System.err.println("Formato inválido.");
			System.exit(1);
		}
		
		//laço para calcular o indice do parametro fixo "-destino", para usar como base para os parametros subsequentes
		int i = 0;
		while(!(args[i].equals("-destino")) && i < args.length - 1) {
			i++;
		}
		if(!(args[i].equals("-destino"))) {
			System.err.println("Formato inválido.");
			System.exit(1);
		}
		
		
		if(args[i + 1].equals("-tela")) {
			ColaTela colarTela = new ColaTela();
			colarTela.colar(null, conteudo, null);
		}
		else if(args[i + 1].equals("-arquivo")) {
			if(args[i + 2].equals("-comprimido")) {
				if(args[i + 3].equals("-criptografado")){
					ColaArquivo colaCompleto = new ColaCompactado(new ColaCriptografado(new ColaSimples()));
					colaCompleto.colar(args[i + 6], conteudo, args[i + 5]);
				}
				else {
					ColaArquivo colaComprimido = new ColaCompactado(new ColaSimples());
					colaComprimido.colar(args[i + 3], conteudo, null);
				}
			}
			else if(args[i + 2].equals("-criptografado")) {
				if(args[i + 3].equals("-comprimido")){
					ColaArquivo colaCompleto = new ColaCompactado(new ColaCriptografado(new ColaSimples()));
					colaCompleto.colar(args[i + 6], conteudo, args[i + 5]);
				}
				else {
					ColaArquivo colaCriptografado = new ColaCriptografado(new ColaSimples());
					colaCriptografado.colar(args[i + 5], conteudo, args[i + 4]);
				}
			}
			else {
				ColaArquivo colaSimples = new ColaSimples();
				colaSimples.colar(args[i + 2], conteudo, null);
			}	
		}
		else {
			System.err.println("Formato inválido.");
			System.exit(1);
		}
	}
}
