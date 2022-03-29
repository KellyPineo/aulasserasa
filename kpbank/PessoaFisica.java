package kpbank;

public class PessoaFisica extends PessoaHeranca{

	//atributos classe filha (Pessoa Fisica)
		
	// GCUF = construtor
	public PessoaFisica(String cpf, String rg, String profissao) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
	}	
	
	// GCFS = metodos
private String cpf;
public PessoaFisica() {
	super();
	// TODO Auto-generated constructor stub
}

public PessoaFisica(String nome, String cpf, String profissao, String telefone, String email, String rg) {
	super(nome, cpf, profissao, telefone, email, rg);
	// TODO Auto-generated constructor stub
}
	
	//GGAS = encapsulamentos
public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getRg() {
	return rg;
}

public void setRg(String rg) {
	this.rg = rg;
}

public String getProfissao() {
	return profissao;
}

public void setProfissao(String profissao) {
	this.profissao = profissao;
}
private String rg;
private String profissao;
}
