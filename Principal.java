import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite três numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int calculo = max(a, b, c);
        showResult(calculo);
        sc.close();
    }
    public static int max(int x, int y, int z){
        int aux;
        if(x>y && x>z){
            aux = x;
        }else if(y>z){
            aux = z;
        }else{
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value){
        System.out.println("Calculo = " + value);
    }
}
