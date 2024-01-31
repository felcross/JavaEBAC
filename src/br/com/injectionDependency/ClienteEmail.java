package br.com.injectionDependency;

public class ClienteEmail {

	private IServiceEmail _serviceEmail;

	public ClienteEmail(IServiceEmail _serviceEmail) {
		super();
		this._serviceEmail = _serviceEmail;
	}
	
	
	public void enviarEmail(String email, String titulo, String mensagem) {
		
		_serviceEmail.enviarEmail(email, titulo, mensagem);
		
	}


	@Override
	public String toString() {
		return "ClienteEmail [_serviceEmail=" + _serviceEmail + "]";
	}

	
	
	 
}
