import java.sql.*;

public class DBConnection {
    static Connection conn;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/health_db", "root", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
