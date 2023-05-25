package polimorfismo.sobreposicao.sistemaquadrilateros;

public class Losango extends Quadrilatero{
	
	private double diagonalMenor;
	private double diagonalMaior;
	
	public Losango(double diagonalMenor, double diagonalMaior) {
	
		super();
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	@Override
	public double calcularArea() {

		return (diagonalMaior + diagonalMenor) / 2;
	}
}
