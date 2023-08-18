package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection cn;

    public Connection conectar (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ventasql", "root", "");
            System.out.print("Conectado");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print("Error de conexion" +e);
        }
        return cn;
    }

}
