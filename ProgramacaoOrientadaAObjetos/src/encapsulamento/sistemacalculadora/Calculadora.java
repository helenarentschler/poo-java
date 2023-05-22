package encapsulamento.sistemacalculadora;

public class Calculadora {
	
	private String marca;
	private String modelo;
	private String tipo;
	private int memoria;
	
	public Calculadora(String marca, String modelo, String tipo, int memoria) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoria = memoria;
	}
	
	public double somar(double a, double b) {
		
		return a + b;
	}
	
	public double subtrair(double a, double b) {
		
		return a - b;
	}
	
	public double multiplicar(double a, double b) {
		
		return a * b;
	}
	
	public double dividir(double a, double b) {
		
		return a / b;
	}
	
	public String getMarca() {
		
		return this.marca;
	}
	
	public String getModelo() {
		
		return this.modelo;
	}
	
	public String getTipo() {
		
		return this.tipo;
	}
	
	public int getMemoria() {
		
		return this.memoria;
	}
	
	@Override
	public String toString() {
		return "Calculadora [marca=" + this.marca + ", modelo=" + this.modelo + ", tipo=" + this.tipo + ", memoria=" + this.memoria + "]";
	}
}
