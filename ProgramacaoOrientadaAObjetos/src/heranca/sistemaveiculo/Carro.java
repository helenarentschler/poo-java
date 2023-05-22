package heranca.sistemaveiculo;

public class Carro extends Veiculo {

	private int numeroPortas;

	public Carro(String modelo, String fabricante, int ano, int numeroPassageiros, String combustivel, int numeroPortas) {
		
		//1° linha - invoca construtor da superClasse
		super(modelo, fabricante, ano, numeroPassageiros, combustivel);
		this.numeroPortas = numeroPortas;
	}
	
	public void calibrarPneus() {
		
		System.out.println(this.fabricante + " " + this.modelo + " está calibrando pneus.");
	}
}
