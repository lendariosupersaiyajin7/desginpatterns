package Observer;

public class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(double preco) {
        System.out.println("Cliente " + nome + " foi notificado: novo preço do produto é R$ " + preco);
    }
}
