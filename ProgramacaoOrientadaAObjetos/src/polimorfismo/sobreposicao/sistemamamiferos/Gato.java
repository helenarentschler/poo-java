package polimorfismo.sobreposicao.sistemamamiferos;

public class Gato extends Mamifero{
	
	public Gato(String nome) {
		
		super(nome);
	}
	
	public void emitirSom() {
		
		System.out.println(this.nome + " está miando");
	}
}
