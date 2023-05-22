package encapsulamento.sistemarelogio;

public class Relogio {
	
	private final String MARCA;
	private int hora;
	private int minutos;
	
	public Relogio(String marca) {
		this.MARCA = marca;
		this.hora = 0;
		this.minutos = 0;
	}
	
	public String getMarca() {
		return this.MARCA;
	}
	
	public int getHora() {
		return this.hora;
	}
	
	public int getMinutos() {
		return this.minutos;
	}
	
	public void setHora(int hora) {
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			System.out.println("Nao foi possivel atribuir hora.");
		}
	}
	
	public void setMinutos(int minutos) {
		if(minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		} else {
			System.out.println("Nao foi possivel atribuir minutos.");
		}
	}

	@Override
	public String toString() {
		return "Relogio [marca=" + MARCA + ", hora=" + hora + ", minutos=" + minutos + "]";
	}
}
