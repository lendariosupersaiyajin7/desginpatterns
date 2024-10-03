package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instanciaUnica;
    private Connection connection;
    

    private String url = "jdbc:mysql://localhost:3306/meuBanco";
    private String usuario = "root";
    private String senha = "senha";


    private DatabaseConnection() {
        try {

            connection = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão com banco de dados estabelecida.");
        } catch (SQLException e) {
            System.out.println("Falha na conexão com o banco de dados.");
            e.printStackTrace();
        }
    }


    public static DatabaseConnection getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new DatabaseConnection();  
        }
        return instanciaUnica;
    }


    public Connection getConnection() {
        return connection;
    }
}
