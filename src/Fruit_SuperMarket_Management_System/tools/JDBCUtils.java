package Fruit_SuperMarket_Management_System.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtils {

    public static Connection getConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root", "Song090690.");

        return connection;
    }


    public static void release(Statement statement, Connection connection) throws Exception{
        if(statement!=null){
            statement.close();
        }
        if(connection!=null){
            connection.close();
        }
    }

    public static void release(ResultSet resultSet, Statement statement, Connection connection) throws Exception{
        if(resultSet!=null){
            resultSet.close();
        }
        release(statement,connection);
    }


}
