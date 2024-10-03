package Singleton;
import java.sql.Connection;

public class TesteConexaoBanco {
    public static void main(String[] args) {
       
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        Connection conexao1 = db1.getConnection();
        
       
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        Connection conexao2 = db2.getConnection();
        

        if (conexao1 == conexao2) {
            System.out.println("Ambas as conexões são a mesma instância!");
        } else {
            System.out.println("Instâncias diferentes de conexão!");
        }
    }
}
