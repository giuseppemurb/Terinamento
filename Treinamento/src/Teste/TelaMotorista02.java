package Teste;

import java.util.Scanner;

import Model.Motorista;

public class TelaMotorista02 {
public static void main(String[] args) {
	/*criar e imprimir o objeto novo motorista e  captura de dados*/
	// criando formulario de cadastro e instanciando o novo objeto//
	
	Scanner leitor = new Scanner(System.in);
	Motorista novoMotorista = new Motorista();
	System.out.println("Digite o ID: ");
	novoMotorista.setId(leitor.nextInt());
	leitor.nextLine();
	System.out.println("Digite o Nome: ");
	novoMotorista.setNome(leitor.nextLine());
	System.out.println("Digite a Matricula: ");
	novoMotorista.setMatricula(leitor.nextInt());
	leitor.nextLine();
	
	System.out.println("ID: " + novoMotorista.getId());
	System.out.println("Nome: " + novoMotorista.getNome());
	System.out.println("Matricula: " + novoMotorista.getMatricula());
	
	System.out.println(novoMotorista.toString());
	dadosMotorista(novoMotorista.getId(), novoMotorista.getNome(),novoMotorista.getMatricula());
	
	bomDia();
	
} // fim classe main


public static void dadosMotorista(Integer id, String nome, Integer matricula) {
	System.out.println("");
	System.out.println("imprimindo dados pelo metodo");
	System.out.println(id + " " +  nome + " " +  matricula);
}

public static void bomDia() {
	System.out.println("Bom dia Maiara");
	
}

}




