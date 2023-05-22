package collections.sistemabiblioteca;

public class Livro {
	// título, autor, ano de publicação, editora, número total de páginas e disponibilidade. 
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String editora;
	private int paginas;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, int anoPublicacao, String editora, int paginas) {

		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.paginas = paginas;
		this.disponivel = true;
	}
	
	public void exibirRelatorio() {
		System.out.println("=============================================");
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Ano de publicaçao: " + this.anoPublicacao);
		System.out.println("Editora: " + this.editora);
		System.out.println("Numero de paginas: " + this.paginas);

		if(this.disponivel) {
			System.out.println("Disponivel para empréstimo");			
		} else {
			System.out.println("Indisponivel");
		}
		
		System.out.println("=============================================");

	}
	
	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public int getPaginas() {
		return paginas;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
