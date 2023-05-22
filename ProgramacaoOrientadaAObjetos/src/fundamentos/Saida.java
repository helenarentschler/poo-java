package fundamentos;

public class Saida {
	
	public static void main(String[] args) {
		
		String nome = "Pedro";
		int idade = 19;
		
		System.out.println(nome + " tem " + idade + " anos."); //pula linha
		
		System.out.print(nome + " tem " + idade + " anos."); // nao pula linha
		
		System.out.printf("%s tem %d anos.", nome, idade); // formataçao c
	}
}
