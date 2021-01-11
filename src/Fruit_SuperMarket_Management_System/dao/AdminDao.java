package Fruit_SuperMarket_Management_System.dao;

import Fruit_SuperMarket_Management_System.data.DataBase;
import Fruit_SuperMarket_Management_System.domain.FruitItem;

import java.util.ArrayList;

public class AdminDao {

    public ArrayList<FruitItem> queryAllData(){

        return DataBase.data;
    }

    public void addFruitItem(FruitItem fruitItem){

        DataBase.data.add(fruitItem);
    }

    public void delFruitItem(String delNumber){
        for(int i=0; i<DataBase.data.size(); i++){
            FruitItem fruitItem = DataBase.data.get(i);
            if(fruitItem.getNumber().equals(delNumber)){
                DataBase.data.remove(i);
            }
        }
    }
}
