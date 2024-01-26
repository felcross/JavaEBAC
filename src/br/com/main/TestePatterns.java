package br.com.main;

import be.com.designPatterns.Singleton;

public class TestePatterns {

	public static void main(String[] args) {
		
		
	Singleton singleton = Singleton.getInstance();
	Singleton singleton1 = Singleton.getInstance();
	System.out.println(singleton);
	System.out.println(singleton1);

}}
