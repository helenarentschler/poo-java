package lista.heranca.sistemaingresso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IngressoTeste {
	
	public static void main(String[] args) {
		
		Ingresso ingresso = null;
		
		Scanner input = new Scanner(System.in);
		
		int op = 0;
		
		System.out.println("1 - Ingresso Normal");
		System.out.println("2 - Ingresso Vip - Camarote Superior");
		System.out.println("3 - Ingresso Vip - Camore Inferior");
		
		op = input.nextInt();
		
		try {
				switch (op) {
				case 1:
					ingresso = new IngressoNormal(200.00, "normal");
					break;
				case 2:
					ingresso = new CamaroteSuperior(200.00, "vip", 100, "superior");
					break;
				case 3:
					ingresso = new CamaroteInferior(200.00, "vip", 100, "inferior");
					break;
				default:
					break;
			}
			
			ingresso.exibirIngresso();	
		
		} catch(InputMismatchException ime) {
			
			System.out.println("Digite um numero");
			
		} catch(NullPointerException npe) {
			
			System.out.println("Digite um numero valido");
		}
	}
}
