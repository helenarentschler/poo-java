package polimorfismo.coercao.sistemaimovel;

public class ImovelNovo extends Imovel{
	
	private double valorAdicional;

	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
		
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimirDados() {
		
		super.imprimirDados();
		System.out.println("Valor adicional: " + this.valorAdicional);
		System.out.println("Valor total: " + this.calcularValorTotal());
	}
	
	private double calcularValorTotal() {
		
		return this.valorBase + this.valorAdicional;
	}
}
