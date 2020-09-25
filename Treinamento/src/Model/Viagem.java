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
	//null é != de vazio (não instanciado)
	private Integer linha = null;  //atributo obrigatório
	private Integer tabela = null; //atributo obrigatório
	private String horarioPartida = new String(); //atributo obrigatório
	private String horarioChegada = new String(); //atributo obrigatório
	
	
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
			System.out.println("Escrita da hora deve seguir o Ex:  00h00");
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
	//Criar metodo modo Viagem para verfificar se o objeto esta como todos os atributos
	//obrigatórios preenchidos
	public Boolean verificarPreenchimento() {
			if(linha!=null && tabela!=null && !horarioPartida.equals("") && !horarioChegada.equals("")) {
			System.out.println("Dados preenchidos");
			return true;
			
			
		}
		else {
			System.out.println("Dados não Preenchidos");
			return false;
			
		}
	}
	
	
	public String retornarStringViagem(Viagem viagem) {
		
		String retornoViagem = "[" + viagem.getLinha() + "]" + "[" + viagem.getHorarioChegada() +"]"+ "[" + viagem.getHorarioPartida()+"]";
		return retornoViagem;
		
	}
	

}	