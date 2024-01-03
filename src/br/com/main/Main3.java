package br.com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.classe.Pessoa;


public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> lista = new ArrayList<String>();
		List<String> listaf = new ArrayList<String>();
		

		 
      	System.out.println("Insira nomes para lista usando -M no final");
     		
		
		String ler = scanner.nextLine();  
		String [] array = ler.split("-M");
		
    System.out.println("Insira nomes para lista usando -F no final");
      String lerF = scanner.nextLine();  
		String [] arrayF = lerF.split("-F"); 
		
	System.out.println("Grupo de nomes masculinos");
	lista.addAll(Arrays.asList(array));
	Collections.sort(lista);
	
		for (String nome1 : lista) {
		    
            System.out.println(nome1);

        }
		
		System.out.println("----------------------------------");
		
		System.out.println("Grupo de nomes femininos");
		listaf.addAll(Arrays.asList(arrayF));
		Collections.sort(lista);
		
		for (String nome1 : listaf) {
		    
            System.out.println(nome1);

        }
		
		
		
		


	
		
	
	
		 


	   
	   
		
	
   
		
	
	  
	 
	
	
	
	}
	

}
