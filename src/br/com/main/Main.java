package br.com.main;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Stream;

import br.com.classe.Itabela;
import br.com.classe.Tabela;
import br.com.media.Prova;

public class Main {

	public static void main(String[] args) {
		
	
		Stream<String> stream = List.of("fel","bat","sil").stream();
		
	  	Map<String,String> map = Map.of("fel","bat");
	
		
	 
		
		
		
		
		
		

		
		
		/*	Tabela table = new Tabela();
		
		Class clazz = table.getClass();
		
		Field[] fields = table.getClass().getDeclaredFields();
		
		System.out.println("---------Nome da Classe----- ");
		System.out.println(clazz);
		System.out.println("-------------- ");
		System.out.println("------Campos da classe----- ");
		for(Field field : fields ) {
		 Class<?> type = field.getType();
		 String nome = field.getName();
		 System.out.println("TIPO----- ");
		 System.out.println(type);
		 System.out.println("NOME----- ");
		 System.out.println(nome);
		 }
		
		System.out.println("-------------- ");
		
		Annotation[]  annotations = table.getClass().getAnnotations();
		
		System.out.println("----------Tipo de anotação------");	
		for(Annotation an :annotations ) {
			
			System.out.println("Tipo de anotação------");
			System.out.println(an.annotationType());
			System.out.println("Nome de anotação------");
			System.out.println(an.annotationType().getName());
			System.out.println("Valor anotação------");
			System.out.println(an.toString());
			
		}*/
	     
		
		
		
		
		

		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	Scanner scanner = new Scanner(System.in);
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
		}*/
	
   
		
	
	  
	Long resul = cal(1l,1l,(v1,v2)->{
		return v1+v2;
	
	 });
	
	System.out.println(resul);
	
	}
	
	private static Long cal(Long t, Long u, BiFunction<Long,Long,Long> function ) {
	   
		return function.apply(t,u);
	}
	

}
