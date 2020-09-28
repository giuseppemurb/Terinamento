package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Dao.ViagemDao;
import Model.Viagem;

public class TreinamentoArrayString {

	public static void main(String[] args) {

		// Objeto de Array de String que será armazenado os dados da Viagem
		String[] arrayStringViagem = new String[4];
		Scanner scan = new Scanner(System.in);
		Boolean lacoWhile = true;
		List<Viagem> listViagensNovas = new ArrayList<Viagem>();

		while (lacoWhile) {
			// Insere as informações
			System.out.println("Linha:");
			arrayStringViagem[0] = scan.nextLine();
			System.out.println("Tabela:");
			arrayStringViagem[1] = scan.nextLine();
			System.out.println("Horário Partida:");
			arrayStringViagem[2] = scan.nextLine();
			System.out.println("Horário Chegada:");
			arrayStringViagem[3] = scan.nextLine();

			// arrayStringViagem = {"080","3","19h10","19h50"};
			System.out.println("Linha: " + arrayStringViagem[0]);
			System.out.println("Tabela: " + arrayStringViagem[1]);
			System.out.println("Horário Partida: " + arrayStringViagem[2]);
			System.out.println("Horário Chegada: " + arrayStringViagem[3]);

			// Criar uma Viagem com os dados da String[] (Popular)
			Viagem novaViagem = new Viagem();
			novaViagem.setLinha(Integer.parseInt(arrayStringViagem[0]));
			novaViagem.setTabela(Integer.parseInt(arrayStringViagem[1]));
			novaViagem.setHorarioPartida(arrayStringViagem[2]);
			novaViagem.setHorarioChegada(arrayStringViagem[3]);

			System.out.println(novaViagem.toString());
			
			//Adiciona a viagem a lista
			listViagensNovas.add(novaViagem);
			
			//Verifica se o usuário quer continuar ou sair
			System.out.println("Deseja continuar? 1 - Para continuar e 2- Para sair");
			Integer opcao = Integer.parseInt(scan.nextLine());
			
			if (opcao == 1) {
				lacoWhile = true;
			} else if (opcao == 2) {
				lacoWhile = false;
			} else {
				System.out.println(
						" Você digitou um número não solicitado, vc não é competente para escolher diferente de 1 ou 2. Reduza-se a sua insiguinificancia e escolha apenas 1 ou 2. Como você é um inútil vc vai ter que cadastrar outra viagem de novo zé ruela.");
				lacoWhile = true;
			}

		}//Fim do WHile
		//Impressão da lista
		listViagensNovas.forEach(viagem->System.out.println(viagem));
		//Saiu do While
		
		//Salvar a List no Banco
		ViagemDao viagemDao = new ViagemDao();
		Boolean resultadoDaInsercaoDaListDeViagemNoBancoDeDados = viagemDao.inserirListViagem(listViagensNovas);
		if(resultadoDaInsercaoDaListDeViagemNoBancoDeDados) {
			System.out.println("Sucesso");
		} else {
			System.out.println("Faz de novo peroba");
		}
		
		System.out.println("Fim do programa");
	}

}
