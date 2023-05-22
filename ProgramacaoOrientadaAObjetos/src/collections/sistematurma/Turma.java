package collections.sistematurma;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private final int NUMALUNOS;
	private List<Aluno> alunos;

	public Turma() {
		this.NUMALUNOS = 5;
		//null pointer exception acontece se não existe essa linha
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void cadastrarAluno(String nomeAluno, int ra) {
		
		if(alunos.size() < NUMALUNOS) {
			
			Aluno aluno = new Aluno(nomeAluno, ra);
			alunos.add(aluno);
		
			System.out.println("Aluno cadastrado com sucesso!");	
		
		} else {
			
			System.out.println("Número máximo de alunos atingido!");
		
		}
	}
	
	public void exibirAlunos() {
		
		if(alunos.size() != 0) {
			//nao da nullpointer exception
			for (Aluno aluno : alunos) {
				aluno.mostrarRelatorio();
			}	
		} else {
			
			System.out.println("Sem alunos.");
		}
	}
	
	
	public Aluno buscarAluno(int ra) {
		
		for (Aluno aluno : alunos) {
			
			if(aluno.getRa() == ra) {
				
				return aluno;
			} 
		}
		
		System.out.println("Aluno não encontrado.");
		
		return null;
	}
	
	public void cadastrarNotasAluno(int ra) {
		
		Aluno aluno = buscarAluno(ra);
		
		if(aluno != null) {
			
			aluno.cadastrarNotas();
		}
	}
	
	public void calcularMediaAluno(int ra) {
		
		Aluno aluno = buscarAluno(ra);
		
		if(aluno != null) {
			
			Double media = aluno.calcularMedia();
			
			if(media >= 0) {
				System.out.println("Media do aluno: " + media);	
				
				if(media > 6) 
					System.out.println("Aprovado.");
				else 
					System.out.println("Reprovado.");	
			}
		}
	}
	
	public void calcularMediaTurma() {
		
		Double soma = 0.0;
		Double media;
		
		for (Aluno aluno : alunos) {
			
			media = aluno.calcularMedia();		
			
			if(media > 0) {
				soma += media;
			}
		}
		
		System.out.println("A média da turma é: " + soma/5);
	}
	
	public void excluirTurma() {
		
		alunos.clear();
	}
	
	public void removerAluno(int ra) {
		
		for (Aluno aluno : alunos) {
			
			if(Integer.compare(aluno.getRa(), ra)== 0) {
				alunos.remove(aluno);
				System.out.println("Aluno excluido.");
			}
		}
	}
}