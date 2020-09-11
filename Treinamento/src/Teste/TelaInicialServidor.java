package Teste;

import java.util.Scanner;

import Controller.ServidorMetodos;
import Model.Servidor;

public class TelaInicialServidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.println("\n**** CADASTRO DE SERVIDORES**** \n");
		System.out.println("<1> Cadastrar usuario");
		System.out.println("<2> Retornar usuário pela Matricula");
		System.out.println("<3> Efetuar login e senha");
		System.out.println("<4> Sair");
		
		Integer opcao = leia.nextInt();
		leia.nextLine();
		
		if(opcao==1) {
		Servidor novoServidor = new Servidor();
		System.out.println("Digite o nome do Servidor: ");
		novoServidor.setNome(leia.nextLine());
		System.out.println("Digite sua matricula: ");
		novoServidor.setMatricula(leia.nextInt());
		leia.nextLine();
		System.out.println("Digite seu login: ");
		novoServidor.setLogin(leia.nextLine());
		System.out.println("Digite sua senha: ");
		novoServidor.setSenha(leia.nextLine());
		
		System.out.println(novoServidor.toString());
	}
		else if(opcao==2) {
			ServidorMetodos metodoMatricula = new ServidorMetodos();
			metodoMatricula.retornoMatricula(leia.nextInt());
			
		}
	}
}
