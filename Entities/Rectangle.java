package Entities;

public class Rectangle {
    public double width;
    public double height;


    public double Area(){
        return width * height;
    }
    public double Perimeter(){
        return 2*(width+height);
    }
    public double Diagonal(){
        return Math.sqrt((Math.pow(width, 2)) + (Math.pow(height, 2)));
    }

    public String toString(){
        return ("Area of the Rectangle: " + String.format("%.2f", Area()) + " cm\n" +
                "Perimeter of the Rectangle: " + String.format("%.2f", Perimeter()) + " cm\n" +
                "Diagonal of the Rectangle: " + String.format("%.2f", Diagonal()) + " cm");
    }
}
