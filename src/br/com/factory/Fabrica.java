package br.com.factory;



public abstract class Fabrica {

	
  	
	public Carro criar(String notaDeRequisicao ) {
		
		Carro carro = recuperarCarro(notaDeRequisicao);
		carro = prepararCarro(carro);
		return carro;
	}
	
	private Carro prepararCarro(Carro carro) {
		carro.limpeza();
		carro.MecanicoOK();
		carro.abastecido();
	return carro;
	}
	

	 abstract Carro recuperarCarro(String notaDeRequisicao);
	
}
