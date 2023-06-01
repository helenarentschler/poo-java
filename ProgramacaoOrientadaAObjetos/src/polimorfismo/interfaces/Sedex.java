package polimorfismo.interfaces;

public class Sedex implements Frete {
	
	@Override
	public double calcularFrete(int distancia) {
		
		return distancia * 0.45 + 15;
	}
}
