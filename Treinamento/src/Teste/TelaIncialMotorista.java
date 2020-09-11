package Teste;

import java.util.Scanner;

import Model.Motorista;

public class TelaIncialMotorista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorista novoMotorista = new Motorista();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		novoMotorista.setNome(leitor.nextLine());
		System.out.println("Digite id: ");
		novoMotorista.setId(leitor.nextInt());
		leitor.nextLine();
		System.out.println("Digite matricula: ");
		novoMotorista.setMatricula(leitor.nextInt());
		leitor.nextLine();
		System.out.println("fim de programa");
		
	
		
		System.out.println("Dados do motorista cadastrado: " + novoMotorista.toString());
		System.out.println("nome do motorista: " + novoMotorista.getNome());
		System.out.println("Matricula: " + novoMotorista.getMatricula());
		
		
	
		
		
		

	}

}
