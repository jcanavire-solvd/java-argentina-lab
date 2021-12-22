import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class ConnectionDB{

    static Connection conn = null;

    private ConnectionDB(){

    }
    static Connection GetConnectionDB() throws ClassNotFoundException {
        if (conn == null){
            String url = "jdbc:mysql://localhost:3306/test?user=root&password=123456";
            try {
                conn = DriverManager.getConnection(url);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else {
            return conn;
        }
        return conn;
    }


}
