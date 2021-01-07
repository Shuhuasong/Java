package Fruit_SuperMarket_Management_System.dao;

import Fruit_SuperMarket_Management_System.domain.FruitItem;
import Fruit_SuperMarket_Management_System.tools.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MySQLDAO {

    public ArrayList<FruitItem> queryAllData(){
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        ArrayList<FruitItem> list=new ArrayList<>();
        try {
            connection= JDBCUtils.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("select * from fruit");
            while (resultSet.next()){
                FruitItem item=new FruitItem();
                item.setName(resultSet.getString("fruitname"));
                item.setNumber(resultSet.getString("number"));
                item.setPrice(resultSet.getDouble("price"));
                item.setUnit(resultSet.getString("unit"));
                list.add(item);
            }
            return list;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                JDBCUtils.release(resultSet,statement,connection);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }


    public void addFruitItem(FruitItem item){
        Connection connection=null;
        Statement statement=null;
        try {
            connection=JDBCUtils.getConnection();
            statement=connection.createStatement();
            int num=statement.executeUpdate(
                    "insert into fruit(`number`,fruitname,price,unit)"+
                            "values("+item.getNumber()+","+
                            item.getName()+","+
                            item.getPrice()+","+
                            item.getUnit()+")");
            if(num>0){
                System.out.println("数据插入成功!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                JDBCUtils.release(statement,connection);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public void delFruitItem(String delNumber){
        Connection connection=null;
        Statement statement=null;
        try {
            connection=JDBCUtils.getConnection();
            statement=connection.createStatement();
            int num=statement.executeUpdate("delete from fruit where number="+delNumber);
            if(num>0){
                System.out.println("删除数据成功");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                JDBCUtils.release(statement,connection);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
