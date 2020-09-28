package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.ConatatoController;
import Dao.ContatoDao;
import Model.Contato;

public class TelaInicialContato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConatatoController contatoController = new ConatatoController();
		Scanner scanner = new Scanner(System.in);
		boolean lacoWhile = true;
		while(lacoWhile) {
			contatoController.imprimirOpçao();
			int opcao = scanner.nextInt();
			scanner.nextLine();
			contatoController.primeiraOpcao(opcao , scanner);
			scanner.nextLine();
			
			contatoController.segundaOpcao(opcao , scanner );
			scanner.nextLine();
			
			contatoController.terceiraOpcao(opcao , scanner);
			scanner.nextLine();
			
			contatoController.quartaOpcao(opcao , scanner);
			scanner.nextLine();
			
			contatoController.quintaOpcao(opcao , scanner);
			scanner.nextLine();
			
			
			if(opcao==6) {
			contatoController.sextaOpcao(scanner.nextInt() , scanner);
			scanner.close();
			lacoWhile=false;
			}
			System.out.println("sair");

			

			
			
			} //fim main
	
	}
}		
			

			

		
	

