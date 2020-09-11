package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Agenda;

public class TelaInicialAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List<Endereco> enderecos = new ArrayList<Endereco>();
		List<Agenda> contatos = new ArrayList<Agenda>();
		Scanner leia = new Scanner(System.in);
		
		Boolean lacoWhile = true;
		System.out.println("**** LISTA DE CONTATOS****");
		
		while(lacoWhile==true) {
		System.out.println("Digite <1> Adicionar contato, <2> Imprimir contatos, <3> Sair");
		Integer opcao = leia.nextInt();
		leia.nextLine();
		Agenda novaAgenda = new Agenda();
		
		if(opcao==1) {
			System.out.println("Digite o nome do contato: ");
			novaAgenda.setNome(leia.nextLine());
			System.out.println("Digite o numero do telefone: ");
			novaAgenda.setNumTelefone(leia.nextInt());
			leia.nextLine();
			contatos.add(novaAgenda);
		}
		////itensA.forEach(item->System.out.println(item));
		else if(opcao==2) {
		System.out.println("imprimindo a contatos com to String \n ");
		System.out.println(contatos.toString());
		System.out.println("imprimindo contato com ForEach");
		contatos.forEach(itemContato->System.out.println(itemContato));
		//	
		}
		
		else if(opcao==4){
			lacoWhile=false;
			System.out.println("fim");
			
		}
		
		else{
			System.out.println("numero não valido");
		}
			
			
			
			
		}// fim while
			
		
		}
		
		
	}

