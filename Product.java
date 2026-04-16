public class Product {

    String name; // making the variables
    double price;

    public Product(String name, double price) { // constructor 
        this.name = name;
        this.price = price;

    }

    public void print() {
        System.out.println("name: " + name);
        System.out.println("price: " + price);
    }
   
   
}