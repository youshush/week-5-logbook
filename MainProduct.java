import java.util.ArrayList;

public class MainProduct {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>(); // creating array list (task2)
        
        Product p1 = new Product("Laptop", 2000.00 );//creating a product 
        Product p2 = new Product("Phone", 1000.00 );
        Product p3 = new Product("Tablet", 500.00 );


        products.add(p1); //adding it to the array list
        products.add(p2);
        products.add(p3);

        //prints all the products

        for (int i = 0 ; i < products.size(); i++) {
            products.get(i).print();
        }
        
    }
}