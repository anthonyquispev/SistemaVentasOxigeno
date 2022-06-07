package otros;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS01:1433;databaseName=BD_ADA01";
    private static final String username = "sa";
    private static final String password = "123";

    public Connection getConnection() {
        Connection conexion = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(URL, username, password);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return conexion;
    }

}
