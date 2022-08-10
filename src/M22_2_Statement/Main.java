package M22_2_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static String DB = "testDB";//название БД вынес в константу а в URL указал %s через String.format
    private static final String URL = String.format("jdbc:postgresql://localhost/%s?user=postgres&password=12041980", DB);
    private static Connection con;

    public static void main(String[] args) throws SQLException {
        try {
            con = DriverManager.getConnection(URL);
            System.out.println("Соединение с БД установлено успешно");
        } catch (SQLException e) {
            System.out.println("При соединении к БД произошла ошибка");
            e.printStackTrace();
        }
        //создаем интерфейс Ststement для выполнения запросов к БД, которые определы как константы и не принимают переменных
        Statement statement = con.createStatement();
        String sql = "SELECT * FROM test";
    }
}
