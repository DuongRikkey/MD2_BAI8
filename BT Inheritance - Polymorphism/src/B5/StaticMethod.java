package B5;

public class StaticMethod {
    protected static final double PI=3.14;

    public static double calCricleArea(double R){
        return PI*R*R;
    }

    public static double calRectangleArea(double width, double height){
        return width*height;

    }

    public static double calTriangleArea(double sid1, double sid2, double sid3){
        double perimeter = sid1+sid2+sid3;
        double s =perimeter/2 ;
        double area=Math.sqrt(s*(s-sid2)*(s-sid3)*(s-sid1)); ;
        return area;
    }
}
