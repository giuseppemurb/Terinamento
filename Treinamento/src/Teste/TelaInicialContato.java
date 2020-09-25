package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dao.ContatoDao;
import Model.Contato;

public class TelaInicialContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura = new Scanner(System.in);
		
		Boolean lacoWhile = true;
		while (lacoWhile) {

			System.out.println("*** CADASTROS DE CONTATOS***");
			System.out.println("<1> Cadastrar Contato");
			System.out.println("<2> Buscar Contato pelo Nome Id");
			System.out.println("<3> Buscar Contato pelo Nome");
			System.out.println("<4> Retornar Contatos Cadastrados");
			System.out.println("<5> Apagar Contato ");
			System.out.println("<6> Sair");

			Integer opcao;
			opcao = captura.nextInt();
			captura.nextLine();
			//Cadastro de contatos 
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
				}

				else {
					System.out.println("Não Salvo");
				}
			}
			// retornar o contato pela Id
			else if (opcao == 2) {
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
			
			} else if (opcao == 3) {

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
				
			}

			// retornar contatos cadastrados e imprimir no console
			else if (opcao == 4) {
				ContatoDao contatoDao = new ContatoDao();

				List<Contato> listaContatos = contatoDao.retornarListContatos();

				listaContatos.forEach(cadaContato -> System.out.println(cadaContato));

			}
			// apagar contato pela ID
			else if (opcao == 5) {
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

			}

			else if (opcao == 6) {
				lacoWhile = false;
				System.out.println("Sair");
			}
			
			else {
				System.out.println("fim Programa");
			}

		} // fim do laço While
	}
}
