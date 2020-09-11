package Teste;

import Model.BomDia;

public class TelaInicialBomDia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BomDia novoBomDia = new BomDia();
		
	  String metodoBdPessoal = novoBomDia.BomDiaPessoal();	  
		System.out.println(metodoBdPessoal);
		
	 novoBomDia.bomDia("Giuseppe");
	 
		
		
		
	}


	
}
