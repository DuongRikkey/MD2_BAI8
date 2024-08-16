package B2;

public class TEST {
    public static void main(String[] args) {
        Point2D test=new Point2D(2.5F,35.5F);
        Point3D test2=new Point3D(5f,3f,4f);

        System.out.println("Point2D"+ test);
        System.out.println("Point3D"+ test.getX());
        System.out.println("Point3D"+ test.getY());

        test.setXY(2f,3f);
        System.out.println(test);

        //Test Point 3D
        System.out.println(test2);
        System.out.println(test2.getX());
        System.out.println(test2.getY());
        System.out.println(test2.getZ());
    }
}
