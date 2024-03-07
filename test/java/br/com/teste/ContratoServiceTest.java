package br.com.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.classTest.ContratoService;
import br.com.classTest.IContratoServive;

public class ContratoServiceTest {

	
	
	@Test
	public void salvarTest() {
        IContratoServive service = new ContratoService();
        String resposta = service.salvar();
        Assert.assertEquals("Salvando..",resposta);
		
	}
	 
	
	@Test
	public void lerTest() {
        IContratoServive service = new ContratoService();
        String resposta = service.ler();
        Assert.assertEquals("Lendo..",resposta);
		
	}
	
	
	
	@Test
	public void excluirTest() {
        IContratoServive service = new ContratoService();
        String resposta = service.excluir();
        Assert.assertEquals("Excluindo..",resposta);
		
	}
	
	
	
	@Test
	public void atualizandoTest() {
        IContratoServive service = new ContratoService();
        String resposta = service.atualizar();
        Assert.assertEquals("atualizando..",resposta);
		
	}
}
