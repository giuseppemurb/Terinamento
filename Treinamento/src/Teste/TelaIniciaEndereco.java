package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Endereco;

public class TelaIniciaEndereco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List<Endereco> enderecos = new ArrayList<Endereco>();
		
		List<Endereco> listaEnderecos = new ArrayList<Endereco>();
		Scanner leia = new Scanner(System.in);
		boolean lacoWhile = true;
		while (lacoWhile == true) {
			
			System.out.println("\n *** CADASTRO DE ENDEREÇOS ***\n");
			System.out.println("Digite <1> para Cadastro");
			System.out.println("Digite <2> para Imprimir Lista");
			System.out.println("Digite <3> para Sair");
			
			Endereco novoEndereco = new Endereco();
			int opcao = leia.nextInt();
			leia.nextLine();
			if (opcao == 1) {

				System.out.println("nome da rua: ");
				novoEndereco.setRua(leia.nextLine());
				System.out.println("numero da casa: ");
				novoEndereco.setNumero(leia.nextInt());
				leia.nextLine();
				System.out.println("Bairro: ");
				novoEndereco.setBairro(leia.nextLine());
				System.out.println("CEP: ");
				novoEndereco.setCep(leia.nextLine());
				System.out.println("Municipio: ");
				novoEndereco.setMunicipio(leia.nextLine());
				System.out.println("Estado: ");
				novoEndereco.setEstado(leia.nextLine());
				System.out.println("Proprietario: ");
				novoEndereco.setProprietario(leia.nextLine());

				
				listaEnderecos.add(novoEndereco);
				

			} // fim if
			
			else if(opcao==2) {
				// usando forEach
				//itensA.forEach(item->System.out.println(item));
				System.out.println("impressão com forEach");
				listaEnderecos.forEach(itemEndereco->System.out.println(itemEndereco));
				System.out.println("impressão com toString");
				System.out.println(listaEnderecos.toString());
					
			}
			

			else if (opcao == 3) {
				lacoWhile = false;
				System.out.println("sair");
			}

			else {
				System.out.println("fim");
			}
		} // fim while

	}

}
