package Teste;

import java.util.Scanner;

import Controller.MetodosController;

public class TelaInicialMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		MetodosController metodoController = new MetodosController();
		
		System.out.println("Digite um numero: ");
		Integer numero = scan.nextInt();
		scan.nextLine();
		
		Integer numeroDobrado = (metodoController.dobroValor(numero));
		System.out.println(numeroDobrado);
		
		
		Integer numeroDivido = metodoController.valorDividido(metodoController.dobroValor(numero));
		System.out.println(numeroDivido);
		
		Integer retornoValor = metodoController.retornaValorNumerico(numero);
		System.out.println(retornoValor);
		
		metodoController.imprimirTexto(numero);
		
		
		String nomeDigitado = metodoController.solicitaNome();
		System.out.println(nomeDigitado  + numero);
		
		
		String numeroDigitado = metodoController.numTelefone();
		System.out.println(numeroDigitado);
		
		metodoController.imprimirNomeTelefone(nomeDigitado , numeroDigitado);
		
		Integer[] array = metodoController.retornoArrayInteger();
		System.out.println(array[1]);
		
		
	}
	
	public Integer converteStringInteger (String texto) {
		return Integer.parseInt(texto
				);
		
	}

}
