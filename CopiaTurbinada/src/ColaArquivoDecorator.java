
public abstract class ColaArquivoDecorator implements ColaArquivo{
	private final ColarStrategy arquivoColado;
	
	public ColaArquivoDecorator (ColarStrategy arquivoColado) {
		this.arquivoColado = arquivoColado;
	}
	
	@Override
	public void colar(String destino, String conteudo, String senha) {
		arquivoColado.colar(destino, conteudo, senha);
	}

}
