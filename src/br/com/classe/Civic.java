package br.com.classe;

public class Civic<T> implements Carro {

	
	private T marca;
	
	

	public Civic(T marca) {
		super();
		this.marca = marca;
	}

	public T getMarca() {
		return marca;
	}

	public void setMarca(T marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Civic [marca=" + marca + "]";
	}
	
	
	  
}
