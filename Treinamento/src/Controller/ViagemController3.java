package Controller;

import Model.Viagem;

public class ViagemController3 {

	// metodo que recebe um array e devolve um objeto.
	
	public Viagem retornaObjetoViagem(String[] arrayStringViagem) {
	Viagem viagemAtributosViagem = new Viagem();
	viagemAtributosViagem.setLinha(Integer.parseInt(arrayStringViagem[0]));
	viagemAtributosViagem.setTabela(Integer.parseInt(arrayStringViagem[1]));
	viagemAtributosViagem.setHorarioChegada(arrayStringViagem[2]);
	viagemAtributosViagem.setHorarioPartida(arrayStringViagem[3]);
	
	return viagemAtributosViagem;
	}
	
	//retornar array String com as informações dos atributos do objeto da Classe viagem recebida como parametro
	
	public String[] retornaArrayString(Viagem objViagem) {
		String[] arrayStringViagem = new String[4];
		String linha = String.valueOf(objViagem.getLinha()) ;
		String tabela = String.valueOf(objViagem.getTabela());
		String horarioChegada = objViagem.getHorarioChegada();
		String horarioPartida = objViagem.getHorarioPartida();
		
		arrayStringViagem[0] = linha;
		arrayStringViagem[1] = tabela;
		arrayStringViagem[2] = horarioChegada;
		arrayStringViagem[3] = horarioPartida;
		
		return arrayStringViagem;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public String[] retornaArrayString(Viagem objViagem ) {
		String[] arrayStringViagem = new String[4];
		arrayStringViagem[0] = String.valueOf(objViagem.getLinha());
		arrayStringViagem[1] = String.valueOf(objViagem.getTabela());
		arrayStringViagem[2] = objViagem.getHorarioPartida();
		arrayStringViagem[3] = objViagem.getHorarioPartida();
		
	return arrayStringViagem;*/	
	} 
	
		/*public String[] retornaArrayStringViagem(Viagem objViagem) {
		String[] arrayStringViagem = new String[5];
		String linha = String.valueOf(objViagem.getLinha());
		arrayStringViagem[1] = linha;
		String tabela = String.valueOf(objViagem.getTabela());
		arrayStringViagem[2] = tabela;
		String horarioChegada = objViagem.getHorarioChegada();
		arrayStringViagem[3] = horarioChegada;
		String horarioPartida = objViagem.getHorarioPartida();
		arrayStringViagem[4] = horarioPartida;
		
		return arrayStringViagem;
		
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


