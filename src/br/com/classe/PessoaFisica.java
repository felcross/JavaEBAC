package br.com.classe;

public class PessoaFisica extends Pessoa {

	private String cpf;
	
	
	

	public PessoaFisica(String cpf) {
		super();
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
