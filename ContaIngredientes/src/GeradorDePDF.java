/**********************************************************/
/*******Gustavo Trivelatto Gabriel*************************/
/*******NUSP: 11260908*************************************/
/**********************************************************/
import java.io.File;
import java.io.FileInputStream;

import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage; 
import org.apache.pdfbox.pdmodel.PDPageContentStream; 
import org.apache.pdfbox.pdmodel.font.PDType1Font;

//import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class GeradorDePDF {
	
	void criaPDF(String nomeArquivo, int numDeReceitas) {
		try{
			PDDocument receitas = new PDDocument();
			//PDPage my_page = new PDPage();
			//for(int i = 0; i < numDeReceitas; i++) {
			//	receitas.addPage(my_page);
			//}
			receitas.save("Saida/Receitas.pdf");
			receitas.close();
		}
		catch(Exception e) {
			System.out.println("Problema na geração de PDF: " + e);
		}
	}
	
	void escrevePDF(String nomeArquivo, int numPagina) {
		ContaLinhas linhas = new ContaLinhas();
		try {
			File arquivo = new File("Saida/Receitas.pdf");
			PDDocument documento = PDDocument.load(arquivo);
			File fr = new File(nomeArquivo);
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fr), "UTF-8"));
			PDPage pagina = new PDPage();
			documento.addPage(pagina);
			documento.getPage(numPagina);
		    PDPageContentStream contentStream = new PDPageContentStream(documento, pagina);
		    contentStream.beginText();
		    contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
		    contentStream.newLineAtOffset(25, 700);
		    for(int i = 0; i < linhas.numeroDeLinhas(nomeArquivo); i++) {
		    	contentStream.showText(br.readLine());
		    	contentStream.newLineAtOffset(0, -15);
		    }
		    contentStream.endText();
		    contentStream.close();
		    documento.save("Saida/Receitas.pdf");
		    documento.close();
		    br.close();
		    
		}
		catch(Exception e) {
			System.out.println("Problema na escrita do PDF: " + e);
		}
		
	}
}
