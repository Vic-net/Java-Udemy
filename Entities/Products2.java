package Entities;
public class Products2 {
    public String name;
    public double price;
    public int quantity;

    public Products2(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Products2(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double totalValueInStock2(){
        return price * quantity;
    }
    public void addProducts2(int quantity){
        this.quantity += quantity;
    }
    public void RemoveProducts2(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return (name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: " + String.format("%.2f", totalValueInStock2()));
    }
}
