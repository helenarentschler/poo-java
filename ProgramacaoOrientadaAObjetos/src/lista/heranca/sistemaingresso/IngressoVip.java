package lista.heranca.sistemaingresso;

public class IngressoVip extends Ingresso {
	
	private double adicional;
	private String localizacao;
	
	public IngressoVip(double valor, String tipo, double adicional, String localizacao) {
		super(valor, tipo);
		this.adicional = adicional;
		this.localizacao = localizacao;
	}
	
	private double calcularValorIngressoVip() {
		
		return this.valor + this.adicional;
	}
	
	@Override
	public void exibirIngresso() {
		
		super.exibirIngresso();
		System.out.println("Valor imgresso Vip: " + this.calcularValorIngressoVip());
		System.out.println("Localizaçao: " + this.localizacao);
	}
}
