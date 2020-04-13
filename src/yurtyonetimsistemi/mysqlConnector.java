package yurtyonetimsistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class mysqlConnector {

    private static Connection con;

    public mysqlConnector() {

    }

    public Connection connectorSender() {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "password");
            System.out.println("Selam");
        } catch (SQLException e) {
            System.out.println("eksepsiyon");
            System.out.println(e);
        }
        return con;
    }

}
