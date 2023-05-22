package collections.sistemabanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private int cnpj;
	private String nomeBanco;
	private List<Conta> contas;
	
	public Banco(int cnpj, String nomeBanco) {

		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList<Conta>();
	}
	
	
	public void abrirConta(int numero, String titular) {
		
		Conta conta = new Conta(numero, titular);
		
		contas.add(conta);
	}
	
	public void exibirContas() {
		
		for (Conta conta : contas) {
			
			conta.exibirRelatorio();
		}
	}
	
	public void removerConta(int numero) {
		
		for (Conta conta : contas) {
			
			if(conta.getNumero() == numero) {
				
				contas.remove(conta);
				break;
			}
		}
	}
	
	public void exibirSaldo(int numero) {
		
		for (Conta conta : contas) {
			
			if(conta.getNumero() == numero) {
				
				conta.exibirRelatorio();
				return;
			}
		}
		
		System.out.println("Conta nao encontrada");
	}
	
	
	public void realizarSaque(int numero, double valor) {
		
		for (Conta conta : contas) {
			
			if(conta.getNumero() == numero) {
				
				conta.sacar(valor);
				break;
			}
		}
	}
	
	public void realizarDeposito(int numero, double valor) {
		
		for (Conta conta : contas) {
			
			if(conta.getNumero() == numero) {
				
				conta.depositar(valor);
				break;
			}
		}
	}
}