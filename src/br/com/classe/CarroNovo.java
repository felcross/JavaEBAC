package br.com.classe;

public class CarroNovo<T> extends Carro {

	
	  private T marca;

	public CarroNovo(T marca) {
		super();
		this.marca = marca;
	}

	public T getMarca() {
		return marca;
	}

	public void setMarca(T marca) {
		this.marca = marca;
	}
	  
	  
}
