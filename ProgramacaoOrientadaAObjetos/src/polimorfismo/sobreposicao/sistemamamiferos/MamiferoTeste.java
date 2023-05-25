package polimorfismo.sobreposicao.sistemamamiferos;

public class MamiferoTeste {
	
	public static void main(String[] args) {
		
		Gato gato1 = new Gato("Kim");
		Cachorro cachorro1 = new Cachorro("Pérola");
		Cavalo cavalo1 = new Cavalo("Marrom");
		gato1.emitirSom();
		cachorro1.emitirSom();
		cavalo1.emitirSom();
	}
}
