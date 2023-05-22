package associacoes.sistemadisciplina;

public class DisciplinaTeste {

	public static void main(String[] args) {
		
		Disciplina matematica = new Disciplina(90, "Matematica", "distancia", 60, 706550, "Marcio Pontes", "30/08/1980", 7000);
		
		matematica.exibirRelatorio();
	}
}
