package Strategy;

public class PagamentoCartaoCredito implements PagamentoStrategy {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão de crédito: " + numeroCartao);
    }
}
