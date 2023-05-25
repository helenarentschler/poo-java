package polimorfismo.sobreposicao.sistemaquadrilateros;

public class Quadrado extends Quadrilatero{
	
	private double lado;

	public Quadrado(double lado) {
	
		super();
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
				
		return lado*lado;
	}
}
