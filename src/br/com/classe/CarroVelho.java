package br.com.classe;

public class CarroVelho<T> extends Carro {

	
	  private T marca;

	public CarroVelho(T marca) {
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
