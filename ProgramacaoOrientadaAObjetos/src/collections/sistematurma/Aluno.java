package collections.sistematurma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
	
	private String nomeAluno;
	private Integer ra;
	private List<Double> notas;
	
	Scanner input = new Scanner(System.in);
	
	public Aluno(String nomeAluno, Integer ra) {
		this.nomeAluno = nomeAluno;
		this.ra = ra;
		this.notas = new ArrayList<Double>();
	}
	
	public void cadastrarNotas() {
			
		for (int i = 0; i < 4; i++) {
			
			System.out.println("Insira nota do aluno: ");
			this.notas.add(input.nextDouble());
		}
	}
	
	public double calcularMedia() {
		
		if(notas.size() != 0) {
			
			Double soma = 0.0;
			
			for (Double nota : notas) {
				
				soma += nota;
			}
			
			return soma/4;
			
		} else {
			
			System.out.println("Notas não cadastradas.");
			
			return -1.0;
		}
		
	}
	
	public void mostrarRelatorio() {
		
		System.out.println("Relatorio de " + this.nomeAluno);
		System.out.println("RA: " + this.ra);
		
		if(notas.size() != 0) {
			
			System.out.println("Notas:");
			for (Double nota : notas) {
				
				System.out.println(nota);
			}
		} else {
			System.out.println("Notas não cadastradas.");
		}
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public Integer getRa() {
		return ra;
	}

	public List<Double> getNotas() {
		return notas;
	}
	
}