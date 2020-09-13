package Teste;

import java.util.Scanner;

import Controller.ServidorMetodos;
import Dao.ServidorDao;
import Model.Servidor;

public class TelaInicialServidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		ServidorDao servidorDao = new ServidorDao();
		
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
		novoServidor.setMatricula(leia.nextLine());
		System.out.println("Digite seu login: ");
		novoServidor.setLogin(leia.nextLine());
		System.out.println("Digite sua senha: ");
		novoServidor.setSenha(leia.nextLine());
		
		System.out.println(novoServidor.toString());
		
		
		
		Boolean servidorSalvo = servidorDao.inserirServidor(novoServidor);
		
		if(servidorSalvo==true) {
			System.out.println("Servidor salvo");
		}
		
		else {
			System.out.println("Servidor não salvo");
		}
	}
		
		
		else if(opcao==2) {
			System.out.println("qual sua matricula: ");
			System.out.println(servidorDao.retornaServidorMatricula(leia.nextLine()).toString().toUpperCase());
			
			
		}
	}
}
