package JDBC_tutorial;

import java.sql.*;

public class User_ResultSet_Ex {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement statement = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "Song090690.");
            String sql = "select * from users";
            statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = statement.executeQuery(sql);
            System.out.println("The Second row data is: ");
            rs.absolute(2);
            System.out.println(rs.getString("name"));

            System.out.println("The first row data is: ");
            rs.beforeFirst();
            rs.next();
            System.out.println(rs.getString("name"));

            System.out.println("The fourth row data is: ");
            rs.afterLast();
            rs.previous();
            System.out.println(rs.getString("name"));
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(statement != null){
                statement.close();
            }
            if(conn != null){
                conn.close();
            }
        }

    }
}
