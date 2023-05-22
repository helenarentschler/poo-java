package encapsulamento.sistemadisciplina;

public class Disciplina {

	private int codigo;
	private String nome;
	private String modalidade;
	private int cargaHoraria;
	private String conteudo;
	
	public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, String conteudo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.conteudo = conteudo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public void exibirRelatorio() {
		System.out.println("Relatorio de Disciplina");
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Modalidade: " + this.modalidade);
		System.out.println("Carga horaria: " + this.cargaHoraria + "h");
		System.out.println("Conteudo: " + this.conteudo);
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", modalidade=" + modalidade + ", cargaHoraria="
				+ cargaHoraria + ", conteudo=" + conteudo + "]";
	}
	
}
