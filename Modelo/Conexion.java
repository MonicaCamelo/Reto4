package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
    Connection  connection;
    String driver = "com.mysql.cj.jdbc.Driver";
    String user = "root";
    String password = "";
    String cadenaConexion = "jdbc:mysql://localhost:3306/base_de_datos_g56";

    public Conexion() {

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion, user, password);

            if (connection != null) {
                System.out.println("Conexión exitosa con la BD!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se puede establecer conexión!");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
