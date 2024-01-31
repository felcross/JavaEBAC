package br.com.injectionDependency;

public class AmazonServiceEmail implements IServiceEmail {

	@Override
	public void enviarEmail(String email, String titulo, String mensagem) {
	
		//AmazonServiceEmail amzEmail = new AmazonServiceEmail();
		// amzEmail.enviarEmail(email, titulo, mensagem);
			System.out.println("Serviço Amazon foi enviado");
			System.out.println("Email: "+email);
			System.out.println("titulo: "+titulo);
			System.out.println("mensagem: "+mensagem);
		
	}

}
