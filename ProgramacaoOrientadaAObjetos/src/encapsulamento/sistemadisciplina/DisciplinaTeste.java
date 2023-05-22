package encapsulamento.sistemadisciplina;

public class DisciplinaTeste {
	
	public static void main(String[] args) {
		
		Disciplina disc1 = new Disciplina(56, "Matematica Discreta", "presencial", 60, "lorem ipsum");
		
		disc1.setConteudo("sera trabalhado...");
		
		disc1.setModalidade("distancia");
		
		disc1.exibirRelatorio();
	}
}
