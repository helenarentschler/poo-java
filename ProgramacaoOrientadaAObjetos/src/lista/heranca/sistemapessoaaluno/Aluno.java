package lista.heranca.sistemapessoaaluno;

public class Aluno extends Pessoa {
	
	private int matricula;

	public Aluno(String nome, String nascimento, long rg, long cpf, int matricula) {
		
		super(nome, nascimento, rg, cpf);
		this.matricula = matricula;
	}
	
	public void exibirInformacoes() {
		
		super.exibirInformacoes();
		System.out.println("Matricula: " + this.matricula);
	}
}
