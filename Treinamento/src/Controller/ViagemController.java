package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dao.ViagemDao;
import Model.Viagem;

public class ViagemController {
	

	public void imprimirOpcoes() {
	
		
		System.out.println("**** CADASTRO DE VIAGENS****\n");
		System.out.println("<1> Cadastrar Viagem");
		System.out.println("<2> Retorna Viagem pela Id");
		System.out.println("<3> Retorna Viagens e Imprime na tela");
		System.out.println("<4> Apaga Viagem pela Id");
		System.out.println("<5> Sair");

	}// fim metodo imprimirOpcao

	public Integer solicitarOpcao(Integer opcao, Scanner captura) {
			//Integer opcao = leia.nextInt();
		    //Scanner captura = leia
				
		if(!verificaOpcoes(opcao)) {
			return -1;
		}
		
		if (opcao == 1) {
			
			Viagem novaViagem = new Viagem();
			System.out.println("Digite o número da Linha:");
			novaViagem.setLinha(captura.nextInt());
			captura.nextLine();
			System.out.println("Digite o numero da Tabela");
			novaViagem.setTabela(captura.nextInt());
			captura.nextLine();
			System.out.println("Qual horario de Partida: ");
			novaViagem.setHorarioPartida(captura.nextLine());
			System.out.println("Qual horario de Chegada:");
			novaViagem.setHorarioChegada(captura.nextLine());

			Boolean resultadoPreenchimento = novaViagem.verificarPreenchimento();
			System.out.println(resultadoPreenchimento);
			if (resultadoPreenchimento == true) {
				ViagemDao viagemDao = new ViagemDao();
				// viagemDao.inserirViagem(novaViagem);
				Boolean inserirViagemBd = viagemDao.inserirViagem(novaViagem);
				System.out.println(inserirViagemBd);
				if (inserirViagemBd == true) {
					System.out.println("Viagem cadastrada");

				} else {
					System.out.println("Viagem não cadastrada");
				}

			}

			else {
				// resultadoPreenchimento = false;
				System.out.println("Dados não Preenchidos corretamente");
			}
			System.out.println(novaViagem.toString());
			
		}// fim opcao 1
		
		else if (opcao == 2) {
			System.out.println("Digite a ID");
			// retornar viagem pela Id e imprimir no Console
			ViagemDao viagemDao = new ViagemDao();
			Viagem retornaViagemBd = viagemDao.retornarViagemPelaId(captura.nextInt());
			captura.nextLine();

			if (retornaViagemBd == null) {
				System.out.println("Viagem não encontrada");
			}

			else {
				System.out.println(retornaViagemBd);
			}

		}//fim opcao 2
		
	
		
		else if (opcao == 3) {
			// retornar todas a viagens cadastradas e imprimir no console

			List<Viagem> novaLista = new ArrayList<Viagem>();
			ViagemDao novaViagem = new ViagemDao();
			List<Viagem> retornaListaViagemBd = novaViagem.retornarListViagem();
			// System.out.println(retornaListaViagemBd);
			System.out.println(retornaListaViagemBd);

			retornaListaViagemBd.forEach(cadaViagem -> {

				System.out.println(cadaViagem.retornarStringViagem(cadaViagem));

			});

		}// fim opcao 3
	
	

	
		else if (opcao == 4) {

			ViagemDao viagemDao = new ViagemDao();
			System.out.println("Digite o Id da Viagem");
			Boolean viagemExcluidaBd = viagemDao.exluirViagemPelaId(captura.nextInt());
			captura.nextLine();
			if (viagemExcluidaBd == true) {
				System.out.println("Viagem Excluida");

			}

			else {
				System.out.println("Viagem não excluida");

			}
		}// fim opcao 4
		
	
		else if (opcao == 5) {
			
		}
			
			
		return opcao;
		
} //fim metodo opcao
	
	private Boolean verificaOpcoes(Integer opcao) {
		
		if(opcao>=1 && opcao<=5) {
			return true;
		} else {
			return false;
		}
	}

}// fim controller


	
	
		
	
	


