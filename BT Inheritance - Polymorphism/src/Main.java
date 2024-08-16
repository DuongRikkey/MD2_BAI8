import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
          Cricle cricle = new Cricle();
          Cricle cylinder= new Cylinder();


          cricle.inputData(scanner);
          cylinder.inputData(scanner);

        System.out.println("Hình tròn");
        cricle.display();
        System.out.println("");
        System.out.println("Hình trụ");
        cylinder.display();


    }
}