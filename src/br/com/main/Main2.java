package br.com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.classe.Pessoa;


public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> lista = new ArrayList<String>();

		 
      	System.out.println("Insira nomes para lista");

		System.out.println("Insira Nomes");

		String nome = scanner.nextLine();

		String[] separados = nome.split(",");

		lista.addAll(Arrays.asList(separados));

	      Collections.sort(lista);

		


		 

		

		for (String nome1 : lista) {

            System.out.println(nome1);

        }
		
	
		
	
	  
	 
	
	
	
	}
	

}
