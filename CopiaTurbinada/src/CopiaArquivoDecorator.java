
public abstract class CopiaArquivoDecorator implements CopiaArquivo{
	private final CopiadorStrategy arquivoCopiado;
	
	public CopiaArquivoDecorator (CopiadorStrategy arquivoCopiado) {
		this.arquivoCopiado = arquivoCopiado;
	}
	
	@Override
	public String copia(String entrada, String senha) {
		return arquivoCopiado.copia(entrada, null);
	}

}
