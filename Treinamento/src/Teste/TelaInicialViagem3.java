package Teste;

import java.util.Scanner;


import Controller.ViagemController3;
import Model.Viagem;

public class TelaInicialViagem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	ViagemController3 viagemController3 = new ViagemController3();
	Viagem novaViagem = new Viagem();
	novaViagem.setLinha(80);
	novaViagem.setTabela(3);
	novaViagem.setHorarioPartida("12h35");
	novaViagem.setHorarioChegada("13h00");
	String[] resultadoArray = viagemController3.retornaArrayString(novaViagem);
	
	
	//imprimindo array
	System.out.println(resultadoArray[0]);
	System.out.println(resultadoArray[1]);	
	System.out.println(resultadoArray[2]);	
	System.out.println(resultadoArray[3]);	
	
	String[] arrayStringViagem = new String[4];
	arrayStringViagem[0] = "070";
	arrayStringViagem[1] = "3";
	arrayStringViagem[2] = "12h30";
	arrayStringViagem[3] = "13h30";
	
	viagemController3.retornaObjetoViagem(arrayStringViagem);
	
	
	
	
	
	}

}
