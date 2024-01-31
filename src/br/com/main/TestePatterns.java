package br.com.main;

import be.com.designPatterns.Singleton;
import br.com.media.Prova;

public class TestePatterns {

	public static void main(String[] args) {
		
/*		
	Singleton singleton = Singleton.getInstance();
	Singleton singleton1 = Singleton.getInstance();
	System.out.println(singleton);
	System.out.println(singleton1);*/
		
		Prova prova = new Prova();
		
		System.out.println(prova.toString());

}}
