package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dao.ViagemDao;
import Model.Viagem;

public class TelaInicialCadastroViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		Boolean lacoWhile = true;
		while (lacoWhile == true) {
			System.out.println("\n****CADASTRO DE VIAGEM***\n");
			System.out.println("<1> Cadastrar Viagem");
			System.out.println("<2> Retornar Viagem pela Id e Imprimir");
			System.out.println("<3> Retornar Viagens Cadastradas e Imprimir");
			System.out.println("<4> Apagar Viagem");
			System.out.println("<5> Sair");

			
			Integer opcao;
			opcao = leia.nextInt();
			leia.nextLine();
			if (opcao == 1) {
				Viagem novaViagem = new Viagem();
				System.out.println("Digite a linha: ");
				novaViagem.setLinha(leia.nextInt());
				leia.nextLine();
				System.out.println("Digite a tabela: ");
				novaViagem.setTabela(leia.nextInt());
				leia.nextLine();
				System.out.println("Digite Horario Partida:");
				novaViagem.setHorarioPartida(leia.nextLine());
				System.out.println("Digite Horario Chegada");
				novaViagem.setHorarioChegada(leia.nextLine());

				System.out.println(novaViagem.toString());

				List<Viagem> viagens = new ArrayList<Viagem>();
				viagens.add(novaViagem);
				

				ViagemDao viagemDao = new ViagemDao();

				Boolean insercaoBancoDados = viagemDao.inserirViagem(novaViagem);
				if (insercaoBancoDados == true) {
					System.out.println("Salvo");
				}

				else {
					System.out.println("Não Salvo");
				}

			} // fim opcao 1

			if (opcao == 2) {
				// ja existe no banco de dados os dados do ID(objeto)//
				// ja existe o metodo para chamar pelo objeto do banco//

				// foi criado esse objeto para acessar o metodo retornarViagemPelaId da classe
				// ViagemDao
				ViagemDao viagemDao = new ViagemDao();

				System.out.println("Digite o id");
				Integer idViagem = leia.nextInt();
				leia.nextLine();

				// grava em um objeto em branco, do mesmo tipo do objeto do banco, a informação
				// do objeto que foi solicitado via metodo por id//

				Viagem viagemRetornadaDb = viagemDao.retornarViagemPelaId(idViagem);
				System.out.println(viagemRetornadaDb);

				// QuadradoDao quadradoDao = new QuadradoDao();
				// esse quadrado recebe o objeto quadrado que esta vindo do banco
				// informa o tipo da váriavel e cria objeto para receber informações do metodo
				// que ta vindo do banco
				// Quadrado objRetornoId = quadradoDao.retornarQuadradePelaId(id);
				// System.out.println(objRetornoId);

			} else {
				System.out.println("id não cadastrada");
			}

			// fim opcao 2//

			if (opcao == 3) {
				// retornar todas as viagens cadastradas no console
				// criei objeto listaViagemRetornoBd, do tipo lista de viagens
				// para armazenar lista de viagens que retorna do banco de dados
				List<Viagem> listaViagemRetornoBd = new ArrayList<Viagem>();
				// criei objeto viagemDao para invocar metodo retornarListViagem
				ViagemDao viagemDao = new ViagemDao();
				// armazenei em listaViagemRetornoBd, a lista de viagem retornada pelo metodo
				// retornarListViagem
				listaViagemRetornoBd = viagemDao.retornarListViagem();

				// impressão com toString
				System.out.println("impressão com toString");
				System.out.println("Lista de viagem: " + listaViagemRetornoBd);
				// impressão com forEach
				System.out.println("impressão com forEach");
				listaViagemRetornoBd.forEach(cadaViagem -> System.out.println(cadaViagem));

			} else {
				System.out.println("não foi possivel imprimir a lista");
			}
			// fim opcao 3

			if (opcao == 4) {
				ViagemDao viagemDao = new ViagemDao();
				Boolean apagarViagemPelaId = viagemDao.exluirViagemPelaId(leia.nextInt());
				leia.nextLine();
				if (apagarViagemPelaId) {
					System.out.println("Viagem excluida");

				}

				else {
					System.out.println("Viagem não excluida");
				}
			} // fim opcao 4

			if (opcao == 5) {
				lacoWhile = false;
				System.out.println("sair");

			} // fim opcao 5

		} // fim while
	}

}
