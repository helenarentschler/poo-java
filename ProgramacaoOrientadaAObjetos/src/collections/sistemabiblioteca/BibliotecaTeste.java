package collections.sistemabiblioteca;

public class BibliotecaTeste {

	public static void main(String[] args) {
		
		Biblioteca biblio = new Biblioteca();
		
		biblio.cadastrarLivro("flores outono", "Ana Silva", 2019, "Atica", 200);
		
		biblio.pesquisarLivro("flores outono");
		
		biblio.emprestarLivro("flores outono");
		
		biblio.pesquisarLivro("flores outono");

	}
}
