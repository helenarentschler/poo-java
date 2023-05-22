package collections.sistemabanco;

public class Conta {
	
	private int numero;
	private double saldo;
	private String titular;
	
	public Conta(int numero, String titular) {

		this.numero = numero;
		this.saldo = 0;
		this.titular = titular;
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
		System.out.println("=================================");
		System.out.println("numero da conta: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Titular: " + this.titular);
		System.out.println("=================================");
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
	
}
