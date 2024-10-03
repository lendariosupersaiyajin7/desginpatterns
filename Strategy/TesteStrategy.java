package Strategy;

public class TesteStrategy {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
 
        carrinho.setEstrategiaPagamento(new PagamentoCartaoCredito("1234-5678-9101-1121"));
        carrinho.pagarCompra(250.00);

        carrinho.setEstrategiaPagamento(new PagamentoPayPal("cliente@exemplo.com"));
        carrinho.pagarCompra(400.00);

        carrinho.setEstrategiaPagamento(new PagamentoBoleto());
        carrinho.pagarCompra(300.00);
    }
}

