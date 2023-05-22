package polimorfismo.coercao.sistemacalculadora;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.calcularMedia(3, 9));
		
		System.out.println(calculadora.calcularMedia(4, 8, 1));
		
		System.out.println(calculadora.calcularMedia(2, 0, 6, 2));
	}
}
