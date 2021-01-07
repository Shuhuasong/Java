package Fruit_SuperMarket_Management_System.data;

import Fruit_SuperMarket_Management_System.domain.FruitItem;

import java.util.ArrayList;

public class DataBase {
    public static ArrayList<FruitItem> data = new ArrayList<>();
    static{
        data.add(new FruitItem("1", "Apple", 3.0, "pd"));
    }
}
