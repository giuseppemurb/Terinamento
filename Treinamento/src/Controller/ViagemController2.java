package Controller;

import Model.Viagem;

public class ViagemController2 {
	
	
	public Viagem retornaObjetoViagem(String[] arrayViagem) {
		Viagem viagem = new Viagem();
		/*
		 * linha
		 * tabela
		 * hor partida
		 * hor chegara*/
		viagem.setLinha(Integer.parseInt(arrayViagem[0]));
		viagem.setTabela(Integer.parseInt(arrayViagem[1]));
		viagem.setHorarioChegada(arrayViagem[2]);
		viagem.setHorarioPartida(arrayViagem[3]);
		return viagem;
	}

}
