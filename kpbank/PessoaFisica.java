package kpbank;

public class PessoaFisica extends PessoaHeranca{

	//atributos classe filha (Pessoa Fisica)
	
	// GCUF = construtor
	private String cpf;
	private String rg;
	private String profissao;
	
		
	public PessoaFisica() { //gcfs
		super();
	}
	// GCFS = metodos
	public PessoaFisica(String cpf, String rg, String profissao) { //gcuf
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
	}
	
	public String getCpf() { //ggas
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
	
	
	
	
	
	
}