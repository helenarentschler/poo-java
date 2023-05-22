package encapsulamento.sistemarelogio;

public class RelogioTeste {
	public static void main(String[] args) {
		Relogio relogio1 = new Relogio("casio");
		
		relogio1.setHora(80);
		relogio1.setHora(13);
		System.out.println(relogio1.getHora());
		System.out.println(relogio1.getMarca());
		System.out.println(relogio1);
	}
}
