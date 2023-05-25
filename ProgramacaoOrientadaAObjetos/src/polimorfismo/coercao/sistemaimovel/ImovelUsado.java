package polimorfismo.coercao.sistemaimovel;

public class ImovelUsado extends Imovel{
	
	private double valorDesconto;
	
	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		System.out.println("Valor desconto: " + this.valorDesconto);
		System.out.println("Valor total: " + this.calcularValorTotal());
	}
	
	private double calcularValorTotal() {
		
		return this.valorBase - this.valorDesconto;
	}

}
