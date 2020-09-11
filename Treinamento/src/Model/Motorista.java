package Model;

public class Motorista {
	/* criar classe motorista com atributos id, nome e matricula */

	private Integer id;
	private String nome;
	private Integer matricula;

	public void setId(Integer identificao) {
		this.id = identificao;

	}
	
	public Integer getId(){
		return id;
	}
	
	public void setNome(String nomeMotorista){
		this.nome = nomeMotorista;
	}
	
	public String getNome(){
		return nome;
		
	}
	
	public void setMatricula(Integer matriculaMotorista){
		this.matricula = matriculaMotorista;
	}
	
	public Integer getMatricula(){
		return matricula;
	}

	@Override
	public String toString() {
		return "Motorista [id=" + id + ", nome=" + nome + ", matricula=" + matricula + "]";
	}
		

}
