package encapsulamento.sistemacalculadora;

import java.util.Scanner;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		
		Calculadora calc1 = new Calculadora("Casio", "300", "Cientifica", 20);
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(calc1.somar(a, b));
		System.out.println(calc1.subtrair(a, b));
		System.out.println(calc1.multiplicar(a, b));
		System.out.println(calc1.dividir(a, b));
		
		System.out.println(calc1.getMarca());
		System.out.println(calc1.getModelo());
		System.out.println(calc1.getTipo());
		System.out.println(calc1.getMemoria());


		System.out.println(calc1);
		
		input.close();
	}
}
