package collections.sistemabiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private List<Livro> livros;

	public Biblioteca() {
		
		this.livros = new ArrayList<Livro>();
	}
	
	public void cadastrarLivro(String titulo, String autor, int anoPublicacao, String editora, int paginas) {
		
		Livro livro = new Livro(titulo, autor, anoPublicacao, editora, paginas);
		
		livros.add(livro);
	}
	
	public Livro pesquisarLivro(String titulo) {
		
		for (Livro livro : livros) {
			
			if(livro.getTitulo().equals(titulo)) {
				
				livro.exibirRelatorio();
				return livro;
			}
		}
		
		System.out.println("Livro nao encontrado");
		return null;
	}
	
	public void devolverLivro(String titulo, int diaEmprestimo, int diaDevolucao) {
		
		Livro livro = pesquisarLivro(titulo);
		
		if(livro != null) {

			livro.setDisponivel(true);
			
			System.out.println("Livro devolvido.");
			
			int dias = diaDevolucao - diaEmprestimo;
			
			if(dias >= 7) {
				
				double multa = dias * 1.5;
				System.out.println("Multa de R$" + multa);
			}
						
		}
	}
	
	public void emprestarLivro(String titulo) {
		
		Livro livro = pesquisarLivro(titulo);
		
		if(livro != null) {
			
			if(livro.isDisponivel()) {
				
				livro.setDisponivel(false);
				System.out.println("Emprestimo realizado.");
				
			} else {
				
				System.out.println("Livro indisponivel.");
			}
		}
	}
	
}
