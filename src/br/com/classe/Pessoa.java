package br.com.classe;

import java.util.List;
import java.util.Objects;

/**
 * 
 * @author felipe
 * 
 * @version 1.0
 */
public class Pessoa implements Comparable<Pessoa>  {

	public String nome;
	public String sexo;
	

	 	
	public Pessoa() {
		
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



	@Override
	public int compareTo(Pessoa o) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int hashCode() {
		return Objects.hash(nome, sexo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sexo, other.sexo);
	}



	
	


	
	
}
