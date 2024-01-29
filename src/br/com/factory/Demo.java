package br.com.factory;

public class Demo {

	  public static void main(String[] args) {
		  
		  Cliente cli = new Cliente("B", false);
		  Fabrica fabrica = getFactory(cli);
		  fabrica.criar(cli.requererNota());
		  
	  }

	private static Fabrica getFactory(Cliente cli) {
	  if(cli.temContrato()) {
		  return new FabricaSemContrato();
	  }
		
		return new FabricaContrato();
	}
	   
}
