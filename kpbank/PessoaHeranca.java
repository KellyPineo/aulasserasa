package kpbank;

public class PessoaHeranca {

	private String nome;
	private String email;
	private String telefone;
	
	
	public PessoaHeranca() {
		//metodo construtor default = preenchimento dos atributos é opcional
	}
	
	public PessoaHeranca(String nome, String cpf, String rg) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
		
	
	public PessoaHeranca(String nome, String cpf, String profissao, String telefone, String email, String rg) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	
	public String getNome() {//exibe os objetos
		return nome;
	}
	public void setNome(String nome) {//grava os objetos nos atributos
		this.nome = nome;
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

}
