package enumeration.sistemapedido;

public class PedidoTeste {
	
	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido(1, "27/04");
		
		pedido1.imprimirEstadoPedido();
		
		pedido1.alterarStatusPedido(Status.PROCESSANDO);

		pedido1.imprimirEstadoPedido();

	}
}
