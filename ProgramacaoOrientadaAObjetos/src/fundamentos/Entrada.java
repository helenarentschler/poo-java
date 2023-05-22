package fundamentos;

import java.util.Scanner;

public class Entrada {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Insira um inteiro: ");
		
		int n = input.nextInt();
		
		System.out.println("Insira uma frase: ");
		
		input.nextLine(); //quando tenho um inteiro antes preciso limpar o buffer
		
		String frase = input.nextLine(); 
		
		System.out.println("Inteiro: " + n + " Frase: " + frase);
		
		input.close();
	}	

}
