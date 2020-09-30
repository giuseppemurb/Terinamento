package Controller;

import java.util.Scanner;

public class MetodosController {
	Scanner captura = new Scanner(System.in);
	//Faça um metodo que dobre o valor digitado e imprimi o valor dobrado na main
	
	public Integer dobroValor (int numero) {
		return (numero*2);
	}

	
	public Integer valorDividido (int numero) {
		return (numero/3);
		
	}
	
	public Integer retornaValorNumerico (int numero) {
		return (numero + numero) -1;
	}
	
	//Metodo que imprima o seguinte texto: Você digitou: {Numero} 
	//Sendo que  {Numero}  é o número digitado pelo usuário
	
	public void imprimirTexto (int numero) {
		System.out.println("vc digitou:" + numero);
			
	}
	//criar um método que solicita para o fiscal o nome dele e retorna a String 
			//do nome dele. Imprimir na classe main o nome dele + o valor que ele digitou 
			//no início do programa.
	
	public String solicitaNome ( ) {
		System.out.println("Qual seu nome?");
		String nome = captura.nextLine();
		return nome;
		
	}
	
	public String numTelefone() {
		System.out.println("Digite seu numero de Telefone: ");
		String numeroTelefone = captura.nextLine();
		return numeroTelefone;
		
		
				
	}
	
	//Criar um método na classe controller que imprima o Nome do usuário e o telefone: 
	//O formado deve ser: "Você é a(o) {Nome} e seu Telefone é {Telefone}"
	public void imprimirNomeTelefone (String nome, String telefone) {
		System.out.println("você é a(o) "  + nome + "seu Telefone é " + telefone);
				
	}
	
	//Criar um método na classe Controle que solicite 4 número e retorne um array de 
	//Intenger com os 4 número.
	
	public Integer[] retornoArrayInteger() {
		Integer[] arrayInteger = new Integer[4];
		System.out.println("Digite o primeiro numero");
		arrayInteger[0] = captura.nextInt();
		System.out.println("Digite o segundo numero");
		arrayInteger[1] = captura.nextInt();
		System.out.println("Digite o terceiro numero");
		arrayInteger[2] = captura.nextInt();
		System.out.println("Digite o quarto numero");
		arrayInteger[3] = captura.nextInt();
		return arrayInteger ;
		
		
	}
	

}
