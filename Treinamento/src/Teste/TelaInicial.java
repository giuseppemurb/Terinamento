package Teste;

import java.util.Scanner;
import Dao.LinhaDao;
import Model.Linha;

public class TelaInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*imprimir na tela para usuario 3 op�oes de a��es do menu, 1-cadastrar nova linha, 2- consultar linha pelo
	numero, 3- consultar todas as linhas cadastradas*/
					
		System.out.println("1 - cadastrar nova linha");
		System.out.println("2 - consultar linha pelo numero");
		System.out.println("3 - consultar todas as linhas cadastradas");
		System.out.println("4 - sair");
		/*receber do usuario o numero referente a op��o e verificar se � um numero valido. Se valido
		 * imprimir o numero, se n�o valido imprimir -n�o valido  */
		
		boolean lacoWhile = true;
		
		while (lacoWhile==true) {
			Scanner leitor = new Scanner (System.in);
			System.out.println("digite a op��o 1,2,3 ou 4: ");
			Integer opcao = leitor.nextInt();
			leitor.nextLine();
			if (opcao == 1) {
				/* criar classe de abstra��o de uma linha no pacote model*/
				
				Linha novaLinha = new Linha();
				System.out.println("cadastrar nova linha");
				System.out.println("digite o nome da linha");
				novaLinha.setNomeLinha(leitor.nextLine());
				System.out.println("digite o numero da linha");
				novaLinha.setNumeroLinha(leitor.nextLine());
				System.out.println("digite a origem da linha");
				novaLinha.setOrigem(leitor.nextLine());
				System.out.println("digite o destino da linha");
				novaLinha.setDestino(leitor.nextLine());
				System.out.println("linha ativa, true ou false");
				novaLinha.setAtivo(leitor.nextBoolean());
				leitor.nextLine();
				System.out.println(novaLinha.toString());
				/*perguntar p usuario se esta correto, digite s p/sim e n para nao*/
				System.out.println("os dados estao corretos? deseja salvar? s para sim e n para nao: ");
				String respostaUsuario = leitor.next().toLowerCase();
				/* verifica se o que o usuario deseja salvar ou cancelar*/
				
				if(respostaUsuario.equals("s")) {
					
		/*enviar o objeto da classe linha para salvar na nuvem*/
					
					LinhaDao linhaDao = new LinhaDao();
					linhaDao.inserirLinhaDB(novaLinha);
					
					
					
					
					System.out.println("salvo com sucesso");
					
					
					
				}
				
				else {
					System.out.println("reiniciando procedimento");
				}
				
				
			} else if (opcao == 2) {
				System.out.println("cadastrar linha pelo numero");
			}

			else if (opcao == 3) {
				System.out.println("consultar todas as linhas cadastradas");

			}

			else if (opcao == 4) {
				lacoWhile = false; 
				System.out.println("fim do programa");
			} else {

				System.out.println("numero invalido");
			} 
		}
		
		
		}
		
		
		
	
	}


