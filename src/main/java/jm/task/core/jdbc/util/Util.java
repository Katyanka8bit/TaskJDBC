package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/mydatabase";
    private static final String USERNAME = "katyanka";
    private static final String PASSWORD = "katyanka";

    public static Connection getPostgresqlConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager
                    .getConnection(URL,
                            USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return connection;
    }
}