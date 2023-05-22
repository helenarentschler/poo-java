package encapsulamento.sistemafuncionario;

import java.util.Scanner;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Funcionario func1 = new Funcionario("Pedro", 5609);
		
		func1.setNascimento(input.nextInt());
		
		input.nextLine();
		
		func1.setSetor(input.nextLine());
		
		System.out.println(func1);
		
		input.close();
	}
}
