package br.com.javateste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.teste.PrimeiroTeste;

public class MainTest {

	public static void main(String[] args) {
	
		   Scanner scanner = new Scanner(System.in);
	        System.out.println("Para nomes femininos Coloque o -F no final "
	        		            + "para indicar o grupo feminino");
	        System.out.println("Para sair DIGITE FIM");
	         
	        while (true) {
	            String nome = scanner.nextLine();
	        	//String nome = "felipe-F";
	            
	            if(nome.endsWith("F")) {
	           
	              List<String> resul = Separar(nome);
	             
	              grupoFeminino(resul);
	              
	            	
	            } else if (nome.equalsIgnoreCase("fim")) {
	            	scanner.close();	 
	                break; // Encerra a entrada quando o usuário digitar "fim"
	            } 
	                 
	        }
	        
	        }
	        
	       
	    private static List<String> Separar(String nome) {
	    PrimeiroTeste teste = new PrimeiroTeste();	
	       String[] partesDoNome = nome.split("-");
	       
	       String nome1 = partesDoNome[0];
	       String nome2 = partesDoNome[1];
	     //Verificando se o array contem a letra F  
	        teste.testeF(nome2);
	        
	       List<String> partesDoNome2 = new ArrayList<String>();
	       partesDoNome2.add(nome1); 
	       System.out.println("tem f: "+ nome2);
	       return partesDoNome2;                        		
	           
	    }
	  private static void grupoFeminino(List<String> nome) {    	      
	    	nome.stream()     
	       .forEach(s -> System.out.println("Grupo Feminino: "+ s));	
	    }
	    
		
	    }