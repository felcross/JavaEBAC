package br.com.classe;


@Itabela(NomeTabela = "Tabela X do banco")
public class Tabela {

	@Itabela(NomeTabela = "Tabela Y do banco")
	String NomeTabela;
	
	
	
	@Itabela(NomeTabela = "Tabela w do banco")
	public Tabela() {
		super();
		NomeTabela = this.NomeTabela;
	}




	@Override
	public String toString() {
		return "Tabela [NomeTabela=" + NomeTabela + "]";
	}


}
