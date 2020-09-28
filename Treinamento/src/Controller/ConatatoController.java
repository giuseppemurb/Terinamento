package Controller;

import java.util.List;
import java.util.Scanner;

import Dao.ContatoDao;
import Model.Contato;

public class ConatatoController {
	
	
	
	
	public void imprimirOpçao(){
	
	System.out.println("*** CADASTROS DE CONTATOS***");
	System.out.println("<1> Cadastrar Contato");
	System.out.println("<2> Buscar Contato pelo Nome Id");
	System.out.println("<3> Buscar Contato pelo Nome");
	System.out.println("<4> Retornar Contatos Cadastrados");
	System.out.println("<5> Apagar Contato ");
	System.out.println("<6> Sair");
	
	}//fim método imprimirOpcao
//método que executa o algoritmo da primeira opcao do sistema
	public Boolean primeiraOpcao( Integer opcao , Scanner captura) {
	Boolean resultadoCadastramento = false;
		captura.nextLine();
		if (opcao == 1) {
			Contato novoContato = new Contato();
			System.out.println("Digite o nome: ");
			novoContato.setNome(captura.nextLine());
			System.out.println("Digite Numero de Telefone");
			novoContato.setNumTelefone(captura.nextInt());
			captura.nextLine();
			System.out.println("Digite Endereço do Email");
			novoContato.setEndereçoEmail(captura.nextLine());
			System.out.println("Digite a Rua: ");
			novoContato.setRua(captura.nextLine());
			System.out.println("Digite o Numero da Casa: ");
			novoContato.setNumeroCasa(captura.nextInt());
			captura.nextLine();
			System.out.println("Digite a cidade: ");
			novoContato.setCidade(captura.nextLine());
			System.out.println("Digite o Estado");
			novoContato.setEstado(captura.nextLine());

			ContatoDao contatoDao = new ContatoDao();

			Boolean inserirContatoBd = contatoDao.inserirContato(novoContato);
			System.out.println(novoContato);

			System.out.println(inserirContatoBd);
			if (inserirContatoBd) {
				System.out.println("Contato Salvo");
				resultadoCadastramento = true;
			}

			else {
				
				System.out.println("Não foi possível Salvar");
				resultadoCadastramento = false;
				}
			
		}
		
		return resultadoCadastramento;		
		
	}//fim primeiraOpcao

	public Integer segundaOpcao (int opcao , Scanner captura) {
			if (opcao == 2) {
			ContatoDao contatoDao = new ContatoDao();
			System.out.println("Digite o Id: ");
			Integer idDigitado = captura.nextInt();
			captura.nextLine();
			Contato contatoRetornoDb = contatoDao.retornarContatoPeloId(idDigitado);
			
			if(contatoRetornoDb == null) {
				System.out.println("ID não encontrada");
				
			}
			else {
				System.out.println(contatoRetornoDb);
			}
		
		
	}
			return opcao;	
	}//fim Segundaopcao
			
	public Integer terceiraOpcao(int opcao , Scanner captura) {
		 if (opcao == 3) {

			ContatoDao contatoDao = new ContatoDao();
			
			// retorna o contato pelo nome
			System.out.println("Digite o nome: ");
			Contato retornaMetodoNome = contatoDao.retornarContatoPeloNome(captura.nextLine());
			if(retornaMetodoNome==null) {
				System.out.println("Nome não encontado");
				
			}
			else {
				System.out.println(retornaMetodoNome);
			}
			
		}//fim if 
		 return opcao;
	}//fim terceiraOpcao
	
	
	public Integer quartaOpcao(int opcao , Scanner captura) {

		// retornar contatos cadastrados e imprimir no console
		if (opcao == 4) {
			ContatoDao contatoDao = new ContatoDao();

			List<Contato> listaContatos = contatoDao.retornarListContatos();

			listaContatos.forEach(cadaContato -> System.out.println(cadaContato));

		}
		return opcao;
	}//fim metodo quartaOpcao
	
	public Integer quintaOpcao(int opcao , Scanner captura) {
		 if (opcao == 5) {
			ContatoDao contatoDao = new ContatoDao();
			System.out.println("digite o ID");
			Boolean apagarContatoBd = contatoDao.removerContatoPorId(captura.nextInt());
			captura.nextLine();
			System.out.println(apagarContatoBd);
			if (apagarContatoBd) {
				System.out.println("Contato excluido");
			} else {
				System.out.println("Contato não excluido");
			}

		}//fim if
						
		return opcao;
	}//fim metodo quintaOpcao
	
	public Integer sextaOpcao(int opcao , Scanner captura) {
		 if (opcao == 6) {
			 captura.close();			
			System.out.println("Sair");
		}
		
		else {
			System.out.println("fim Programa");
		}
		
		return opcao;
	}//fim metodo sexta opcao
	
	
	
}//fim Controleer

	
	
