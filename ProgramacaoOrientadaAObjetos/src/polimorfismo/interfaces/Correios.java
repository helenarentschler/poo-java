package polimorfismo.interfaces;

public class Correios implements Frete{
	
	@Override
	public double calcularFrete(int distancia) {
		
		return distancia * 0.35 + 13;
	}
}
