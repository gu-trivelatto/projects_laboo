
public class Conta_corrente {
	String titularPrincipal;
	String titularesDaConta[] = new String[10];
	String nome[] = new String[10]; 
	String CPF[] = new String[10]; 
	String RG[] = new String[10];
	int numeroDaConta;
	Endereco enderecoCompleto = new Endereco();
	
	public static void main(String args[]) {
		
		Conta_corrente conta1 = new Conta_corrente();
		
		conta1.titularPrincipal = "Leonora Santos";
		conta1.titularesDaConta[0] = "Leonora Santos";
		conta1.titularesDaConta[1] = "Rogerio Santos";
		conta1.numeroDaConta = 14852-8;
		conta1.nome[0] = "Rogerio Santos";
		conta1.nome[1] = "Leonora Santos";
		conta1.CPF[0] = "158.684.975-54";
		conta1.CPF[1] = "304.652.371-36";
		conta1.RG[0] = "85.945.824-8";
		conta1.RG[1] = "47.652.854-6";
		conta1.enderecoCompleto.estado = "Sao Paulo";
		conta1.enderecoCompleto.cidade = "Sao Paulo";
		conta1.enderecoCompleto.bairro = "Itaquera";
		conta1.enderecoCompleto.rua = "Rua Sestilio Melani";
		conta1.enderecoCompleto.numero = "737";
		conta1.enderecoCompleto.CEP = "08225-485";
		
		Conta_corrente conta2 = new Conta_corrente();
	
		conta2.titularPrincipal = "Marcos Ferreira";
		conta2.titularesDaConta[0] = "Marcos Ferreira";
		conta2.numeroDaConta = 27412-7;
		conta2.nome[0] = "Marcos Ferreira";
		conta2.CPF[0] = "314.456.529-04";
		conta2.RG[0] = "17.912.412-1";
		conta2.enderecoCompleto.estado = "Sao Paulo";
		conta2.enderecoCompleto.cidade = "Diadema";
		conta2.enderecoCompleto.bairro = "Vila Conceicao";
		conta2.enderecoCompleto.rua = "Rua Bororos";
		conta2.enderecoCompleto.numero = "427";
		conta2.enderecoCompleto.CEP = "09990-270";
		
		conta1.contaTitulares(conta1);
		conta2.contaTitulares(conta2);
	}
	
	void contaTitulares(Conta_corrente conta) {
		Conta_corrente metodo = new Conta_corrente();
		int titulares = 0;
		while(conta.titularesDaConta[titulares] != null){
			metodo.imprimeConta(conta, titulares);
			titulares++;
		}
		titulares = 0;
	}
	void imprimeConta(Conta_corrente conta, int titular) {
		System.out.println("Titular: "+ conta.titularesDaConta[titular]);
		System.out.println("Titular principal: "+ conta.titularPrincipal);
		System.out.println("Numero da conta: "+ conta.numeroDaConta);
		System.out.println("CPF: "+ conta.CPF[titular]);
		System.out.println("RG "+ conta.RG[titular]);
		System.out.println("Endereco: "+ conta.enderecoCompleto.rua +", "+conta.enderecoCompleto.numero+", "+ conta.enderecoCompleto.bairro);
		System.out.println("          "+ conta.enderecoCompleto.cidade +" - "+ conta.enderecoCompleto.estado +"   CEP: "+ conta.enderecoCompleto.CEP);
		System.out.println("");
	}
}
