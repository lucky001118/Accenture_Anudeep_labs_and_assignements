package JDBC.daoParttern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    String driverClassName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/student_ajp";
    String dbUser = "root";
    String dbPwd = "Lucky@server2002";

    // making the connectionFactory object for the making the connection
    private static ConnectionFactory connectionFactory = null;

    //loading the driver class with the help of the connectionFactory
    private ConnectionFactory() {
        try {
            // loading the driver class of jdbc
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // making the connection with using the function
    public Connection getConnection() throws SQLException, SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
        return conn;
    }

    public static ConnectionFactory getInstance() {
        if (connectionFactory == null) {
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }

}
