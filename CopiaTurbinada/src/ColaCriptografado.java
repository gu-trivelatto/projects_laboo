import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class ColaCriptografado extends ColaArquivoDecorator{

	public ColaCriptografado(ColarStrategy arquivoColado) {
		super(arquivoColado);
	}
	
	public void colar(String destino, String conteudo, String senha) {
		byte[] decodedKey = Base64.getDecoder().decode(senha);
		try {
			Cipher cipher = Cipher.getInstance("AES");
            SecretKey originalKey = new SecretKeySpec(Arrays.copyOf(decodedKey, 16), "AES");
            cipher.init(Cipher.ENCRYPT_MODE, originalKey);
            byte[] saidaBytes = cipher.doFinal(conteudo.getBytes("UTF-8"));
            String saida = Base64.getEncoder().encodeToString(saidaBytes);
			super.colar(destino, saida, null);
		}
		catch(Exception e) {
			System.out.println("Erro na descriptografia: " + e);
		}
	}
}
