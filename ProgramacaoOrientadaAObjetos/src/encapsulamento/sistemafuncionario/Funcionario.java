package encapsulamento.sistemafuncionario;

public class Funcionario {
	
	private String nome;
	private int registro;
	private int nascimento;
	private char sexo;
	private String setor;
	private int telefone;
	private String endereco;
	
	public Funcionario(String nome, int registro, int nascimento, char sexo, String setor, int telefone, String endereco) {
		super();
		this.nome = nome;
		this.registro = registro;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public Funcionario(String nome, int registro) {
		this(nome, registro, 0, 'N', "", 0, "");
	}
	
	public String getNome() {
		return this.nome; 
	}
	
	public int getRegistro() {
		return this.registro; 
	}
	
	public int getNascimento() {
		return this.nascimento; 
	}
	
	public char getSexo() {
		return this.sexo; 
	}
	
	public String getSetor() {
		return this.setor; 
	}
	
	public int getTelefone() {
		return this.telefone; 
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", registro=" + registro + ", nascimento=" + nascimento + ", sexo=" + sexo
				+ ", setor=" + setor + ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}
	
}
