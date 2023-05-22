package enumeration.sistemafuncionario;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario(1, "Joao", 1234567, DiaSemana.TERCA);
		
		System.out.println(func1);
		
		func1.alterarDiaFolga(DiaSemana.QUINTA);
		
		System.out.println(func1);
	}
}
