package orientacaoaobjetos.variavelestatica;

public class GalinhaTeste {
	public static void main(String[] args) {
		
		Galinha galinha1 = new Galinha("Paula");
		Galinha galinha2 = new Galinha("Paula");

		galinha1.botarOvos();
		galinha1.botarOvos();
		
		galinha2.botarOvos();
		galinha2.botarOvos();
		galinha2.botarOvos();


		System.out.println(galinha1);
		System.out.println(galinha2);

	}
}
