package Fruit_SuperMarket_Management_System.service;

import Fruit_SuperMarket_Management_System.dao.MySQLDAO;
import Fruit_SuperMarket_Management_System.domain.FruitItem;

import java.util.ArrayList;

public class AdminService {

    private MySQLDAO adminDao = new MySQLDAO();

    public ArrayList<FruitItem> queryFruitItem(){
        ArrayList<FruitItem> data = adminDao.queryAllData();
        return data;
    }

    public boolean addFruitItem(String number,String name,String price,String unit){
        ArrayList<FruitItem> data=queryFruitItem();
        for(int i=0;i<data.size();i++){
            if(number.equals(data.get(i).getNumber())){
                return false;
            }
        }
        FruitItem fruitItem=new FruitItem(number,name,Double.parseDouble(price),unit);
        adminDao.addFruitItem(fruitItem);
        return true;
    }

    public boolean updateFruitItem(String number,String name,String price,String unit){
        ArrayList<FruitItem> data=queryFruitItem();
        for(int i=0;i<data.size();i++){
            FruitItem fruitItem=data.get(i);
            if(number.equals(fruitItem.getNumber())){
                adminDao.delFruitItem(number);
                adminDao.addFruitItem(new FruitItem(number,name,Double.parseDouble(price),unit));
                return true;
            }
        }
        return false;
    }


    public boolean delFruitItem(String number){
        ArrayList<FruitItem> data=queryFruitItem();
        for(int i=0;i<data.size();i++){
            FruitItem fruitItem=data.get(i);
            if(number.equals(fruitItem.getNumber())){
                adminDao.delFruitItem(number);
                return true;
            }
        }
        return false;
    }

}
