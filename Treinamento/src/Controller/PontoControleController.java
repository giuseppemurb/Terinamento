package Controller;

import java.util.Scanner;

public class PontoControleController {
	
	//criar metodo que retorne um String[] com as informações da classe Ponto de Controle
	// solicitando ao usuario as informações.
	
	public String[] retornaDadosPontoControle () {
	String[] arrayStringPontoControle = new String[3];
	Scanner scan = new Scanner(System.in);	
	
		System.out.println("Digite o nome do Ponto: ");
		arrayStringPontoControle[0] = scan.nextLine();
		
		System.out.println("Digite a sigla: ");
		arrayStringPontoControle[1] = scan.nextLine();
		
		System.out.println("Digite o endereço: ");
		arrayStringPontoControle[2] = scan.nextLine();
	
	
	
	
		return arrayStringPontoControle;
		
		
	}
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}