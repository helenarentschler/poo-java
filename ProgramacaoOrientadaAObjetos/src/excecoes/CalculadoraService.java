package excecoes;

import java.io.IOException;

public class CalculadoraService {
	
	public int somar(int n1, int n2) {
		
		return n1 +n2;
	}
	
	public int subtrair(int n1, int n2) {
		
		return n1 - n2;
	}
	
	public int multiplicar(int n1, int n2) {
		
		return n1*n2;
	} 
	
	//monitora o método
	public int dividir(int n1, int n2) throws ArithmeticException, Exception {
		
		return n1/n2;
	}
	
	public int calcularRaizQuadrada(int numero) throws NumeroNaoNaturalException {
		
		int resultado = 0;
			
		if (numero < 0) {
			
			throw new NumeroNaoNaturalException();
		}	
		
		resultado =  (int) Math.sqrt(numero);

		return (int) resultado;
		
	}
}
