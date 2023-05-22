package sobrecargaconstrutor;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	public Data(int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int mes, int ano) {
		
		this(1, mes, ano);
	}
	
	public Data(int dia) {
		
		this(dia, 1, 2010);
	}
	
	public Data() {
		
		this(1, 1, 2010);
	}

	@Override
	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
	
	
}


