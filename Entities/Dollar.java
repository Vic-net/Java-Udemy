package Entities;
public class Dollar {
    public static final double DOLLAR = 3.10;
    public static final double IOF = 6.00;

    public static double DollarInReais(double reais){
        return reais * (DOLLAR*(1+(IOF/100)));
    }
}
