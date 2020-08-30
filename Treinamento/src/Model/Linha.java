package Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Linha {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer numeroLinha;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the numeroLinha
	 */
	public Integer getNumeroLinha() {
		return numeroLinha;
	}
	/**
	 * @param numeroLinha the numeroLinha to set
	 */
	public void setNumeroLinha(Integer numeroLinha) {
		this.numeroLinha = numeroLinha;
	}
	
	
	

}
