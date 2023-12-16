package Application;

import Entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Products_Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products product = new Products();
        System.out.println("Enter Products data");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in Stock: ");
        product.quantity = sc.nextInt();

        System.out.println("");
        System.out.println("Product Data: " + product);

        System.out.println("");
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("");
        System.out.println("Updated Data: " + product);

        System.out.println("");
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);

        System.out.println("");
        System.out.println("Updated Data: " + product);

        sc.close();
    }
}
