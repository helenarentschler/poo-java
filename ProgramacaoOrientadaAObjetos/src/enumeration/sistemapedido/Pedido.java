package enumeration.sistemapedido;

public class Pedido {
	
	private int id;
	private String data;
	private Status statusPedido;

	public Pedido(int id, String data) {
		
		super();
		this.id = id;
		this.data = data;
		this.statusPedido = Status.AGUARDANDO_PAGAMENTO;
	}
	
	public void imprimirEstadoPedido() {
		
		System.out.println("Codigo: " + this.id);
		System.out.println("Data: " + this.data);
		System.out.println("Status: " + this.statusPedido);
	}
	
	public void alterarStatusPedido(Status novoEstadoPedido) {
		
		this.statusPedido = novoEstadoPedido;
		System.out.println("Status alterado para " + novoEstadoPedido);
	}
	
}
