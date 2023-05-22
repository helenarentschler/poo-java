package associacoes.sistemapessoaendereco;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Ana", "20/09/1976", "feminino", "ana@gmail.com", "Almeida campos", 309, "Rosas", "Jaguariaiva", "BR");
		
		pessoa1.setEstadoCivil(EstadoCivil.DIVORCIADO);
		
		pessoa1.mostrarRelatorio();
	}
}
