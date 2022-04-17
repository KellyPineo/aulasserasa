package kpbank;

public class Pessoa {

	private String nome;
	private String cpf;
	private String profissao;
	private String telefone;
	private String email;
	private String rg;

	
	
	public Pessoa() {
		//metodo construtor default = preenchimento dos atributos é opcional
	}
	
	
	public Pessoa(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
		
	
	public Pessoa(String nome, String cpf, String profissao, String telefone, String email, String rg) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
	}
	
	//Encapsulamentos
	public String getNome() {//exibe os objetos
		return nome;
	}
	public void setNome(String nome) {//grava os objetos nos atributos
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
		

}
