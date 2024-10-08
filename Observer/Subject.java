package Observer;

public interface Subject {
    void registrarObservador(Observer o);
    void removerObservador(Observer o);
    void notificarObservadores();
}
