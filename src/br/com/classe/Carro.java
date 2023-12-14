package br.com.classe;


/**
 * 
 * @author felipe
 * 
 * @version 1.0
 */
public class Carro {

	public String marca;
	public boolean  ligar;
	public Integer velocidadeAtual;
	public Integer freio;

	 	
	public Carro(String marca, boolean ligar) {
			this.marca = marca;
			this.ligar = false;
			this.velocidadeAtual = 0;
			this.freio = 0;
	
		}
	
	   
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


    public boolean getLigar() {
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


       /**
        *  
        *  método para Ligar via chave
        *  
        * @deprecated
        * 
        * @see void ligarComControle(boolean ligar)
        */
	   public void ligarComChave(boolean ligar) {
			setLigar(ligar);
		}
	   
	   /**
	    * 
	    * método para Ligar o carro via controle remoto
	    * 
	    * @param ligar Parâmetro iniciado em false para carro desligado
	    */
	   public void ligarComControle(boolean ligar) {
			setLigar(ligar);
		}
		/**
		 * 
		 * método para aumentar velocidade do carro
		 * 
		 * @param velocidade Parâmetro que altera o atributo velocidadeAtual 
		 */
		public void acelerarAte(Integer velocidade) {
			setVelocidadeAtual(velocidade);
		}
		
		/**
		 * 
		 * método para decrementar velocidade do carro
		 * 
		 * @param diminuir Parâmetro que altera o atributo velocidadeAtual 
		 */
		public void frear(Integer diminuir) {
			setVelocidadeAtual(diminuir);
		}


	
	
}
