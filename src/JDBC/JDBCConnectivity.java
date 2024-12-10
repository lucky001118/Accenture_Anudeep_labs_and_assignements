package JDBC;
import java.sql.*;

public class JDBCConnectivity {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/lucky";
        String user = "root";
        String password = "Lucky@server2002";

        try {
            // Load the JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");

            //creating the statement using the connection statement using the connection
            Statement stmt=connection.createStatement();

            //getting the resultSet of the query
            ResultSet rs=stmt.executeQuery("select * from stdata");

            //loopThrought the each info set one by one
            while(rs.next())
                System.out.println(rs.getLong(1)+"  "+rs.getString(2)+",  "
                        +rs.getString(3)+", "+rs.getString(4)+", "+rs.getString(5)+
                        ", "+rs.getString(6)+", "+rs.getString(7)+", "+rs.getString(8));

            // Close connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Add it to your classpath.");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Failed to establish connection.");
            e.printStackTrace();
        }
    }
}
