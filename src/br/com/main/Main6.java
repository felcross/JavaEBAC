package br.com.main;

import br.com.classe.CarroNovo;
import br.com.classe.CarroVelho;


import java.util.ArrayList;
import java.util.List;

import br.com.classe.Carro;


public class Main6 {

	public static void main(String[] args) {
	List<Carro> listaCarros = new ArrayList();    
	 listaCarros.add(new CarroVelho("Fusca"));
	
	
	
		Carro fusca = new CarroVelho("Fusca");
		Carro Uno = new CarroVelho("Uno");
		Carro civic = new CarroNovo("Civic");
		Carro honda = new CarroNovo("Honda");
		
		
		
		listaCarros.add(fusca);
		
		for(Object car : listaCarros) {
			
			
		}
		
	}
	
	/*public static void imprimirFrutas(List<? extends Fruta> lista) {
        for (Fruta fruta : lista) {
            System.out.println(fruta);
        }
    }*/

}
