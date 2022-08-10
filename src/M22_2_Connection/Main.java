package M22_2_Connection;

import java.sql.*;

public class Main {
    private static final String URL = "jdbc:postgresql://localhost/testDB?user=postgres&password=12041980";
    //private static Connection connection;
    private static String conOk="Соединение с БД установлено";
    private static String conErr="Произошла ошибка при присоединении к БД";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(URL)){
            //connection = DriverManager.getConnection(URL);
            //connection.close();
            System.out.println(String.format("%s", conOk));
        } catch (SQLException e){//throwables){
            //throwables.printStackTrace();
            System.out.println(String.format("%s", conErr));
            e.printStackTrace();
        }
    }
}
