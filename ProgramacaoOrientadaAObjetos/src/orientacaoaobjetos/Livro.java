package orientacaoaobjetos;

public class Livro {
	
	String titulo;
	String autor;
	String editora;
	int nPaginas;
	int ano;
	boolean disponivel;
	
	public Livro(String titulo, String autor, String editora, int nPaginas, int ano) {
		
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.nPaginas = nPaginas;
		this.ano = ano;
		this.disponivel = true;
		
	}
	
	
	public void emprestar () {
		
		if(disponivel) {
			
			disponivel = false;
			System.out.println(this.titulo + " emprestado.");
			
		} else {
			
			System.out.println(this.titulo + " indisponivel para empréstimo.");
			
		}
	}
	
	
	public void devolver() {
		
		if(!disponivel) {
			
			disponivel = true;
			System.out.println(this.titulo + " devolvido.");
			
		} else {
			
			System.out.println(this.titulo + " ja foi devolvido.");
			
		}
	}


	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", nPaginas=" + nPaginas
				+ ", ano=" + ano + ", disponivel=" + disponivel + "]";
	}
}
