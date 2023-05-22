package heranca.sistemaescola;

public class Professor extends Pessoa{
	
	private Double salario;

	public Professor(String nome, int idade, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		
		super(nome, idade, logradouro, numero, bairro, cidade, unidadeFederativa);
		this.salario = 0.0;
	}
	
	public void calcularSalario(Double salario) {
		
		this.salario = salario;
	}
	
	public void exibirDados() {
		
		System.out.println("Professor");
		System.out.println("Salario: " + this.salario);
		exibirDadosPessoais();
	}
}
