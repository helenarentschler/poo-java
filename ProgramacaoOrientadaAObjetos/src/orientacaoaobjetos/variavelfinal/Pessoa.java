package orientacaoaobjetos.variavelfinal;

public class Pessoa {
	
	String nome;
	final String CPF; // variavel imutavel/constante: uma vez
	String email;
	String dataNasc;
	String estadoCivil;
	String telefone;
	
	public Pessoa(String nome, String CPF, String email, String dataNasc, String estadoCivil, String telefone) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.email = email;
		this.dataNasc = dataNasc;
		this.estadoCivil = estadoCivil;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", CPF=" + CPF + ", email=" + email + ", dataNasc=" + dataNasc
				+ ", estadoCivil=" + estadoCivil + ", telefone=" + telefone + "]";
	}
	
}
