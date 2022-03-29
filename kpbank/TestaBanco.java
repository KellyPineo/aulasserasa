package kpbank;

public class TestaBanco {

	public static void main(String[] args) {
		
//	Pessoa pessoaNova = new Pessoa(); //instanciar a classe Pessoa
//	pessoaNova.setNome("Jose de Oliveira");
//	System.out.println("Nome: "+pessoaNova.getNome());
//	
//	Pessoa pessoaComConstrutor1 = new Pessoa("João da Silva", "744.541.665-01", "123.123-23");
//	
//	System.out.println("Nome: "+pessoaComConstrutor1.getNome());
//	System.out.println("Nome: "+pessoaComConstrutor1.getCpf());
//	System.out.println("Nome: "+pessoaComConstrutor1.getRg());
//	
//	System.out.println();
//	
//	}
//
//	
//	public static void main(String[] args) {
//		
//		
//	Pessoa pessoaNumero1 = new Pessoa();  //criar uma instancia = copia
//	pessoaNumero1.nome = "Jose das Couves";
//	pessoaNumero1.profissao = "Agricultor";
//	pessoaNumero1.cpf = "643.829.641-48";
//	
//	
//		
//	System.out.println("Nome: "+pessoaNumero1.nome);
//	System.out.println("Profissão: "+pessoaNumero1.profissao);
//	System.out.println("CPF: "+pessoaNumero1.cpf);
//		
//	Pessoa pessoaNumero2 = pessoaNumero1;
//	pessoaNumero2.nome = "João dos Tomates";
//		
//	System.out.println("=======================");
//		
//	System.out.println("Nome"+pessoaNumero1.nome);
//	System.out.println("Nome"+pessoaNumero2.nome);
//
//		
//	}
//}
	
	Conta conta1 = new Conta();
	conta1.setAgencia(1234);
	conta1.setNumeroConta(7889);
//	conta1.setSaldo(100000000.50); >> não se deve alterar diretamente essa informação. Ela apenas pode ser exibida.
	conta1.setTitular("Kelly Pineo");
	
	//metodo depositar
	conta1.depositar(100000.50);
	
	System.out.println("Agencia: "+conta1.getAgencia());
	System.out.println("Conta: "+conta1.getNumeroConta());
	System.out.println("Titular: "+conta1.getTitular());
	System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());
	
	//metodo sacar
	if (conta1.sacar(25.25)) {
		System.out.println("Saque efetuado com sucesso!");
	}else {
		System.out.println("Verifique valor do saque!");
	}
	
	System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());
	
	Conta conta2 = new Conta();
	conta2.setAgencia(1102);
	conta2.setNumeroConta(5589);
	conta2.setTitular("Renan Tavares");
	
	System.err.println("=================================");
	
	conta1.transferir(5000.00,conta2);
	System.err.printf("Saldo Atual Renan: R$ %.2f \n",conta2.getSaldo());
	System.err.printf("Saldo Atual Kelly: R$ %.2f \n",conta1.getSaldo());
	
	
	}
}
	
	
