package Strategy;

public class PagamentoBoleto implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " gerado para pagamento via boleto bancário.");
    }
}

