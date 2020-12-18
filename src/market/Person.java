package market;

public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Product buy(Market market, String productName){
       return market.sell(productName);
    }
}
