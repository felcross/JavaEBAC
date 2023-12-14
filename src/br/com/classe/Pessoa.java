package br.com.classe;



/**
 * 
 * @author felipe
 * 
 * @version 1.0
 */
public class Pessoa {

	public String nome;
	public String sexo;
	

	 	
	public Pessoa() {
			this.nome = nome;
			this.sexo = sexo;
		
	 }



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		nome = nome;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		sexo = sexo;
	}



	@Override
	public String toString() {
		return "Pessoa [Nome=" + nome + ", Sexo=" + sexo + "]";
	}
	
	
	 public int compareTo(Pessoa pessoa) {
	        return this.nome.compareTo(pessoa.getNome());
	    }   	


	
	
}
