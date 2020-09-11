package Model;

public class Agenda {
	
	private String nome;
	private Integer numTelefone;
	
	
	

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
	
	
	@Override
	public String toString() {
		return "nome=" + nome + ", numTelefone=" + numTelefone + "\n";
	}

}
