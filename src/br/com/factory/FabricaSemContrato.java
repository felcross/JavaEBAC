package br.com.factory;

public class FabricaSemContrato extends Fabrica {

	@Override
	Carro recuperarCarro(String notaDeRequisicao) {
		if("B".equals(notaDeRequisicao)) {
			return new FuscaCarro(100,"CHEIO","AZUL");
		}
		return new CorolaCarro(100,"CHEIO","PRETO");
	}

}
