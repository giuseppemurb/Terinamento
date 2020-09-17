package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Viagem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
		if(horarioPartida.length()==5 && horarioPartida.indexOf("h")==2) {
			this.horarioPartida = horarioPartida;
		}
		else {
			System.out.println("horario deve ser escrito assim:  00h00");
		}
		
	}
	public String getHorarioChegada() {
		return horarioChegada;
	}
	public void setHorarioChegada(String horarioChegada) {
		if(horarioChegada.length()==5 && horarioChegada.indexOf("h")==2) {
			
		}
		this.horarioChegada = horarioChegada;
	}
	@Override
	public String toString() {
		return "Viagem [id=" + id + ", linha=" + linha + ", tabela=" + tabela + ", horarioPartida=" + horarioPartida
				+ ", horarioChegada=" + horarioChegada + "]";
	}
	

}	