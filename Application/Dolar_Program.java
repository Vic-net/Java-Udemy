package Application;

import Entities.Dollar;

import java.util.Locale;
import java.util.Scanner;

public class Dolar_Program {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the Dollar price? " + Dollar.DOLLAR);
        System.out.print("How many dollars will be bought? ");
        double reais = sc.nextDouble();
        System.out.printf("Amount to be pair in Reais: %.2f%n", Dollar.DollarInReais(reais));
    }
}
