package project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {

    private final static String URL = "jdbc:mysql://localhost:3306/btdatabase";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public DBWorker(){
        System.out.println("Connecting to Database");
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()){
                System.out.println("Database connected");
            }
        } catch (SQLException e) {
            System.out.println("Couldn't connect to Database");
        }

    }
}
