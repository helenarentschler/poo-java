package polimorfismo.sobreposicao.sistemafuncionario;

//nao pode ser instanciado
public abstract class Funcionario {
	
	protected String nome;
	protected int cpf;
	protected double salarioBase;
	
	public Funcionario(String nome, int cpf, double salarioBase) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}
	
	//metodo sem implementação em uma classe abstrata
	//obrigatório implementar nas classe filhas
	public abstract double calcularSalario();
	
	public void imprimirDados() {
		
		System.out.println("CPF: " + this.cpf);
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário base: R$" + this.salarioBase);
	}
}
