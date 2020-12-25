package BookStoreSellingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookShop {

    private List<Book> books;
    public BookShop(){
        books = new ArrayList<>();
        Book book1 = new Book(101, "Java Basic", 11, 200, "Republic Post Office");
        Book book2=  new Book(102, "Python Basic", 12.5, 100, "New York Post Office");
        Book book3 = new Book(103, "Big Data", 60.5, 600, "Xinhua Publish");

        books.add(book1);
        books.add(book2);
        books.add(book3);
    }

    public void saleBooks(List<SaleBook> saleBooks, Scanner scan){
        System.out.println("Please input the Book's IDe:");
        Book book = this.getById(scan.nextInt());
        if(book==null){
            System.out.println("The book is not exist");
            return;
        }
        System.out.println("Please input the amount: ");
        int number = scan.nextInt();
        if(book.getNumber() < number){
            System.out.println("The minimum number is: " + book.getNumber());
            return;
        }
        book.setNumber(book.getNumber()-number);
        saleBooks.add(new SaleBook(book, number * book.getPrice(), number));
    }

    public Book getById(int id){
        for(Book book : books){
            if(id==book.getId()){
                return book;
            }
        }
        return null;
    }

    public String booksInfor(){
        return books.toString();
    }
}
