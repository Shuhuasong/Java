package JDBC_tutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserEx {

    public static void main(String[] args) throws Exception{
        //query database->
        Connection connection = null;//for get statement
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            //load driver class that is implemented by database manufacture
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionURL = "jdbc:mysql://localhost:3306/jdbc";
            connection = DriverManager.getConnection(connectionURL, "root", "Song090690.");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") + ":" +
                                   resultSet.getString("name") + ":" +
                                   resultSet.getString("password") + ":" +
                                   resultSet.getString("email") + ":" +
                                   resultSet.getDate("birthday"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
    }
}
