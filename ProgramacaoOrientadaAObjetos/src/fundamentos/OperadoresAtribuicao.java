package fundamentos;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		
		int y = 0;
		int x = 5;
		
		y = ++x; // incrementa x e atribui x a y
		
		System.out.println("y: " + y + " x: " + x);  //6 e 6
		
		y = 0;
		x = 5;
		
		y = x++; // atribui x a y e incrementa x
		
		System.out.println("y: " + y + " x: " + x); // 5 e 6
		
		y = 0;
		x = 5;
		
		x += 5;
		
		System.out.println("x: " + x); // 10
	}
}

