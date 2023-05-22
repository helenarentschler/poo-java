package associacoes.sistemaconta;

public class Titular {
	
	private String nome;
	private int rg;
	private int cpf;
	private String dataNasc;
	private String sexo;
	private double renda;
	private Endereco endereco;
	
	public Titular(String nome, int rg, int cpf, String dataNasc, String sexo, double renda, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.renda = renda;
		this.endereco = new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
	}

	public String getNome() {
		return nome;
	}

	public int getRg() {
		return rg;
	}

	public int getCpf() {
		return cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public String getSexo() {
		return sexo;
	}

	public double getRenda() {
		return renda;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	
}
