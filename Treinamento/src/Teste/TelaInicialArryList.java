package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dao.ContatoDao;
import Model.Contato;

public class TelaInicialArryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] tresNomes 	=	new String[3];
		
		
		tresNomes[0] = "Edgar Figueró"; 
		tresNomes[1] = "Henrico Copabianco";
		tresNomes[2] = "Helcio";
			
		
		System.out.println(tresNomes[2]);
		System.out.println(tresNomes.length);
		
		
		
		List<String>  nomeFiscal = new ArrayList<String> ();
						
		nomeFiscal.add("Lizi Kaiser");
		nomeFiscal.add("Cristine");
		nomeFiscal.add("Rejanny");
		
		
		System.out.println(nomeFiscal.get(2));
		System.out.println(nomeFiscal.size());
		
		List<String>  fiscalRico = new ArrayList<String> ();
		
		Scanner leia = new Scanner(System.in);
		fiscalRico.add("Joao");
				
		for( int i = 0; i<=2 ; i++  ) {
			System.out.println("Digite o nome do fiscal: ");
			fiscalRico.add(leia.nextLine());
			
		}
		//System.out.println(fiscalRico.get(0));
		
		/*
		String[] fiscalPobre = new String[3];
		
		for(int i = 0 ; i<=2 ; i++) {
		System.out.println("Digite o nome do fiscal");
			fiscalPobre[i] = leia.nextLine();
		
		}
		*/
		for(int i =0; i<fiscalRico.size(); i++) {
			System.out.println(fiscalRico.get(i));
			
		}
		
		ContatoDao contatoDao = new ContatoDao();
		
		
		
		List<Contato> contatoRetornadoBd = contatoDao.retornarListContatos();
		
		for(int i=0 ; i<contatoRetornadoBd.size(); i++)  {
			System.out.println(contatoRetornadoBd.get(i).getEndereçoEmail());
			
			
			
		}
		
		
		
		
	}

}
