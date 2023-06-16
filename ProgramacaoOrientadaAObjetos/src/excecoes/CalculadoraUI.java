package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraUI {
	
	private CalculadoraService calculadoraService;
	
	public CalculadoraUI() {
		super();
		this.calculadoraService = new CalculadoraService();
	}
	
	public void imprimirMenu() {
	
		Scanner input = new Scanner(System.in);
		
		try {
			
			double resultado = 0;
			int op = 0;
			
			System.out.println("Informe o primeiro valor: ");
			int valor1 = input.nextInt();
			
			System.out.println("Informe o segundo valor: ");
			int valor2 = input.nextInt();
			
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Raíz Quadrada");
			op = input.nextInt();
			
			switch (op) {
			case 1:
				resultado = this.calculadoraService.somar(valor1, valor2);
				break;
			case 2:
				resultado = this.calculadoraService.subtrair(valor1, valor2);
				break;
			case 3:
				resultado = this.calculadoraService.multiplicar(valor1, valor2);
				break;
			case 4:
				resultado = this.calculadoraService.dividir(valor1, valor2);
				break;
			case 5:
				resultado = this.calculadoraService.calcularRaizQuadrada(valor1);
				break;
			default:
				System.out.println("Digite um valor válido");
				break;
			}
			
			System.out.println("Resultado: " + resultado);
		
		} catch (InputMismatchException ime) {
			
			System.out.println("Digite um número");
		
		} catch (ArithmeticException ae) {
			
			System.out.println("Denominador inválido");
			
		} catch (NumeroNaoNaturalException nnne) {
			
			System.out.println(nnne.getMessage());
			
		} catch (Exception e) {
			
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
