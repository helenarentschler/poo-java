package polimorfismo.coercao.sistemaimovel;

public class ImovelUsado extends Imovel{
	
	private double valorDesconto;
	
	public ImovelUsado(String endereco, double valorBase, double valorDesconto) {
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}
	
	public void imprimirDados() {
		
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Valor base: " + this.endereco);
		System.out.println("Valor adicional: " + this.valorDesconto);
		System.out.println("Valor total: " + this.calcularValorTotal());
	}
	
	private double calcularValorTotal() {
		
		return this.valorBase - this.valorDesconto;
	}

}
