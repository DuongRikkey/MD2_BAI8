import java.awt.*;
import java.util.Scanner;

public class Cylinder extends Cricle {
    protected double height;
    public Cylinder() {}

    public Cylinder(int radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getClydier() {
        return getAREA()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + super.toString() +
                '}';
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Chieu cao"+height);
        System.out.println("Cylinder Height: " + getHeight());
    }

    @Override
    public void inputData(Scanner scanner) {
        super.inputData(scanner);
        System.out.println("Mời nhập chiều cao");
        height = scanner.nextDouble();

    }
}
