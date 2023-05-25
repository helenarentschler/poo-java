package polimorfismo.sobreposicao.sistemaquadrilateros;

import java.util.Scanner;

public class QuadrilateroTeste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Quadrilatero quadrilatero = null;
		
		int op = 0;
		
		while(op != 4) {
			
			System.out.println("Calcular: ");
			System.out.println("1 - Área do Quadrado");
			System.out.println("2 - Área do Retângulo");
			System.out.println("3 - Área do Losango");
			System.out.println("4 - Sair");
			op = input.nextInt();
			
			switch (op) {
				
				case 1:
					
					System.out.println("Informe lado: ");
					double lado = input.nextDouble();
					quadrilatero = new Quadrado(lado);
					
					break;
				
				case 2:
					
					System.out.println("Informe base: ");
					double base = input.nextDouble();
					System.out.println("Informe altura: ");
					double altura = input.nextDouble();
					quadrilatero = new Retangulo(base, altura);
					
					break;
			
				case 3:
					
					System.out.println("Informe diagonal menor: ");
					double menor = input.nextDouble();
					System.out.println("Informe diagonal maior: ");
					double maior = input.nextDouble();
					quadrilatero = new Losango(menor, maior);
					
					break;
					
				case 4:
					
					quadrilatero = null;
					System.out.println("Saindo");
					break;
					
				default:
					
					System.out.println("Opção inválida.");
					break;
			}
			
			if(quadrilatero != null) {
				
				System.out.println(quadrilatero.calcularArea());					
			}
		}
	}
}
