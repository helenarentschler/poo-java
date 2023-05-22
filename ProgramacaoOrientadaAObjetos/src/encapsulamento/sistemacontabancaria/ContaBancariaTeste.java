package encapsulamento.sistemacontabancaria;

public class ContaBancariaTeste {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(9087, "Helena Rentschler");
		conta1.setTitular("");
		conta1.depositar(80.0);
		conta1.exibirSaldo();
		conta1.sacar(10);
		conta1.exibirSaldo();
	}	
	
}
