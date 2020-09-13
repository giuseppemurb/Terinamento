package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dao.LinhaDao;
import Model.Endereco;
import Model.Viagem;

public class TelaInicialCadastroDeViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		// List<Endereco> listaEnderecos = new ArrayList<Endereco>();
		List<Viagem> viagens = new ArrayList<Viagem>();
		
		Boolean cadastroViagens = true;
		while(cadastroViagens==true) {
			
		System.out.println("\n***CADASTRO DE VIAGENS***");
		System.out.println("Digite <1> Cadastro de Viagem");
		System.out.println("Digite <2> Retorna Viagem pelo ID");
		System.out.println("Digite <3> Retorna Viagens Cadastradas");
		System.out.println("Digite <4> Apagar Viagem pelo ID");
		System.out.println("Digite <5> Sair");
		
		Viagem novaViagem = new Viagem();
		int opcao = leia.nextInt();
		leia.nextLine();
		if (opcao == 1) {
			System.out.println("Numero da Linha: ");
			novaViagem.setLinha(leia.nextInt());
			leia.nextLine();
			System.out.println("Numero da Tabela: ");
			novaViagem.setTabela(leia.nextInt());
			leia.nextLine();
			System.out.println("Horario de Chegada: ");
			novaViagem.setHorarioChegada(leia.nextLine());
			System.out.println("Horario de Partida");
			novaViagem.setHorarioPartida(leia.nextLine());

			viagens.add(novaViagem);
			System.out.println(novaViagem.toString()); 
			System.out.println("Horario da Partida " + novaViagem.getHorarioPartida().substring(0,2));
			

		}

		else if (opcao == 2) {
			// retornar a viagem pelo id e imprimir no console
			System.out.println("digite o ID");
			novaViagem.setId(leia.nextInt());

		}

		else if (opcao == 3)
			// retornar todas as viagens cadastradas e imprimir no console
			viagens.forEach(itemViagem -> System.out.println(itemViagem));
		
		// apagar viagem pelo ID
		else if (opcao == 4) {
			System.out.println("Digite o ID");

		}

		else if (opcao == 5) {
			cadastroViagens=false;
			System.out.println("Sair");

		}
		}
	}
	}

