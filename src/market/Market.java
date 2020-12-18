package market;

public class Market {
    private String name;
    private Product[] products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public Product sell(String productName){
        for(Product  product  : products){
            if(productName.equals(product.getName())){
                return product;
            }
        }
        return null;
    }
}
