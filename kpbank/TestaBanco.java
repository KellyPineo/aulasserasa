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
//	
//	PessoaFisica pfKelly = new PessoaFisica();
//	pfKelly.setNome("Kelly Pineo");
//	pfKelly.setEmail("kelly@outlook.com");
//	pfKelly.setTelefone("1125456650");
//	pfKelly.setCpf("879.359.983-88");
//	pfKelly.setProfissao("Contadora");
//	pfKelly.setRg("38.097.589.1");
//	
//	
//	Conta conta1 = new Conta();
//	conta1.setAgencia(1234);
//	conta1.setNumeroConta(7889);
////	conta1.setSaldo(100000000.50); >> não se deve alterar diretamente essa informação. Ela apenas pode ser exibida.
//	conta1.setTitular(pfKelly);
//	
//	//metodo depositar
//	conta1.depositar(100000.50);
//	
//	System.out.println("Agencia: "+conta1.getAgencia());
//	System.out.println("Conta: "+conta1.getNumeroConta());
//	System.out.println("Titular: "+conta1.getTitular().getNome());
//	System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());
//	
//	//metodo sacar
//	if (conta1.sacar(25.25)) {
//		System.out.println("Saque efetuado com sucesso!");
//	}else {
//		System.out.println("Verifique valor do saque!");
//	}
//	
//	System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());
//	
//	Conta conta2 = new Conta();
//	conta2.setAgencia(1102);
//	conta2.setNumeroConta(5589);
//	
//	System.err.println("=================================");
//	
//	conta1.transferir(5000.00,conta2);
//	System.err.printf("Saldo Atual Renan: R$ %.2f \n",conta2.getSaldo());
//	System.err.printf("Saldo Atual Kelly: R$ %.2f \n",conta1.getSaldo());
//	
//	
//	ContaCorrente cc1 = new ContaCorrente();
//	cc1.depositar(1000);
//	System.out.println("Saldo "+cc1.getSaldo());
//	System.out.println("Limite "+cc1.getLimite());
//	System.out.println("Saldo Com limite "+cc1.getSaldoComLimite());
//	cc1.sacar(1500);
//	System.out.println("Saldo "+cc1.getSaldo());
//	System.out.println("Saldo Com limite "+cc1.getSaldoComLimite());
//	}
//}
	
		PessoaFisica pfFlavia = new PessoaFisica();
		pfFlavia.setNome("Flavia Almeida");
		pfFlavia.setEmail("flavia@digitalhouse.com");
		pfFlavia.setTelefone("21971549772");
		pfFlavia.setCpf("879.359.983-88");
		pfFlavia.setProfissao("Professora");
		pfFlavia.setRg("12234578-9");
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		conta1.setTitular(pfFlavia);
		
		//	conta1.setSaldo(1000000.50); >> não se deve alterar diretamente essa informação. Ela apenas pode ser exibida
		
		conta1.depositar(100000.0);
				
		System.out.println("Agencia: "+conta1.getAgencia());
		System.out.println("Conta: "+conta1.getNumeroConta());
		System.out.println("Titular: "+conta1.getTitular().getNome());
		System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());
		
				
		if (conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Verifique valor do saque!");
		}
					
		System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());
		
		
		Conta conta2 = new Conta() ;
			conta2.setAgencia(5582);
			conta2.setNumeroConta(2234);
			
			conta1.transferir(10000.0, conta2);
			System.out.printf("Saldo Atual Flavia: R$ %.2f \n",conta1.getSaldo());
			System.out.printf("Saldo Atual Babakuxy: R$ %.2f \n",conta2.getSaldo());
			
		
	ContaCorrente cc1 = new ContaCorrente();
	cc1.depositar(1000);
	System.out.println("Saldo " + cc1.getSaldo());
	System.out.println("Limite "+cc1.getLimite());
	System.out.println("Saldo Com limite "+cc1.getSaldoComLimite());
	cc1.sacar(1500);
	System.out.println("Saldo " + cc1.getSaldo());
	System.out.println("Saldo Com limite "+cc1.getSaldoComLimite());
	
		
		
		
	}
	
}