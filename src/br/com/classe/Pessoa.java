package br.com.classe;

import java.util.List;
import java.util.Objects;

/**
 * 
 * @author felipe
 * 
 * @version 1.0
 */
public abstract class Pessoa  {

	private String nome;
	private String SobreNome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return SobreNome;
	}
	public void setSobreNome(String sobreNome) {
		SobreNome = sobreNome;
	}
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", SobreNome=" + SobreNome + "]";
	}

	
	


	
	
}
