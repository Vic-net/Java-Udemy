package Application;

import Entities.Products2;

import java.util.Locale;
import java.util.Scanner;

public class Products2_Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Products data");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Products2 product = new Products2(name, price);

        System.out.println("");
        System.out.println("Product Data: " + product);

        System.out.println("");
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts2(quantity);

        System.out.println("");
        System.out.println("Updated Data: " + product);

        System.out.println("");
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts2(quantity);

        System.out.println("");
        System.out.println("Updated Data: " + product);

        sc.close();
    }
}
