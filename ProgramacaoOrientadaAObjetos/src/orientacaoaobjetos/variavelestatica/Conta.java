package orientacaoaobjetos.variavelestatica;

public class Conta {

	String numero;
	String agencia;
	String nome;
	double saldo;
	static int totalContas;
	

	public Conta(String numero, String agencia, String nome, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
		Conta.totalContas++;
	}


	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", nome=" + nome + ", saldo=" + saldo + " totalContas=" + totalContas +"]";
	}
	
}
