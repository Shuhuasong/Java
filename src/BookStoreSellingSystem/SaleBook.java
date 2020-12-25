package BookStoreSellingSystem;

public class SaleBook extends Book {

    private double totalPrice;
    private int saleNum;

    public SaleBook(Book book, double totalPrice, int saleNum){
        super(book.getId(), book.getName(), book.getPrice(), book.getNumber(), book.getPublish());
        this.totalPrice = totalPrice;
        this.saleNum = saleNum;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Books' total price: " + totalPrice + "\n" +
                " Books selling amount: " + saleNum;
    }
}
