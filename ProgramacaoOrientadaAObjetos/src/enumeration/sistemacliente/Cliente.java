package enumeration.sistemacliente;

public class Cliente {
	
	private int codigo;
	private String nome;
	private String dataNascimento;
	private EstadoCivil estadoCivil;
	
	public Cliente(int codigo, String nome, String dataNascimento, EstadoCivil estadoCivil) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
	}
	
	public void alterarEstadoCivil(EstadoCivil novoEstadoCivil) {
		
		this.estadoCivil = novoEstadoCivil;
	}

	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", estadoCivil="
				+ estadoCivil + "]";
	}
}
