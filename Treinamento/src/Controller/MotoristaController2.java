package Controller;

import java.util.Scanner;

import Model.Motorista;

public class MotoristaController2 {
//private String nome;
//	private Integer matricula;
	
	//cria array
	//String[] arrayStringViagem = new String[4];
	Scanner scan = new Scanner(System.in);
	
	public String[] arrayStringMotorista () {
 	String[] arrayStringMotorista = new String[2];
	System.out.println("Digite nome: ");
 	arrayStringMotorista[0] = scan.nextLine();
 	System.out.println("Digite Matricula: ");
	arrayStringMotorista[1] = scan.nextLine();
	
	return arrayStringMotorista;
	
	}	
	
	//receber array um array de String e retornar um objeto de motorista com informações do array
	
	public Motorista retornaMotorista(String[] arrayStringMotorista) {
		Motorista dadosMotorista = new Motorista();
		
		dadosMotorista.setNome(arrayStringMotorista[0]);
		dadosMotorista.setMatricula(Integer.parseInt(arrayStringMotorista[1]));
		
		return dadosMotorista;
		
	}
	
	
}
