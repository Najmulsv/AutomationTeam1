package BestBuyTest;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MSearch {


    public static void main(String[] args) throws SQLException{



         //Class.forName("com.mysql.jdbc.Driver");


        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306:selenium/?user=root@localhost&password=root@localhost");

        PreparedStatement statement = conn.prepareStatement("select * from name");

ResultSet result= statement.executeQuery();

        while (result.next()) {
            System.out.println(result.getString(1) + " " + result.getString(2));
        }
    }
}