package M22_2_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    private static String DB = "testDB";//название БД вынес в константу а в URL указал %s через String.format
    private static final String URL = String.format("jdbc:postgresql://localhost/%s?user=postgres&password=12041980", DB);

    public static void main(String[] args) {
        String username = "null";
        String password = "null";
        try (Connection connection = DriverManager.getConnection(URL, username, password)) {
            String SQL = "SELECT * FROM test;";
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)){}
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
