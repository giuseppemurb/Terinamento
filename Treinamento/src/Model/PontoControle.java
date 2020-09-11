 package Model;

public class PontoControle {

	private String id;
	private String nomePonto;
	private String sigla;
	private String endereco;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomePonto() {
		return nomePonto;
	}
	public void setNomePonto(String nomePonto) {
		this.nomePonto = nomePonto.toLowerCase();
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		int numCarat = sigla.length();
		if(numCarat==3) {
			this.sigla = sigla.toLowerCase();
		}
		
		else {
			System.out.println("sigla inconrreta");
		}
		
	}
	@Override
	public String toString() {
		return "PontoControle [id=" + id + ", nomePonto=" + nomePonto + ", sigla=" + sigla + ", endereco=" + endereco
				+ "]";
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco.toLowerCase();
	}
	
	
}
