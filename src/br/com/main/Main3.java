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
	//	List<String> lista1 = new ArrayList<String>();

		 
      	System.out.println("Insira nomes para lista usando -M no final");

		String nome = scanner.nextLine();
        
		String[] separados = nome.split("-M");
		
		//String[] separados2 = nome.split("-F");


		
		
		lista.addAll(Arrays.asList(separados));
		
		//lista1.addAll(Arrays.asList(separados2));

	      Collections.sort(lista);
	    //  Collections.sort(lista1);

	
		
	
		for (String nome1 : lista) {
     
            System.out.println(nome1);

        }
		
	
		 


	   
	   
		
	
   
		
	
	  
	 
	
	
	
	}
	

}
