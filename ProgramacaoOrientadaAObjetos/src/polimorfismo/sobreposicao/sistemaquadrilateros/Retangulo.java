package polimorfismo.sobreposicao.sistemaquadrilateros;

public class Retangulo extends Quadrilatero{
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		
		super();
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		
		return base*altura;
	}
}
