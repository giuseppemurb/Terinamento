package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Integer numTelefone;
	private String endereçoEmail;
	private String rua;
	private Integer numeroCasa;
	private String cidade;
	private String estado;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toLowerCase();
	}
	public Integer getNumTelefone() {
		return numTelefone;
	}
	public void setNumTelefone(Integer numTelefone) {
		this.numTelefone = numTelefone;
	}
	public String getEndereçoEmail() {
		return endereçoEmail;
	}
	public void setEndereçoEmail(String endereçoEmail) {
		this.endereçoEmail = endereçoEmail;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Integer getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(Integer numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		
		this.cidade = cidade;
		}
		
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		if(estado.length()==2) {
		this.estado = estado.toLowerCase();
	}
		else {
			System.out.println("Digitar somente as siglas dos Estados");
		}
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", numTelefone=" + numTelefone + ", endereçoEmail="
				+ endereçoEmail + ", rua=" + rua + ", numeroCasa=" + numeroCasa + ", cidade=" + cidade + ", estado="
				+ estado + "]";
	}
	

	
	
	
	

	
	}

