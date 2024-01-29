package br.com.factory;

public class Cliente {

	private String notaDeRequisicao;
	
	private boolean temContrato;

	public Cliente(String notaDeRequisicao, boolean temContrato) {
		super();
		this.notaDeRequisicao = notaDeRequisicao;
		this.temContrato = temContrato;
	}
	
	public boolean temContrato() {
		
		return temContrato;
	}
	
   public String requererNota() {
		
		return notaDeRequisicao;
	}
	
	
	
	
}
