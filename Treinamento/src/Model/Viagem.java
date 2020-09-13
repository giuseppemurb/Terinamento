package Model;

public class Viagem {

	private Integer id;
	private Integer linha;
	private Integer tabela;
	private String horarioPartida;
	private String horarioChegada;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLinha() {
		return linha;
	}

	public void setLinha(Integer linha) {
		this.linha = linha;
	}

	public Integer getTabela() {
		return tabela;
	}

	public void setTabela(Integer tabela) {
		this.tabela = tabela;
	}

	public String getHorarioPartida() {
		return horarioPartida;
	}

	public void setHorarioPartida(String horarioPartida) {
		//Os horarios devem receber dados string (apenas 5 digitos)//
		// e obrigatoriamente com h//
		//10H10
		
		if (horarioPartida.length() == 5 && horarioPartida.indexOf("h")==2) {
			this.horarioPartida = horarioPartida.toLowerCase();
			//System.out.println("Horario da partida parâmetro" + horarioPartida );
			//System.out.println("horario da partida Atributo da Classe" + this.horarioPartida);
		}

		else {
			System.out.println("o horário deve conter: 05 digitos e deve conter o h, Ex: 00h00");
		}
		
	}

	public String getHorarioChegada() {
		return horarioChegada;
	}

	public void setHorarioChegada(String horarioChegada) {
		if (horarioChegada.length() == 5 && horarioChegada.indexOf("h")==2) {
			this.horarioChegada = horarioChegada.toLowerCase();
		}
		
		 else {
			System.out.println("o h deve ser o terceiro digito");
		}

	}

	@Override
	public String toString() {
		return "Viagem Cadastrada [id=" + id + ", linha=" + linha + ", tabela=" + tabela + ", horarioPartida="
				+ horarioPartida + ", horarioChegada=" + horarioChegada + "]";
	}

}
	