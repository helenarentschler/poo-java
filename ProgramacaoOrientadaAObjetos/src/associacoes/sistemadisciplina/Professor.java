package associacoes.sistemadisciplina;

public class Professor {
	
	private int registro;
	private String nome;
	private String dataNasc;
	private double salario;
	
	public Professor(int registro, String nome, String dataNasc, double salario) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.salario = salario;
	}

	public int getRegistro() {
		return registro;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public double getSalario() {
		return salario;
	}
	
	
}
