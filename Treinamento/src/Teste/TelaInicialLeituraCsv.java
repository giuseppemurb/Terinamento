package Teste;

import java.util.List;

import Controller.CsvController;
import Controller.ViagemController2;
import Dao.ViagemDao;
import Model.Viagem;


public class TelaInicialLeituraCsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CsvController csvController = new CsvController();
		String caminhoArquivo = "C:\\csv\\ViagemTreinamento.csv";
		
		List<String[]> retornoListString = csvController.retornarCsv(caminhoArquivo);
		
		for(Integer i = 0; i < retornoListString.size(); i++) {
				String[] itemList = retornoListString.get(i);
			
			//	for(Integer x = 0; x<itemList.length; x++) {
					//System.out.println(itemList[x]);
	//}
				
			ViagemController2 viagemController2 = new ViagemController2();
				
			Viagem novaViagem = new Viagem();
			novaViagem = viagemController2.retornaObjetoViagem(itemList);
			//System.out.println(novaViagem);
			
			ViagemDao viagemDao = new ViagemDao();
			
			viagemDao.inserirViagem(novaViagem);
			
		}
		
		
		ViagemDao viagemDao = new ViagemDao();
		
		List<Viagem> listaViagensBanco = viagemDao.retornarListViagem();
		for(Integer i=0; i<listaViagensBanco.size(); i++) {
			System.out.println(listaViagensBanco.get(i));
			
			
			
		}
	}

}
