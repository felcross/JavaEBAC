package br.com.injectionDependency;

public class GoogleServiceEmail implements IServiceEmail{
	
	

	@Override
	public void enviarEmail(String email, String titulo, String mensagem) {
		
		//GoogleServiceEmail googleEmail = new GoogleServiceEmail();
		//googleEmail.enviarEmail(email, titulo, mensagem);
		System.out.println("Serviço Google foi enviado");
		System.out.println("Email: "+email);
		System.out.println("titulo: "+titulo);
		System.out.println("mensagem: "+mensagem);
	}

}
