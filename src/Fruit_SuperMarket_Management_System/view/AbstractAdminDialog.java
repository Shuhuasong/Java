package Fruit_SuperMarket_Management_System.view;

import Fruit_SuperMarket_Management_System.tools.GUITools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AbstractAdminDialog extends JDialog {
   private JLabel tableLabel = new JLabel("Fruit List");
   private JScrollPane tablePanel = new JScrollPane();
   protected JTable table = new JTable();
    private JLabel numberLabel=new JLabel("水果编号");
    private JLabel nameLabel=new JLabel("水果名称");
    private JLabel priceLabel=new JLabel("水果单价");
    private JLabel unitLabel=new JLabel("计价单位");

   //Add Operation Component
    protected JTextField addNumberText = new JTextField(6);
    protected JTextField addNameText = new JTextField(6);
    protected JTextField addPriceText = new JTextField(6);
    protected JTextField addUnitText = new JTextField(6);
    private JButton addBtn = new JButton("Add Fruit");

    //Update Operation Component
    protected JTextField updateNumberText = new JTextField(6);
    protected JTextField updateNameText = new JTextField(6);
    protected JTextField updatePriceText = new JTextField(6);
    protected JTextField updateUnitText = new JTextField(6);
    private JButton updateBtn = new JButton("Update Fruit");

    //Delete Operation Component
    protected JTextField delNumberText = new JTextField(6);
    private JButton delBtn = new JButton("Delete Fruit");

    public AbstractAdminDialog(){ this(null, true); }

    public AbstractAdminDialog(Frame owner, boolean modal) {
        super(owner, modal);
        this.init();
        this.addComponent();
        this.addListener();
    }

    private void init(){
        this.setTitle("Supermarket Goods Management");
        this.setSize(600, 400);
        GUITools.center(this);
        this.setResizable(false);
    }

    //Add Component
    private void addComponent(){
        this.setLayout(null);
        tableLabel.setBounds(265, 20, 70, 25);
        this.add(tableLabel);

        //Form
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        table.setEnabled(false);
        tablePanel.setBounds(50, 50, 500, 200);
        tablePanel.setViewportView(table);
        this.add(tablePanel);

        //Title
        numberLabel.setBounds(50, 250, 70, 25);
        nameLabel.setBounds(150, 250, 70, 25);
        priceLabel.setBounds(250, 250, 70, 25);
        unitLabel.setBounds(350, 250, 70, 25);
        this.add(numberLabel);
        this.add(nameLabel);
        this.add(priceLabel);
        this.add(unitLabel);

        //Adding Component
        addNumberText.setBounds(50, 280, 80, 25);
        addNameText.setBounds(150, 280, 80, 25);
        addPriceText.setBounds(250, 280, 80, 25);
        addUnitText.setBounds(350, 280, 80, 25);
        this.add(addNumberText);
        this.add(addNameText);
        this.add(addPriceText);
        this.add(addUnitText);
        addBtn.setBounds(460, 280, 90, 25);
        this.add(addBtn);

        //Update Component
        updateNumberText.setBounds(50, 310, 80, 25);
        updateNameText.setBounds(150, 310, 80, 25);
        updatePriceText.setBounds(250, 310, 80, 25);
        updateUnitText.setBounds(350, 310, 80, 25);
        this.add(updateNumberText);
        this.add(updateNameText);
        this.add(updatePriceText);
        this.add(updateUnitText);
        updateBtn.setBounds(460, 310, 90, 25);
        this.add(updateBtn);

        //Delete Component
        delNumberText.setBounds(50, 340, 80, 25);
        this.add(delNumberText);
        delBtn.setBounds(460, 340, 90, 25);
        this.add(delBtn);
    }

    private void addListener(){
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addFruitItem();
            }
        });
        updateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFruitItem();
            }
        });
        delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delFruitItem();
            }
        });
    }

    public abstract void queryFruitItem();
    public abstract void addFruitItem();
    public abstract void updateFruitItem();
    public abstract void delFruitItem();
}
