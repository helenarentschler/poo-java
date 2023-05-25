package polimorfismo.sobreposicao.sistemamamiferos;

import java.util.Scanner;

public class MamiferoTeste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Mamifero mamifero = null;
		
		System.out.println("1 - Gato");
		System.out.println("2 - Cachorro");
		System.out.println("3 - Cavalo");
		int op = input.nextInt();
		
		switch (op) {
			case 1:
				mamifero = new Gato("Kim");
				break;
			case 2:
				mamifero = new Cachorro("Pérola");
				break;
			case 3:
				mamifero = new Cavalo("Marrom");
				break;
			default:
				System.out.println("opção inválida");
				break;
		}
		
		if(mamifero != null) {
			
			mamifero.emitirSom();			
		}
	}
}
