package polimorfismo.coercao;

public class Coercao {
	
	public static void main(String[] args) {
		
		int x = 10;
		double y = x;
		char z = 'A';
		int i = z;
		
		y = 900.08;
		int j = (int) y;
		
		System.out.println(y);	
		System.out.println(i);
		System.out.println(j);
	}
}
