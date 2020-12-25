package BookStoreSellingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sale {

    public static void main(String[] args) {
        BookShop bookshop = new BookShop();
        List<SaleBook> saleBooks = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println(bookshop.booksInfor());
        while(true){
            System.out.println("Please input operation Code: 0-buy book   1-exist");
            int code = scan.nextInt();
            switch(code){
                case 0:
                    bookshop.saleBooks(saleBooks, scan);
                    break;
                case 1:
                    FileUtil.saveLog(saleBooks);
                    System.exit(0);
            }
        }
    }
}
