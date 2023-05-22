package heranca.sistemaveiculo;

public class VeiculoTeste {
	
	public static void main(String[] args) {
		
		Veiculo veiculo1 = new Veiculo("Cruze", "Chevrolet", 2022, 5, "Flex");
		Carro carro1 = new Carro("Gol", "Volkswagen", 2020, 5, "Flex", 5);
		Aviao aviao1 = new Aviao("A-380", "Airbus", 2010, 500, "Combustível de aviação", 45000);
		
		carro1.calibrarPneus();
		carro1.abastecer();
		
		aviao1.voar();
		aviao1.abastecer();
		
		veiculo1.abastecer();
	}
}
