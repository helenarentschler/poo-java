package polimorfismo.interfaces;

public class CarrinhoCompraTeste {
	
	public static void main(String[] args) {
		
		CarrinhoCompra carrinho = new CarrinhoCompra(200.00, 40, new Correios());
		CarrinhoCompra carrinho2 = new CarrinhoCompra(200.00, 40, new Sedex());

		carrinho.realizarCompra();
		carrinho2.realizarCompra();
	}
}
