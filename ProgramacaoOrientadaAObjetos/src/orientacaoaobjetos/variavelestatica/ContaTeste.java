package orientacaoaobjetos.variavelestatica;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta("123456", "Caixa", "Andre Silva", 990);
		
		System.out.println(conta1);
		
		Conta conta2 = new Conta("876203", "Nubank", "Helena Rentschler", 772);
		
		System.out.println(conta2);
	}
}
