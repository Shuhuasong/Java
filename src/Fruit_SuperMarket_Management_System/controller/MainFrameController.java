package Fruit_SuperMarket_Management_System.controller;

import Fruit_SuperMarket_Management_System.view.AbstractMainFrame;

   public class MainFrameController extends AbstractMainFrame {


       @Override
       public void showAdminDialog() {
            new AdminDialogController(this, true).setVisible(true);
       }
   }
