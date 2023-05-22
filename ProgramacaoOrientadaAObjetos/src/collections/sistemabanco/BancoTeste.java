package collections.sistemabanco;

public class BancoTeste {
	
	public static void main(String[] args) {
		
		Banco banco1 = new Banco(309789, "BCX");
		
		banco1.abrirConta(5098, "Ana Paula");
		
		banco1.realizarSaque(5098, 20);
		
		banco1.realizarDeposito(5098, 40);
		
		banco1.exibirContas();
	}
}
