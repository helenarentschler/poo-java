package heranca.sistemaescola;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Professor professor1 = new Professor("Paulo", 30, "Rua rosas", 309, "oficinas", "PG", "BR");
		Aluno aluno1 = new Aluno("Ana", 15, "Rua campos sales", 200, "oficinas", "PG", "BR");

		professor1.calcularSalario(5000.00);
		
		professor1.exibirDadosPessoais();
		professor1.exibirDados();
		
		aluno1.realizarMatricula("BCC");
		aluno1.exibirDados();
	}
}
