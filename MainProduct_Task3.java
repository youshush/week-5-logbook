import java.util.ArrayList;
import java.util.Scanner;

public class MainProduct_Task3 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>(); // creating array list 

        //making loop to input products from user
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Enter product name: ");
            String name = input.nextLine();

            System.out.println("Enter product price: ");
            double price = input.nextDouble();
            input.nextLine(); // clearing the buffer

            Product p = new Product(name, price); // creating product constructor
            products.add(p); //adding product to the array list
           

        }
        
    
            // prints the products
        for (int i = 0 ; i < products.size(); i++) {
            products.get(i).print();
        }

        input.close();
        
    }
}