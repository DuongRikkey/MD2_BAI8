import java.util.Scanner;

public class Cricle {
    protected double radius;
    protected String color;


    public Cricle() {
    }

    public Cricle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getAREA(){
        return Math.PI*Math.pow(radius,2);
    }


    public void inputData(Scanner scanner){
        System.out.print("Radius: ");
        radius = scanner.nextInt();
        System.out.print("Color: ");
        color = scanner.next();
        System.out.println("Area: " + getAREA());

    }
    public void display(){
        System.out.println("Bán kính là");
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}




