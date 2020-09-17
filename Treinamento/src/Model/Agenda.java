package Model;

public class Agenda {
	
	private String nome;
	private Integer numTelefone;
	private String endereçoEmail;
	private String rua;
	private Integer numeroCasa;
	private String cidade;
	private String estado;
	private String cep;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		if(cidade.length()==2) {
		this.cidade = cidade.toLowerCase();
		}
		else {
			System.out.println("Digitar somente siglas dos Estados");
		}
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	
	
	
	

	
	}

