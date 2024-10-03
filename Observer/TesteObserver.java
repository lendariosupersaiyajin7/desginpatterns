package Observer;

public class TesteObserver {
    public static void main(String[] args) {
        
        Produto produto = new Produto(100.00);

       
        Cliente cliente1 = new Cliente("BabyMary");
        Cliente cliente2 = new Cliente("CuteBella");

        
        produto.registrarObservador(cliente1);
        produto.registrarObservador(cliente2);

       
        System.out.println("Alterando o preço do produto para R$ 90.00...");
        produto.setPreco(90.00); 

       
        produto.removerObservador(cliente1);
        System.out.println("\nAlterando o preço do produto para R$ 80.00...");
        produto.setPreco(80.00);  
    }
}

