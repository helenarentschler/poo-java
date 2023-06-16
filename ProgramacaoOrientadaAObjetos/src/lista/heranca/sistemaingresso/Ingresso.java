package lista.heranca.sistemaingresso;

public class Ingresso {
	
	protected double valor;
	protected String tipo;
	
	public Ingresso(double valor, String tipo) {
		super();
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public void exibirIngresso() {
		
		System.out.println("Valor: " + this.valor);
		System.out.println("Tipo: " + this.tipo);
	}
}
