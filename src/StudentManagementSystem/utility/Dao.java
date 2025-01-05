package StudentManagementSystem.utility;

import JDBC.daoParttern.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

    String driverClassName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/anudeep_student_management_system";
    String dbUser = "root";
    String dbPwd = "Lucky@server2002";

    // making the connectionFactory object for the making the connection
    private static Dao dao = null;

    //loading the driver class with the help of the connectionFactory
    private Dao() {
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

    public static Dao getInstance() {
        if (dao == null) {
            dao = new Dao();
        }
        return dao;
    }
}
