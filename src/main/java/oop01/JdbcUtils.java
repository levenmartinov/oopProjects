package oop01;

import java.sql.*;

public class JdbcUtils {

    public static Connection connection;
    public static Statement statement;
    public static PreparedStatement prst;


    public static void setConnection() {

        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/myDatabase", "tester", "tester");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void setStatement() {

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void setPrst(String sql) {

        try {
            prst = connection.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }


}