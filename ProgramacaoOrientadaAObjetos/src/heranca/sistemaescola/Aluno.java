package heranca.sistemaescola;

public class Aluno extends Pessoa{
	
	private String curso;

	public Aluno(String nome, int idade, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
	
		super(nome, idade, logradouro, numero, bairro, cidade, unidadeFederativa);
		this.curso = "";
	}
	
	public void realizarMatricula(String curso) {
		
		this.curso = curso;
	}
	
	public void exibirDados() {
		
		System.out.println("Aluno");
		System.out.println("Curso: " + this.curso);
		exibirDadosPessoais();
	}
	
}
