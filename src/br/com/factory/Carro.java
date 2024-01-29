package br.com.factory;

public class Carro {

	  private int potencia;
	    private String combustivel;
	    private String cor;

	    public Carro(int potencia, String combustivel, String cor) {
	        this.potencia = potencia;
	        this.combustivel = combustivel;
	        this.cor = cor;
	    }

	    public void startEngine(){
	        System.out.println(getClass().getSimpleName());
	        System.out.println("The " + combustivel + " engine has been started, and is ready to utilize " + potencia + " horsepowers.n" );
	    }
	    public void limpeza(){
	        System.out.println("O carro já está limpo, na cor " + cor.toLowerCase() + " A cor brilha");
	    }
	    public void MecanicoOK(){
	        System.out.println("O carro já foi vistoriado.Tudo parace bem!");
	    }
	    public void abastecido(){
	        System.out.println("O carro está com o combustivel: " + combustivel.toLowerCase());
	    }
	
}
