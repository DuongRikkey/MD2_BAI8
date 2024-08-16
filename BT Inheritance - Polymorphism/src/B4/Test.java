package B4;

import java.awt.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1,side2,side3;


        System.out.println("Mời bạn nhập cạnh 1 ");
        side1 = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập cạnh 2");
        side2 = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập cạnh 3");
        side3 = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập màu săc");
        if(side1+side2>side3 && side1+side3>side2 && side2+side3>side1){

            Triangle triangle = new Triangle(side1, side2, side3);
            String color=sc.nextLine();
            triangle.setColor(color);
            System.out.println(triangle);
            System.out.println("chu vi"+triangle.getPerimeter());
            System.out.println("Dien tich"+triangle.getArea());

        }
        else {
            System.out.println("Ngu vcl");
        }


    }
}
