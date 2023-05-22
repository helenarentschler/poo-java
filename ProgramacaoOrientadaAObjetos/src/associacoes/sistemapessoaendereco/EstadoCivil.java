package associacoes.sistemapessoaendereco;

public enum EstadoCivil {
	
	SOLTEIRO("solteiro"),
	CASADO("casado"),
	DIVORCIADO("divorciado"),
	VIUVO("viuvo");
	
	private String extenso;

	private EstadoCivil(String extenso) {
		
		this.extenso = extenso;
	}
	
	public String getExtenso() {
		
		return this.extenso;
	}
}
