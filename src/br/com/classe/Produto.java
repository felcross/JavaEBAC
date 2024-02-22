package br.com.classe;

import java.util.List;

public class Produto {

	
	private Long Id;
    private String descricao;
    private String marca;
	
    
    
    
    public Produto(Long id, String descricao, String marca) {
		super();
		Id = id;
		this.descricao = descricao;
		this.marca = marca;
	}
    public Produto() {}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	};
    
    public List<Produto> populaProdutos()
    {
    	Produto prod1 = new Produto(1l,"TV","Samsung");
    	Produto prod2 = new Produto(2l,"SmartPhone","Apple");
    	Produto prod3 = new Produto(3l,"Carro","KIA");
    	Produto prod4 = new Produto(4l,"Geladeira","Samsung");
    	
    	
    	return List.of(prod1,prod2,prod3,prod4);
    	
    }
    
    
}
