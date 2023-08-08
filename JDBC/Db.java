import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
// import javax.swing.JOptionPane;

public class Db {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String databaseName = "deName";
            String password = "1909";

            Connection connection = DriverManager.getConnection(url, databaseName, password);

            String sql = "CREATE DATABASE "+ databaseName;

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
