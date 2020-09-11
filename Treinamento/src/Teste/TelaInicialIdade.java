package Teste;

import java.util.Scanner;

import Controller.Idade;

public class TelaInicialIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Idade novaIdade = new Idade();
		Scanner leia = new Scanner(System.in);
		
		//- o método main deve capturar o nome da pessoa e a data de nascimento//
		System.out.println("qual seu nome: ");
		String nome = leia.nextLine();
		System.out.println("Digite o ano de nascimento: ");
		Integer anoNascimento = leia.nextInt();
		
		novaIdade.bomDia(nome);
		
		
		
		novaIdade.idadePessoa(2020, anoNascimento);
		

	}

}
