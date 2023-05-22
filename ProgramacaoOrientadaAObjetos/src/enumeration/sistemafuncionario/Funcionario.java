package enumeration.sistemafuncionario;

public class Funcionario {
	
	private int registro;
	private String nome;
	private int cpf;
	private DiaSemana folga;

	public Funcionario(int registro, String nome, int cpf, DiaSemana folga) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.cpf = cpf;
		this.folga = folga;
	}
	
	public void alterarDiaFolga(DiaSemana novoDiaFolga) {
		this.folga = novoDiaFolga;
	}

	@Override
	public String toString() {
		return "Funcionario [registro=" + registro + ", nome=" + nome + ", cpf=" + cpf + ", folga=" + this.folga.getDiaExtenso() + "]";
	}
	
}
