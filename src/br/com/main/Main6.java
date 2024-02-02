package br.com.main;

import br.com.classe.Civic;
import br.com.classe.Fusca;


import java.util.ArrayList;
import java.util.List;

import br.com.classe.Carro;


public class Main6 {

	public static void main(String[] args) {
	Carro carro1 = new Fusca("volkswagen");
	Carro carro2 = new Civic("Honda");
	

	List<Carro> lista = new ArrayList();
	
	 lista.add(carro1);
	 lista.add(carro2);
	 imprimir(lista);
	
	
	
	
		
		
		

	
	

}
	
	public static void imprimir(List<? extends Carro> lista) {
        for (Carro carro : lista) {
            System.out.println(carro.toString());
        }
    }	
	
}
