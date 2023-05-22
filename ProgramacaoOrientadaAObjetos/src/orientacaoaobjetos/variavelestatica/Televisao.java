package orientacaoaobjetos.variavelestatica;

public class Televisao {
	

	String marca;
	double polegadas;
	final int N_FRABRICACAO;
	int canal;
	int volume;
	boolean ligada;
	static int numeroTvs;
	
	public Televisao(String marca, double polegadas, int N_FRABRICACAO) {
		
		this.marca = marca;
		this.polegadas = polegadas;
		this.N_FRABRICACAO = N_FRABRICACAO;
		this.canal = 0;
		this.volume = 0;
		this.ligada = false;
		Televisao.numeroTvs++;
	}


	public void ligar() {
		if (!this.ligada)
			this.ligada = true;
		else
			System.out.println("Ja esta ligada.");
	}
	
	public void desligar() {
		if (this.ligada)
			this.ligada = false;
		else
			System.out.println("Ja esta desligada.");
	}
	
	public void aumentarVolume() {
		if(this.ligada)
			this.volume++;
		else
			System.out.println("Ligue a TV.");
	}
	
	public void diminuirVolume() {
		if(this.ligada && this.volume > 0)
			this.volume--;
		else 
			System.out.println("Nao foi possivel diminuir volume.");
	}
	
	public void aumentarCanal() {
		if(this.ligada)
			this.canal++;
	}
	
	public void diminuirCanal() {
		if(this.ligada && this.canal > 0)
			this.canal--;
		else 
			System.out.println("Nao foi possivel diminuir canal.");
	}

	@Override
	public String toString() {
		return "Televisao [marca=" + marca + ", polegadas=" + polegadas + ", N_FRABRICACAO=" + N_FRABRICACAO
				+ ", canal=" + canal + ", volume=" + volume + ", ligada=" + ligada + ", numeroTvs=" + numeroTvs + "]";
	}
	
}
