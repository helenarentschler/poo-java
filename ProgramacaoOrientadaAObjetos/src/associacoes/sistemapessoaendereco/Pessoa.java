package associacoes.sistemapessoaendereco;

public class Pessoa {
	
	private String nome;
	private String dataNasc;
	private String sexo;
	private String email;
	private Endereco endereco;
	private EstadoCivil estadoCivil;
	
	public Pessoa(String nome, String dataNasc, String sexo, String email, String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = EstadoCivil.CASADO;
		this.endereco =  new Endereco(logradouro, numero, bairro, cidade, unidadeFederativa);
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		
		this.estadoCivil = estadoCivil;
	}

	public void mostrarRelatorio() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.dataNasc);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Email: " + this.email);
		System.out.println("Endereço: Logradouro " + this.endereco.getLogradouro() + ", numero: " + this.endereco.getNumero() 
							+ ", bairro: " + this.endereco.getBairro() + ", cidade: " + this.endereco.getCidade() + ", UF: " +
							this.endereco.getUnidadeFederativa());
		System.out.println("Estado Civil: " + this.estadoCivil.getExtenso());
	}
	
}
