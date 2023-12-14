package br.com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.classe.Pessoa;


public class Main2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Insira nomes para lista");
		System.out.println("Insira Nomes");
		
		lista.add(pessoa.nome = scanner.nextLine());	 
			
		// Collections.sort(lista);
		
		 
		
		for (Pessoa nome : lista) {
            System.out.println(nome);
        }
		
		
	
		 
		

	   
	   
		
	
   
		
	
	  
	 
	
	
	
	}
	

}
