package polimorfismo.sobreposicao.sistemafuncionario;

import java.util.Scanner;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Funcionario  funcionario = null;
		
		System.out.println("1 - Assalariado");
		System.out.println("2 - Comissionado");
		System.out.println("3 - Horista");
		System.out.println("Opção: ");
		int opcao = input.nextInt();
		
		switch (opcao) {
		case 1:
			funcionario = new Assalariado("Paulo Andrade", 1234501, 2000.00, 400.00);
			break;
		case 2:
			funcionario =  new Comissionado("Ana Carla", 283973, 2000.00, 1000, 0.1);
			break;
		case 3:
			funcionario = new Horista("André Macedo", 890242, 2000.00, 30.00, 160);
		break;
		default:
			break;
		}

		System.out.println(funcionario.calcularSalario());
		
		//downcasting (de pai para filho) - explícito
		if(funcionario instanceof Horista) {

			((Horista) funcionario).imprimirDadosHorista();
		}
	}
}
