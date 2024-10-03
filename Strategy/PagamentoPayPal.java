package Strategy;

public class PagamentoPayPal implements PagamentoStrategy {
    private String email;

    public PagamentoPayPal(String email) {
        this.email = email;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com PayPal usando o e-mail: " + email);
    }
}


