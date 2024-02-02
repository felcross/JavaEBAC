package br.com.classe;



public abstract class Carro  {

	public boolean  ligar;
	public Integer velocidadeAtual;
	public Integer freio;
	public boolean isLigar() {
		return ligar;
	}
	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}
	public Integer getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(Integer velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public Integer getFreio() {
		return freio;
	}
	public void setFreio(Integer freio) {
		this.freio = freio;
	}
	
	
}
