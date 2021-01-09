package Fruit_SuperMarket_Management_System.controller;

import Fruit_SuperMarket_Management_System.domain.FruitItem;
import Fruit_SuperMarket_Management_System.service.AdminService;
import Fruit_SuperMarket_Management_System.view.AbstractAdminDialog;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

public class AdminDialogController extends AbstractAdminDialog {
    private AdminService adminService=new AdminService();

    public AdminDialogController(){
        super();
    }

    public AdminDialogController(Frame owner ,boolean modal){
        super(owner,modal);
        queryFruitItem();
    }

    @Override
    public void queryFruitItem() {
        String[] head={"水果编号","水果名称","水果单价(元)","计价单位"};
        String[][] tbody=list2Array(adminService.queryFruitItem());
        TableModel model=new DefaultTableModel(tbody,head);
        table.setModel(model);
    }

    @Override
    public void addFruitItem() {
        String addNumber=addNumberText.getText();
        String addName=addNameText.getText();
        String addPrice=addPriceText.getText();
        String addUnit=addUnitText.getText();
        boolean addSuccess=adminService.addFruitItem(addNumber,addName,addPrice,addUnit);
        if(addSuccess){
            queryFruitItem();
        }else {
            JOptionPane.showMessageDialog(this,"水果编号重复，请检查数据！");
        }
    }


    @Override
    public void updateFruitItem() {
        boolean updateSuccess=adminService.updateFruitItem(
                updateNumberText.getText(),
                updateNameText.getText(),
                updatePriceText.getText(),
                updateUnitText.getText()
        );
        if(updateSuccess){
            queryFruitItem();
        }
        else {
            JOptionPane.showMessageDialog(this,"没有这个说过编号，请检查");
        }
    }


    @Override
    public void delFruitItem() {
        boolean delSuccess=adminService.delFruitItem(delNumberText.getText());
        if(delSuccess){
            queryFruitItem();
        }else {
            JOptionPane.showMessageDialog(this,"没有这个编号的水果，请检查数据！");
        }
    }


    private String[][] list2Array(ArrayList<FruitItem> list){
        String[][] tobody=new String[list.size()][4];
        for(int i=0;i<list.size();i++){
            FruitItem fruitItem=list.get(i);
            tobody[i][0]=fruitItem.getNumber();
            tobody[i][1]=fruitItem.getName();
            tobody[i][2]=fruitItem.getPrice()+"";
            tobody[i][3]=fruitItem.getUnit();
        }
        return tobody;
    }

}