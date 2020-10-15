package Teste;

import Controller.MotoristaController2;
import Model.Motorista;

public class TelaIncialMotoristaController2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MotoristaController2 motoristaController2 = new MotoristaController2();
		
		String[] retornoArray = motoristaController2.arrayStringMotorista();
		
		for(int i = 0; i<retornoArray.length; i++) {
			System.out.println(retornoArray[i]);
			
		}
		
		
		
		Motorista resultadoRetornoMotorista = motoristaController2.retornaMotorista(retornoArray);
		System.out.println(resultadoRetornoMotorista);
	
	}

}
