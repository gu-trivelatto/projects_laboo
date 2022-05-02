import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class CopiaCriptografado extends CopiaArquivoDecorator {

	public CopiaCriptografado(CopiadorStrategy arquivoCopiado) {
		super(arquivoCopiado);
	}
	
	@Override
	public String copia(String entrada, String senha) {
		byte[] decodedKey = Base64.getDecoder().decode(senha);
		
		try {
			String conteudo = super.copia(entrada, null);
			Cipher cipher = Cipher.getInstance("AES");
            SecretKey originalKey = new SecretKeySpec(Arrays.copyOf(decodedKey, 16), "AES");
            cipher.init(Cipher.DECRYPT_MODE, originalKey);
            byte[] saidaBytes = cipher.doFinal(Base64.getMimeDecoder().decode(conteudo.getBytes("UTF-8")));
            
			return new String(saidaBytes);
			
		}
		catch(Exception e) {
			System.out.println("Erro na descriptografia: " + e);
			return null;
		}
	}

}
