package Controller;

public class Idade {
	//- o primeiro m�todo da classe controller deve receber a String com o nome do usu�rio e dar bom dia// 
	public void bomDia(String nome) {
		System.out.println("Bom Dia" + nome);
	}
	
	public void idadePessoa(Integer AnoAtual , Integer AnoNascimento) {
		Integer idade = AnoAtual - AnoNascimento;
		System.out.println("Sua idade �: " + idade + " "+ "anos");
		
	}

}
