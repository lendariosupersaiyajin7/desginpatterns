package Observer;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Subject {
    private List<Observer> observadores;  
    private double preco;

    public Produto(double precoInicial) {
        this.preco = precoInicial;
        this.observadores = new ArrayList<>();
    }

    @Override
    public void registrarObservador(Observer o) {
        observadores.add(o);
    }
   
    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer o : observadores) {
            o.atualizar(preco);
        }
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        notificarObservadores();  
    }
}
