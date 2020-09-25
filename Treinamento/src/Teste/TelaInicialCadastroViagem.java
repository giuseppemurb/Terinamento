package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dao.ViagemDao;
import Model.Viagem;

public class TelaInicialCadastroViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura = new Scanner(System.in);
		
		Boolean lacoWhile = true;
		while(lacoWhile) {
		System.out.println("\n**** CADASTRO DE VIAGENS****\n");
		System.out.println("<1> Cadastrar Viagem");
		System.out.println("<2> Retorna Viagem pela Id");
		System.out.println("<3> Retorna Viagens e Imprime na tela");
		System.out.println("<4> Apaga Viagem pela Id");
		System.out.println("<5> Sair");

		Integer opcao;
		opcao = captura.nextInt();
		captura.nextLine();

		if (opcao == 1) {
			Viagem novaViagem = new Viagem();
			System.out.println("Digite o n�mero da Linha:");
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
					System.out.println("Viagem n�o cadastrada");
				}

			}

			else {
				// resultadoPreenchimento = false;
				System.out.println("Dados n�o Preenchidos corretamente");
			}
			System.out.println(novaViagem.toString());
		}

		if (opcao == 2) {

			// retornar viagem pela Id e imprimir no Console
			ViagemDao viagemDao = new ViagemDao();
			System.out.println("Digite a ID");
			Viagem retornaViagemBd = viagemDao.retornarViagemPelaId(captura.nextInt());

			if (retornaViagemBd == null) {
				System.out.println("Viagem n�o encontrada");
			}

			else {
				System.out.println(retornaViagemBd);
			}
		} // fim if opcao

		if (opcao == 3) {
			// retornar todas a viagens cadastradas e imprimir no console

			List<Viagem> novaLista = new ArrayList<Viagem>();
			ViagemDao novaViagem = new ViagemDao();
			List<Viagem> retornaListaViagemBd = novaViagem.retornarListViagem();
			//System.out.println(retornaListaViagemBd);
			System.out.println(retornaListaViagemBd);
					
			
			retornaListaViagemBd.forEach( cadaViagem -> 
			{
				System.out.println(cadaViagem.getLinha() + "- ["+cadaViagem.getHorarioPartida()+"] - ["+cadaViagem.getHorarioChegada()+"]");
				
			}
			);

			// Linha 90 Salva item por item da Lista retornaListaViagem na novaLista//
			// retornaListaViagem.forEach(cadaViagem->novaLista.add(cadaViagem));

		
		} // fim opcao 3
		
		
		if(opcao==4) {
			
			ViagemDao viagemDao = new ViagemDao();
			System.out.println("Digite o Id da Viagem");
			Boolean viagemExcluidaBd = viagemDao.exluirViagemPelaId(captura.nextInt());
			captura.nextLine();
			if(viagemExcluidaBd==true) {
				System.out.println("Viagem Excluida" );
				
			}
			
			else {
				System.out.println("Viagem n�o excluida");
				
			}
			
			
		}//fim if op�cao 4
		
		if (opcao==5) {
			lacoWhile = false;
		}
		}//fim la�o
		System.out.println("Fim");
	}
	
	}
	

