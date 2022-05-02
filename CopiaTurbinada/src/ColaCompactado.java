import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ColaCompactado extends ColaArquivoDecorator{

	public ColaCompactado(ColarStrategy arquivoColado) {
		super(arquivoColado);
	}
	
	public void cola(String destino, String saida) {
		try {
			FileOutputStream fos = new FileOutputStream("Saida/" + destino); 
	        ZipOutputStream zos = new ZipOutputStream(fos);
	        
	        ZipEntry ze1 = new ZipEntry("ZipEntry1");
	        zos.putNextEntry(ze1);
	        byte[] conteudoByte = saida.getBytes();
	        zos.write(conteudoByte, 0, conteudoByte.length);
	        
	        zos.closeEntry();
	        zos.finish();
	        zos.close();
	        
		}
		catch(Exception e) {
			System.out.println("Erro na compactação: " + e);
		}
	}

}
