package collections.sistematurma;

public class TurmaTeste {
	
	public static void main(String[] args) {
		
		Turma t1 = new Turma();
		
		t1.buscarAluno(3);
		
		t1.cadastrarAluno("Ana", 4);
		
		t1.buscarAluno(4);
		
		t1.exibirAlunos();
		
		t1.calcularMediaAluno(4);
		
		t1.cadastrarNotasAluno(4);
		
		t1.calcularMediaAluno(4);
		
		t1.calcularMediaTurma();
	
		t1.excluirTurma();
		
		t1.exibirAlunos();
	}
	
}