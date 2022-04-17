package kpbank;

public class PessoaJuridica extends PessoaHeranca {

	//atributos - construtores - metodos - encapsulamentos [ordem para colocar as informações]
	private String cnpj;
	private String segmento;
	private String responsavel;
	
	// GCFS = metodos
	public PessoaJuridica() {
		super();
	}
	
	// GCUF = construtor
	public PessoaJuridica(String cnpj, String segmento, String responsavel) {
		super();
		this.cnpj = cnpj;
		this.segmento = segmento;
		this.responsavel = responsavel;
	}

	// GGAS = encapsulamentos
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
}