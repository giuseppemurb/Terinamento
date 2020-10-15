package Controller;

import java.util.Scanner;

import Model.Contato;

public class ArrayListParte2Controller {
	
	/*0 nome;
	1 numTelefone;
	2 endereçoEmail;
	3  rua;
	4 Integer numeroCasa;
	5 String cidade;
	6 String estado;*/
	
	//metodo que retorna um arrayString com atributos
	//da classe contato, solicitanto ao usuario para preencher.
	Scanner scan = new Scanner(System.in);
		
	public String[] retornaArrayString() {
		//String[] arrayStringViagem = new String[4];
		String[] arrayStringContato = new  String[7];
		System.out.println("Digite seu nome: ");
		arrayStringContato[0] = scan.nextLine();
		System.out.println("Digite Número de Telefone");
		arrayStringContato[1] = scan.nextLine();
		System.out.println("Digite E-mail");
		arrayStringContato[2] = scan.nextLine();
		System.out.println("Digite Rua");
		arrayStringContato[3] = scan.nextLine();
		System.out.println("Digite Número da Residencia");
		arrayStringContato[4] = scan.nextLine();
		System.out.println("Digite a cidade: ");
		arrayStringContato[5] = scan.nextLine();
		System.out.println("Digite o Estado");
		arrayStringContato[6] = scan.nextLine();
		
		return arrayStringContato;
		
		
		
	}
	
	//metodo que retorna um Contato solicitando dados do usuario
	
	
	
	public Contato retornaContato() {
		Contato contato = new Contato();	
		System.out.println("Digite o nome");
		contato.setNome(scan.nextLine());
		System.out.println("Digite Número de Telefone");
		contato.setEndereçoEmail(scan.nextLine());
		System.out.println("Digite E-mail");
		contato.setEndereçoEmail(scan.nextLine());
		System.out.println("Digite Rua");
		contato.setRua(scan.nextLine()); 
		System.out.println("Digite Número da Residencia");
		contato.setNumeroCasa(scan.nextInt()); 
		scan.nextLine();
		System.out.println("Digite a cidade: ");
		contato.setCidade(scan.nextLine()) ;
		System.out.println("Digite o Estado");
		contato.setEstado(scan.nextLine()) ;
		
		return contato;
		
	}
	
	/*metodo que tem como entrada um array String (parâmetro) que retorna um contato
	preenchidos com valores do array*/
	public Contato retornaContato(String[] arrayStringContato ) {
		Contato contato = new Contato();
		/*0 nome;
		1 numTelefone;
		2 endereçoEmail;
		3  rua;
		4 Integer numeroCasa;
		5 String cidade;
		6 String estado;*/
		contato.setNome(arrayStringContato[0]);
		contato.setNumTelefone(Integer.parseInt(arrayStringContato[1]));
		contato.setEndereçoEmail(arrayStringContato[2]);
		contato.setRua(arrayStringContato[3]);
		contato.setNumeroCasa(Integer.parseInt(arrayStringContato[4]));
		contato.setCidade(arrayStringContato[5]);
		contato.setEstado(arrayStringContato[6]);
		
		return contato;
		
		
		
	}
}
