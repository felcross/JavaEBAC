package br.com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Stream;

import br.com.classe.Pessoa;


public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para nomes femininos Coloque o -F no final "
        		            + "para indicar o grupo feminino");
        System.out.println("Para sair DIGITE FIM");
        
        while (true) {
            String nome = scanner.nextLine();
            
            
            if(nome.endsWith("F")) {
              List<String> resul = Separar(nome);
              grupoFeminino(resul);
         
            	
            } else if (nome.equalsIgnoreCase("fim")) {
            	 
                break; // Encerra a entrada quando o usuário digitar "fim"
            } 
                 
        }
        
        scanner.close();}
        
       
    private static List<String> Separar(String nome) {
       String[] partesDoNome = nome.split("-");
       
       String nome1 = partesDoNome[0];
       String nome2 = partesDoNome[1];
       
       List<String> partesDoNome2 = new ArrayList<String>();
       partesDoNome2.add(nome1);
       return partesDoNome2;                        		
           
    }
  private static void grupoFeminino(List<String> nome) {    	      
    	nome.stream()     
       .forEach(s -> System.out.println("Grupo Feminino: "+ s));	
    }
    
  
	
	/*private static String cal(String t, String u, BiFunction<String,String,String> function ) {
	   
		return function.apply(t,u);
	}*/
	
    }