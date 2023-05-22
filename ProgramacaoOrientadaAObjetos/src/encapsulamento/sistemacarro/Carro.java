package encapsulamento.sistemacarro;

public class Carro {
	
	private int marcha;
	private int velocidade;
	
	public Carro() {
		
		this.marcha = 0;
		this.velocidade = 0;
	}
	
	public int getMarcha() {
		
		return this.marcha;
	}
	
	public int getVelocidade() {
		
		return this.velocidade;
	}
	
	public void acelerar() {
		
		if(this.velocidade <= 125) {
			
			this.velocidade += 5;
			
			alterarMarcha();
			
 		} else {
 			
			System.out.println("Velocidade maxima.");
 		}
	}
	
	public void frear() {
		
		if(this.velocidade >= 5) {
			
			this.velocidade -= 5;
			
			alterarMarcha();
			
		} else {
			
			System.out.println("Velocidade minima.");
		}
	}
	
	private void alterarMarcha() {
		
		if (this.velocidade == 0) {
			
			this.marcha = 0;
			
		} else if (this.velocidade >= 1 && this.velocidade <= 19) {
			
			this.marcha = 1;
			
		} else if (this.velocidade >= 20 && this.velocidade <= 39) {
			
			this.marcha = 2;
			
		} else if (this.velocidade >= 40 && this.velocidade <= 59) {
			
			this.marcha = 3;
			
		} else if (this.velocidade >= 60 && this.velocidade <= 89) {
			
			this.marcha = 4;
			
		} else {
			
			this.marcha = 5;
		}
	}

	@Override
	public String toString() {
		return "Carro [marcha=" + marcha + ", velocidade=" + velocidade + "]";
	}
	
	
}
