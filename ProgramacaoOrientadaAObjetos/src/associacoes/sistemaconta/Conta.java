package associacoes.sistemaconta;

public class Conta {
	
	private int numero;
	private double saldo;
	private Titular titular;
	
	public Conta(int numero, String nome, int rg, int cpf, String dataNasc, String sexo, double renda, String logradouro, int numerolog, String bairro, String cidade, String unidadeFederativa) {
		super();
		this.numero = numero;
		this.saldo = 0;
		this.titular = new Titular(nome, rg, cpf, dataNasc, sexo, renda, logradouro, numerolog, bairro, cidade, unidadeFederativa);
	}
	
	public void sacar(double valor) {
		
		if(valor <= this.saldo) {
			
			this.saldo -= valor;
			
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
	}
	
	public void exibirRelatorio() {
		
		System.out.println("numero da conta: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Titular: " + this.titular.getNome());
		System.out.println("  RG: " + this.titular.getRg());
		System.out.println("  CPF: " + this.titular.getCpf());
		System.out.println("  Data de nascimento: " + this.titular.getDataNasc());
		System.out.println("  Sexo: " + this.titular.getSexo());
		System.out.println("  Renda: " + this.titular.getRenda());
		System.out.println("Endereço: Logradouro " + this.titular.getEndereco().getLogradouro() + ", numero: " + this.titular.getEndereco().getNumero() 
		+ ", bairro: " + this.titular.getEndereco().getBairro() + ", cidade: " + this.titular.getEndereco().getCidade() + ", UF: " +
		this.titular.getEndereco().getUnidadeFederativa());
	}
	
}
