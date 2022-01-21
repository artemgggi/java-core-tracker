//package ru.job4j.jdbc;
//
//import java.sql.Connection;
//import java.sql.DatabaseMetaData;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class ConnectionDemo {
//    public static void main(String[] args) throws ClassNotFoundException {
//        Config cfg = new Config();
//        String login = cfg.getProperty("login");
//        String password = cfg.getProperty("password");
//        Class.forName("org.postgresql.Driver");
//        String url = "jdbc:postgresql://localhost:5432/idea_db";
////        String login = "postgres";
////        String password = "password";
//        try (Connection connection = DriverManager.getConnection(url, login, password)) {
//            DatabaseMetaData metaData = connection.getMetaData();
//            System.out.println(metaData.getUserName());
//            System.out.println(metaData.getURL());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
