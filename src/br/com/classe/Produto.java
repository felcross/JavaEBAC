package br.com.classe;

public class Produto {

	
	private Long Id;
    private Long polegadas;
    private String descricao;
    private String marca;
	
    
    
    
    public Produto(Long id, Long polegadas, String descricao, String marca) {
		super();
		Id = id;
		this.polegadas = polegadas;
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
	public Long getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(Long polegadas) {
		this.polegadas = polegadas;
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
    
    
    
    
}
