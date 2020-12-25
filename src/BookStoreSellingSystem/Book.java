package BookStoreSellingSystem;

public class Book {

    int id;
    String name;
    double price;
    int number;
    String publish;
    public Book(int id, String name, double price, int number, String publish){
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.publish = publish;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public String getPublish() {
        return publish;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return "Book's Id: " + id + "\n" +
                "Book's Name: " + name + "\n" +
                "Book's Price: " + price + "\n" +
                "Book's Number: " + number + "\n" +
                "Book's Publish: " + publish + "\n";
    }
}
