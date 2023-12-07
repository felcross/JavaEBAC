package br.com.main;

import java.util.Scanner;

import br.com.media.Prova;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Prova prova = new Prova();
		
		System.out.println("Insira suas notas");
		
		System.out.println("Insira Nota 1");
		int prova1 = prova.nota1 = scanner.nextInt();
		System.out.println("Insira Nota 2");
		int prova2 = prova.nota2 = scanner.nextInt();
		System.out.println("Insira Nota 3");
		int prova3 = prova.nota3 = scanner.nextInt();
		System.out.println("Insira Nota 4");
		int prova4 = prova.nota4 = scanner.nextInt();
   
	   int mediaTotal = prova.media(prova1, prova2, prova3, prova4);
	   
	   
		if(mediaTotal>= 7) {
		System.out.println("Sua media é:  "+ mediaTotal);	
		System.out.println("Voce foi aprovado");
		} else if (mediaTotal >= 5) {
		 System.out.println("Sua media é:  "+ mediaTotal);	
	     System.out.println("Voce está de recuperação");
		} else {
			System.out.println("Sua media é:  "+ mediaTotal);
			System.out.println("Voce está Reprovado");
		}
	
 
		
	
	  
	 
	
	
	
	}
	

}
