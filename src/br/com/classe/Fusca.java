package br.com.classe;

public class Fusca<T> implements Carro {

	  

	private T marca;
	
	
	

	public Fusca(T marca) {
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
		return "Fusca [marca=" + marca + "]";
	}
	
}
