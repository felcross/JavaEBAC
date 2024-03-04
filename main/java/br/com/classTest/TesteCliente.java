package br.com.classTest;

public class TesteCliente {
	
	public String nome;
	
	public String Sobrenome;
	
	public int idade;
	
	
	
	
	

	public TesteCliente(String nome, String sobrenome, int idade) {
		super();
		this.nome = nome;
		Sobrenome = sobrenome;
		this.idade = idade;
	}
	
	
	public TesteCliente() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
	

}
