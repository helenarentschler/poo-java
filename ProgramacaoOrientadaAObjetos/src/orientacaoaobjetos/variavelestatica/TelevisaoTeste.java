package orientacaoaobjetos.variavelestatica;

import java.util.Scanner;

public class TelevisaoTeste {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		int numero_fab = input.nextInt();
		
		input.nextLine();
		
		String marca = input.nextLine();
		
		double polegadas = input.nextDouble();
		
		
		Televisao tv1 = new Televisao(marca, polegadas, numero_fab);
		
		System.out.println(tv1);
		
		
		input.close();
	}
	
}
