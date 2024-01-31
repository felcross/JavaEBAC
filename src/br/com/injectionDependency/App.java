package br.com.injectionDependency;

public class App {

	public static void main(String[] args) {
		
		GoogleServiceEmail googleEmail = new GoogleServiceEmail();
		
		AmazonServiceEmail  amzEmail = new AmazonServiceEmail();
		
		
		ClienteEmail cliEmail = new ClienteEmail(googleEmail);
		
		cliEmail.enviarEmail("fel@gmail.com", "Quero aumento", "Chefe seu safado me de um aumento");
		
	

	}

}

