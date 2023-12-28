package Application;

import Entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Rectangle_Program {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();

        System.out.println("Data of the Rectangle");
        System.out.print("Enter the width of the Rectangle: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Enter the height of the Rectangle: ");
        rectangle.height = sc.nextDouble();

        System.out.println("");
        System.out.println(rectangle);

        sc.close();
    }
}
