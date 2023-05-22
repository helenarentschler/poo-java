package polimorfismo.coercao.sistemaimovel;

public class Imovel {
	
	protected String endereco;
	protected double valorBase;
	
	public Imovel(String endereco, double valorBase) {
		super();
		this.endereco = endereco;
		this.valorBase = valorBase;
	}
	
	public void imprimirDados() {
		
	}
	
	private double calcularValorTotal() {
		
		return 0.0;
	}
}
