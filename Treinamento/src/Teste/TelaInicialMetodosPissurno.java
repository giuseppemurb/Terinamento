package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaInicialMetodosPissurno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//String[] arrayFiscais = new String[4];
	// criação de array de fiscais com 4 posições
	String arrayFiscais[]=new String[4];
	//populamos as 4 posições do array na unha
	arrayFiscais[0] = "João";
	arrayFiscais[1] = "Maria";
	arrayFiscais[2] = "Pedro";
	arrayFiscais[3] = "Ana";
	
	Scanner captura = new Scanner(System.in);
	
	//criamos um array de nomes com 4 posições
	String arrayNomes[]=new String[4];
	//populamos as posições do array com estrutura de repetição em laço for
	for (int i = 0; i<arrayNomes.length ; i++) {
		System.out.println("Digite um nome");
		arrayFiscais[i] = captura.nextLine();
		
	}
	// imprimimos o array com estrutura de repetição em laço
	for(int i = 0; i<arrayNomes.length ; i++) {
		System.out.println(arrayFiscais[i]);
		
		
	}
	// criamos lista de nomes 
	List<String> nomes = new ArrayList<String>();
	//populamos a lista com os dados contidos no array fiscais na unha
	nomes.add(arrayFiscais[0]);
	nomes.add(arrayFiscais[1]);
	nomes.add(arrayFiscais[2]);
	nomes.add(arrayFiscais[3]);
	//impressão da lista
	System.out.println("impressão da lista nomes na unha");
	System.out.println(nomes.get(0) +" "+ nomes.get(1) +" " + nomes.get(2) +" "+ nomes.get(3));
	
	System.out.println("impressão com for");
	for(int i =0; i<nomes.size(); i++) {
		System.out.println(nomes.get(i));
		
	}
	
	
	
	
	}
	
	
	
	

}
