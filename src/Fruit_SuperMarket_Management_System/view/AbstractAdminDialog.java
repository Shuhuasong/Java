package Fruit_SuperMarket_Management_System.view;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractAdminDialog extends JDialog {
   private JLabel tableLabel = new JLabel("Fruit List");
   private JScrollPane tablePanel = new JScrollPane();
   protected JTable table = new JTable();
   private JLabel numberLabel = new JLabel("Fruit ID");
   private JLabel nameLabel = new JLabel("Fruit Name");
   private JLabel priceLabel = new JLabel("Fruit Price");
   private JLabel unitLabel = new JLabel("Unit");

   //Add Operation Component
    protected JTextField addNumberText = new JTextField(6);
    protected JTextField addNameText = new JTextField(6);
    protected JTextField addpriceText = new JTextField(6);
    protected JTextField addUnitText = new JTextField(6);
    private JButton addBtn = new JButton("Add Fruit");

    //Modify Operation Component
    protected JTextField updateNumberText = new JTextField(6);
    protected JTextField updateNameText = new JTextField(6);
    protected JTextField updatepriceText = new JTextField(6);
    protected JTextField updateUnitText = new JTextField(6);
    private JButton addBtn = new JButton("Modify Fruit");

    //Delete Operation Component
    protected JTextField delNumberText = new JTextField(6);
    private JButton delBtn = new JButton("Delete Fruit");

    public AbstractAdminDialog(){ this(null, true); }

    public AbstractAdminDialog(Frame owner, boolean modal) {
    }
}
