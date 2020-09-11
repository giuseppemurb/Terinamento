package Model;

public class Endereco {

	private String rua;
	private String bairro;
	private Integer numero;
	private String cep;
	private String municipio;
	private String estado;
	private String proprietario;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua.toLowerCase();
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro.toLowerCase();
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio.toLowerCase();
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		int qtdCaract = estado.length();
		if (qtdCaract == 2) {
			this.estado = estado.toUpperCase();

		} else {
			System.out.println("#erro# digitar siglas");
		}
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario.toLowerCase();
	}

	@Override
	public String toString() {
		return "* ==> rua=" + rua  + ", bairro=" + bairro + ", numero=" + numero + ", cep=" + cep + ", municipio="
				+ municipio + ", estado=" + estado + ", proprietario=" + proprietario + "\n";
	}

}
