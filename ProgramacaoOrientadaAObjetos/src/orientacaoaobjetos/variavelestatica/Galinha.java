package orientacaoaobjetos.variavelestatica;

public class Galinha {

	String nome;
	int ovos = 0;
	static int totalOvosGranja = 0;
	
	public Galinha(String nome) {
		super();
		this.nome = nome;
	}
	
	public void botarOvos() {
		this.ovos++;
		Galinha.totalOvosGranja++;
	}

	@Override
	public String toString() {
		return "Galinha [nome=" + this.nome + ", ovos=" + this.ovos + ", totalOvosGranja=" + Galinha.totalOvosGranja +"]";
	}
	
	
}
