package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//seting up database connection 
public class Connections {
    static Connection conn = null;

    public static Connection connectToDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "root";
            String db = "db1";
            conn = DriverManager.getConnection(url + db, username, password);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
}
