package polimorfismo.coercao.sistemacalculadora;

public class Calculadora {
	
	public double calcularMedia(double n1, double n2) {
		return (n1 + n2) / 2;
	}
	
	public double calcularMedia(double n1, double n2, double n3) {
		return (n1 + n2 + n3) / 3;
	}
	
	public double calcularMedia(double n1, double n2, double n3, double n4) {
		return (n1 + n2 + n3 + n4) / 4;
	}
}
