package br.com.classe;

import java.util.List;
import java.util.Objects;

public class Produto {

	
	private Integer Id;
    private String descricao;
    private String marca;
	
    
    
    
    public Produto(Integer id, String descricao, String marca) {
		Id = id;
		this.descricao = descricao;
		this.marca = marca;
	}
    
    public Produto() {}
    
    
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
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
    	Produto prod1 = new Produto(1,"TV","Samsung");
    	Produto prod2 = new Produto(2,"SmartPhone","Apple");
    	Produto prod3 = new Produto(3,"Carro","KIA");
    	Produto prod4 = new Produto(4,"Geladeira","Samsung");
    
    	
    	
    	return List.of(prod1,prod2,prod3,prod4);
    	
    }

	@Override
	public int hashCode() {
		return Objects.hash(Id, descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(descricao, other.descricao);
	}

	@Override
	public String toString() {
		return "Produto [Id=" + Id + ", descricao=" + descricao + ", marca=" + marca + "]";
	}
    
    
}
