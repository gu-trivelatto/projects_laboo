import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.zip.ZipInputStream;

public class CopiaCompactado extends CopiaArquivoDecorator{

	public CopiaCompactado(CopiadorStrategy arquivoCopiado) {
		super(arquivoCopiado);
	}
	
	
	/* Acredito não eu não tenha entendido exatamente o funcionamento do java.util.zip, porém, o método que usei para compactar
	 * me permitiu descompactar somente lendo o arquivo como se fosse um txt normal. 
	 * Portanto, se for possível gostaria de saber o que eu fiz de errado no processo de compactar/descompactar, obrigado.
	 */
	@Override
	public String copia(String entrada, String senha) {
		//byte[] buffer = new byte[2048];

        try (FileInputStream fis = new FileInputStream("Entrada/" + entrada);
                BufferedInputStream bis = new BufferedInputStream(fis);
                ZipInputStream stream = new ZipInputStream(bis)) {
        		/*
            	int len;
                while ((len = stream.read(buffer)) > 0) {
                	if(stream.available() == 1)
                		stream.read(buffer, 0, len);
                }
            String saida = new String(buffer); 
            */
            String conteudo = super.copia(entrada, null);
            return conteudo;
            
        }
        catch(Exception e) {
        	System.out.println("Erro na descompatação: " + e);
        	return null;
        }
		
	}

}
