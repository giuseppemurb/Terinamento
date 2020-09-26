package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.ViagemController;
import Dao.ViagemDao;
import Model.Viagem;
public class TelaInicialCadastroViagem {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ViagemController viagemController = new ViagemController();
		Scanner leia = new Scanner(System.in);
		boolean lacoWhille = true;
		while(lacoWhille) {
				
		viagemController.imprimirOpcoes();
			
		Integer retornoOpcao = viagemController.solicitarOpcao(leia.nextInt(), leia);
		if(retornoOpcao==5) {
			lacoWhille = false;
			
		}
		else if(retornoOpcao == -1) {
			System.out.println("opção invalida");
		}
		
		}
		
		
		/*viagemController.solicitarOpcao2(captura.nextInt());
		captura.nextLine();
		
		viagemController.solicitarOpcao3(captura.nextInt());
		captura.nextLine();
		
		viagemController.solicitarOpcao4(captura.nextInt());
		captura.nextLine();
		
		viagemController.solicitarOpcao5(captura.nextInt());
		captura.nextLine();*/
		
				
			
		
		}
	
	}
	
	
	

