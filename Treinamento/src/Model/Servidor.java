package Model;

public class Servidor {
	
	private Integer id;
	private String nome;
	private Integer matricula;
	private String login;
	private String senha;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
	
		if(senha.length()==8) {
			this.senha = senha;
		}
			else {
				System.out.println("A senha deve conter 8 digitos ");
			}
		
		
	}
	@Override
	public String toString() {
		return "Cadastrado Servidor [id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", login=" + login + ", senha="
				+ senha + "]";
	}
	
	

}
