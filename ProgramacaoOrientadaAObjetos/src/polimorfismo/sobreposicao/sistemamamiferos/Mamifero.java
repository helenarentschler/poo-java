package polimorfismo.sobreposicao.sistemamamiferos;

public class Mamifero {
	
	protected String nome;
	
	public Mamifero(String nome) {

		this.nome = nome;
	}	
	
	public void emitirSom() {
		
		System.out.println("Som genérico");
	}

}
