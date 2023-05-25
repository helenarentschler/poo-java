package polimorfismo.sobreposicao.sistemamamiferos;

public class Cavalo extends Mamifero {

	public Cavalo(String nome) {
		
		super(nome);
	}
	
	public void emitirSom() {
		
		System.out.println(this.nome + " está relinchando");
	}
}
