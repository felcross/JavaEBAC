package br.com.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.classTest.TesteCliente;

public class PrimeiroTeste {

	
	@Test
	 public void teste() {
		TesteCliente cli = new TesteCliente();
		
		cli.setNome("Jonas");
		
		 Assert.assertEquals("Jonas",cli.getNome());
	 }
}
