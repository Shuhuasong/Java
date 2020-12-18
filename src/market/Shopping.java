package market;

public class Shopping {

    public static void main(String[] args) {
        Product apple = new Product();
        apple.setName("apple");
        Product orange = new Product();
        orange.setName("orange");
        Product juice = new Product();
        juice.setName("juice");

        Market market = new Market();
        market.setName("808 Supermarket");
        market.setProducts(new Product[]{apple, orange, juice});

        Person mike = new Person();
        mike.setName("Mike");
        String productName = "apple22";

        Product product = mike.buy(market, productName);

        if(product==null){
            System.out.println(mike.getName() + " can't buy " + productName);
        }else{
            System.out.println(mike.getName() + " buys a " + productName);
        }
    }
}
