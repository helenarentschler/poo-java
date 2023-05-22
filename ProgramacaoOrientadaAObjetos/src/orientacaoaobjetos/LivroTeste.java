package orientacaoaobjetos;

public class LivroTeste {
	
	public static void main(String[] args) {
		
		Livro livro1 = new Livro("Calculo 2", "James Stewart", "Atlas", 800, 2018);
		
		System.out.println(livro1);
		
		livro1.emprestar();
		
		System.out.println(livro1);
		
		livro1.emprestar();
		
		System.out.println(livro1);

		livro1.devolver();
		
		System.out.println(livro1);
		
		livro1.devolver();
		
	}
}
