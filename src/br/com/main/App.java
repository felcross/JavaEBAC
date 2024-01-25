package br.com.main;

import java.util.Objects;

import javax.swing.JOptionPane;

import br.com.dao.ClienteMapDAO;
import br.com.dao.IClienteDAO;
import br.com.domain.Cliente;


public class App {
	
	private static IClienteDAO iClienteDAO;

	  public static void main(String args[]) {
	          iClienteDAO = new ClienteMapDAO();

	        String opcao = JOptionPane.showInputDialog(null,
	                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
	                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
	        
	        
	        while (!isOpcaoValida(opcao)) {
	            if ("".equals(opcao)) {
	                sair();
	            }
	            opcao = JOptionPane.showInputDialog(null,
	                    "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para cadastro, 4 para alteração ou 5 para sair",
	                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
	        }

	        while (isOpcaoValida(opcao)) {
	            
	            if (isOpcaoSair(opcao)) {
	                sair();
	            }else if (isCadastro(opcao)) {
	                String dados = JOptionPane.showInputDialog(null,
	                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
	                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
	                cadastrar(dados);
	            } else if (isConsulta(opcao)) {
	                String dados = JOptionPane.showInputDialog(null,
	                        "Digite o CPF do cliente",
	                        "Consulta cliente", JOptionPane.INFORMATION_MESSAGE);
	                consultar(dados);
	            } else if (isExclusao(opcao)) {
	                String dados = JOptionPane.showInputDialog(null,
	                        "Digite o CPF do cliente",
	                        "Consulta cliente", JOptionPane.INFORMATION_MESSAGE);
	                excluir(dados);
	            } else {
	                String dados = JOptionPane.showInputDialog(null,
	                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
	                        "Atualização", JOptionPane.INFORMATION_MESSAGE);
	                atualizar(dados);
	            }

	            opcao = JOptionPane.showInputDialog(null,
	                    "Digite 1 para cadastro, 2 para consulta, 3 para cadastro, 4 para alteração ou 5 para sair",
	                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);

	        }

	    }
	  
	  //metodos

	    private static void atualizar(String dados) {
	        String[] dadosSeparados = dados.split(",");
	        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
	        iClienteDAO.alterar(cliente);
	    }

	    private static void excluir(String dados) {
	        iClienteDAO.excluir(Long.parseLong(dados));
	        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
	    }


	    private static void consultar(String dados) {
	        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
	      
	        
	        if (cliente != null) {
	            JOptionPane.showMessageDialog(null, "Cliente encontrado com sucesso: " + cliente.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(null, "Cliente não encontrado", "ERRO",JOptionPane.INFORMATION_MESSAGE);
	        }

	    }

	    private static void cadastrar(String dados) {
	        String[] dadosSeparados = dados.split(",");	               	        
	        Cliente cliente = new Cliente();
	           if(isCamposValidos(dadosSeparados)) {
	        	    cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
	        	    System.out.println("entrou aqui 1");
	        	    
	        	    Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
	    	        if (isCadastrado) {
	    	            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
	    	        } else {
	    	            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
	    	        }
	    	        
	        	    
	        	    
	        	    
	           } else {
	        	   JOptionPane.showMessageDialog(null, "Dados estão Vazios", "Erro",JOptionPane.INFORMATION_MESSAGE);
	        	   System.out.println("entrou aqui 2");
	           }
	             
	           System.out.println("entrou aqui 3");
	       
	        
	        //  Cliente cliente = new Cliente();
	       /* for (String cli : dadosSeparados) {	
	        	if (cli != null)
	            {
	        	  cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);	          
	               
	            } else {
		            JOptionPane.showMessageDialog(null, "Dados estão nulos", "Erro",JOptionPane.INFORMATION_MESSAGE);
		        }
	        }*/
	        
	       

	    }

	    private static boolean isExclusao(String opcao) {
	        if ("3".equals(opcao)) {
	            return true;
	        }
	        return false;
	    }

	    private static boolean isConsulta(String opcao) {
	        if ("2".equals(opcao)) {
	            return true;
	        }
	        return false;
	    }

	    private static boolean isCadastro(String opcao) {
	        if ("1".equals(opcao)) {
	            return true;
	        }
	        return false;
	    }

	    private static void sair() {
	       
	        JOptionPane.showMessageDialog(null, "Saindo...", "Até logo",JOptionPane.INFORMATION_MESSAGE);
	        System.exit(0);
	    }

	    private static boolean isOpcaoSair(String opcao) {
	        if ("5".equals(opcao)) {
	            return true;
	        }
	        return false;
	    }

	    private static boolean isOpcaoValida(String opcao) {
	        if ("1".equals(opcao) || "2".equals(opcao)
	                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
	            return true;
	        }
	        return false;
	    }
	    
	    private static boolean isCamposValidos(String ...campos) {
	    	
	    	 for (int i = 0; i < campos.length; i++) {
	    		 
	    		 if(campos[i] == null || "".equals(campos[i])) {
	    	      System.out.println("entrou no validar nulo");
	    		 return false;
	    		 } else if(campos.length <= 6) {
	    			 JOptionPane.showMessageDialog(null, "Os Dados estão nulos ou vazios", "Até logo",JOptionPane.INFORMATION_MESSAGE);
	 		        System.exit(0);
	    			 System.out.println("entrou aqui");
	    		 }
	    		 
	    		 
	    		 		 
	         }
	    	 
	    	 
		       
		        
	    	  System.out.println("veio pro true");  	    	
	    	return true;
	    };

	    
	    
	    
	}
