package encapsulamento.sistemacontabancaria;

// default (sem declaraçao) : visivel para todo o pacote
// + public : visivel para todo o projeto
// # protected : visivel no pacote e em subclasses fora do pacote
// - private : visivel somente na classe

public class ContaBancaria {
	
	private int numero;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numero, String titular) {
		
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;
	}
	
	public int getNumero() {
		
		return this.numero;
	}
	
	public String getTitular() {
		
		return this.titular;
	}
	
	public void setTitular(String titular) {
		
		if(!titular.equals("")) {
			
			this.titular = titular;			
		}
	}
	
	public void sacar(double valor) {
		
		if(this.saldo >= valor) {
			
			this.saldo -= valor;
			
			System.out.println("Saque realizado com sucesso.");
			
		} else {
			
			System.out.println("Saldo insuficiente. Saque uma quantia menor.");
			
		}
	}
	
	private void calcularRendimento() {
		
		this.saldo *= 1.10;
		
		System.out.println("Calculando rendimento...");
	}
	
	public void depositar(double valor) {
		
		this.saldo += valor;
		
		System.out.println("Deposito realizado com sucesso.");
		
		calcularRendimento();
	}
	
	public void exibirSaldo() {
		
		System.out.println("\nNumero: " + this.numero + 
							"\nTitular: " + this.titular + 
							"\nSaldo: R$" + String.format("%.2f", this.saldo));
	}

	@Override
	public String toString() {
		
		return "CaixaEletronico [numero=" + this.numero + ", titular=" + this.titular + ", saldo=" + this.saldo + "]";
	}
}
