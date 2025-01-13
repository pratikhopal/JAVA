public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void displayproductInfo(){
        System.out.print("The product is "+ getName() + "\n" +
                         "The price of the product is "+ getPrice()+  "\n" +
                         "The quantity of the product is "+ getQuantity());
    }
}
