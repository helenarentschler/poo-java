package fundamentos;

import java.util.Scanner;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float a, b, c, res, delta;
		
		System.out.println("Informe valores de a, b e c: ");
		
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		
		
		delta = (float) (Math.pow(b, 2) - 4*a*c);
		
		res = (float) (-b + Math.sqrt(delta) / 2*a);
		
		System.out.println("Uma raiz da equaçao é: " + res);
		
		input.close();
	}
}
