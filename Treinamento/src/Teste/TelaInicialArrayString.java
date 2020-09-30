
package Teste;

import java.util.Scanner;

import Model.Viagem;

public class TelaInicialArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] arrayStringViagem = new String[4];
		String[] arrayStringViagem = new String[4];
		Scanner captura = new Scanner(System.in);
		Viagem novaViagem = new Viagem();
		
		System.out.println("Digite a Tabela");
		arrayStringViagem[0] = captura.nextLine();
		System.out.println("Digite a Linha");
		arrayStringViagem[1]= captura.nextLine();
		System.out.println("Digite o Horario de Chegada");
		arrayStringViagem[2] = captura.nextLine();
		System.out.println("Digite o Horario de Partida");
		arrayStringViagem[3] = captura.nextLine();
		
		
		System.out.println("Tabela: " + arrayStringViagem[0]);
		System.out.println("Linha: " + arrayStringViagem[1]);
		System.out.println("Horário de Chegada: " + arrayStringViagem[2]);
		System.out.println("Horário de Partida: " + arrayStringViagem[3]);
		
		
		novaViagem.setTabela(Integer.parseInt(arrayStringViagem[0]));
		novaViagem.setLinha(Integer.parseInt(arrayStringViagem[1]));
		novaViagem.setHorarioPartida(arrayStringViagem[2]);
		novaViagem.setHorarioChegada(arrayStringViagem[3]);
	}

}
