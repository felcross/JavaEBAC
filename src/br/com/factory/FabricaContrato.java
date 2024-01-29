package br.com.factory;

public class FabricaContrato extends Fabrica{

	@Override
	Carro recuperarCarro(String notaDeRequisicao) {
		if("A".equals(notaDeRequisicao)) {
			return new CorolaCarro(100,"CHEIO","PRETO");
		}
		return new FuscaCarro(50,"CHEIO","AZUL");
	}

}
