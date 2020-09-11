package Teste;

import java.util.Scanner;

import Model.PontoControle;

public class TelaInicialPontoControle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("opção <1> para Cadastro de controle");
		System.out.println("opçao <2> para Consultar classe Dao pela sigla");
		System.out.println("opçao <3> para Sair ");
		Scanner leia = new Scanner(System.in);
		Boolean cadastramento = true;
		while(cadastramento==true){
		PontoControle novoPonto = new PontoControle();
		 int opcao = leia.nextInt();
		 leia.nextLine();
		if(opcao==1) {
			System.out.println("digite nome do ponto: ");
			novoPonto.setNomePonto(leia.nextLine());
			
			System.out.println("digite a sigla do ponto: ");
			novoPonto.setSigla(leia.nextLine());
			
			System.out.println("digite o endereço: ");
			novoPonto.setEndereco(leia.nextLine());
			
			System.out.println(novoPonto.toString());
			
		}
		
		 else if (opcao==2) {
			System.out.println("Consultar a classe Dao pela sigla");
			
		}
		
		 else if  (opcao==3){
			 cadastramento=false;
    System.out.println("fim");
			}   
		
		 else {
			 System.out.println("numero invalido");
		 }
		
		}//fim while
		
	     
		
	
	
	}

}
