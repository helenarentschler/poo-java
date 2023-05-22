package polimorfismo.coercao.sistemaimovel;

public class ImovelNovo extends Imovel{
	
	private double valorAdicional;

	public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
		
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimirDados() {
		
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Valor base: " + this.valorBase);
		System.out.println("Valor adicional: " + this.valorAdicional);
		System.out.println("Valor total: " + this.calcularValorTotal());
	}
	
	private double calcularValorTotal() {
		
		return this.valorBase + this.valorAdicional;
	}
}
