package encapsulamento.sistemacarro;
public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro fiesta = new Carro();
		//Carro gol = new Carro();
		
		System.out.println(fiesta);
		
		int i = 0;
		
		while(i < 24) {
			fiesta.acelerar();
			i++;
		}
		
		System.out.println(fiesta);
		
	}

	
}
