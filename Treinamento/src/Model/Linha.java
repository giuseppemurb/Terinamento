package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Linha {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String numeroLinha;
	private String nomeLinha;
	private String origem;
	private String destino;
	private Boolean ativo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumeroLinha() {
		return numeroLinha;
	}
	public void setNumeroLinha(String numero) {
		/*verificar se a string informada tem apenas 03 caract. 
		se possuir set o valor do numero da linha, caso contrario descarta.*/
		int y = numero.length();
		if(y==3) {
			numeroLinha = numero;
			
		}//fim if
			
		}
	public String getNomeLinha() {
		return nomeLinha;
	}
	public void setNomeLinha(String nomeLinha) {
		this.nomeLinha = nomeLinha.toLowerCase();
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem.toLowerCase();
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino.toLowerCase();
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	@Override
	public String toString() {
		return "Linha [numeroLinha=" + numeroLinha + ", nomeLinha=" + nomeLinha + ", origem=" + origem + ", destino="
				+ destino + ", ativo=" + ativo + "]";
	}
	

}


