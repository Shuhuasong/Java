package JDBC_tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User_PrepareStatement_EX {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "Song090690.");
            String insert = "insert into users(name,password,email,birthday) values" + "(?,?,?,?)";
            ps = conn.prepareStatement(insert);
            ps.setString(1, "Song");
            ps.setString(2, "123456");
            ps.setString(3,"infor@gmail.com");
            ps.setString(4, "1999-12-13");
            ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
