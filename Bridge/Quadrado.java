package Bridge;

public class Quadrado extends Forma {
    public Quadrado(Cor cor) {
        super(cor);
    }

    @Override
    public void desenhar() {
        System.out.print("Desenhando um quadrado. ");
        cor.aplicarCor(); 
    }
}