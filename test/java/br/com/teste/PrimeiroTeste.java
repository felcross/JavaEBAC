package br.com.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.classTest.TesteCliente;

public class PrimeiroTeste {

	
	@Test
	 public void testeF(String nome) {
		
		
		 Assert.assertEquals("F",nome);
	 }
}
