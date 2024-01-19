package br.com.main;

import br.com.classe.PessoaFisica;
import br.com.classe.PessoaJuridica;


public class Main5 {

	public static void main(String[] args) {
		
		
		
		PessoaFisica pf = new PessoaFisica("13254585");
		PessoaJuridica  pj = new PessoaJuridica("52148158661-00001");
		
		pf.setNome("felipe");
		pf.setSobreNome("Batista");
		pj.setNome("Joao");
		pj.setSobreNome("da Silva");
		
		System.out.println("Atributos herdados da classe abstrata Pessoa");
		System.out.println("-----");	
		System.out.println("nome: "+pf.getNome());
		System.out.println("Sobrenome: "+pf.getSobreNome());
		System.out.println("-----");
		System.out.println("Atributos vindo da classe PessoaFisica extendida de Pessoa");
		System.out.println("CPF:  "+pf.getCpf());
		System.out.println("------------------------------------------------");	
		System.out.println("Atributos herdados da classe abstrata Pessoa");
		System.out.println("-----");	
		System.out.println("nome: "+pj.getNome());
		System.out.println("Sobrenome: "+pj.getSobreNome());
		System.out.println("-----");
		System.out.println("Atributos vindo da classe PessoaJuridica extendida de Pessoa");
		System.out.println("CNPJ:  "+pj.getCnpj());
		
		
		
		
	}

}
