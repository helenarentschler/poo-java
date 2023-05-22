package associacoes.sistemadisciplina;

public class Disciplina {

	private int codigo;
	private String nome;
	private String modalidade;
	private int cargaHoraria;
	private Professor professor;
	
	public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, int registro, String nomeProf, String dataNasc, double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.professor = new Professor(registro, nomeProf, dataNasc, salario);
	}
	
	public void exibirRelatorio() {
		System.out.println("Relatorio de Disciplina");
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Modalidade: " + this.modalidade);
		System.out.println("Carga horaria: " + this.cargaHoraria + "h");
		System.out.println("Professor: " + this.professor.getNome() + " (" + this.professor.getRegistro()+ ") , data de nascimento: " 
							+ this.professor.getDataNasc() + ",  salario: " + this.professor.getSalario());
		
	}
	
}

