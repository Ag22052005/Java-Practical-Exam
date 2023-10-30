import java.util.Scanner;

class Shape{
    public Double getPerimeter()
    {
        return 0.0;
    }
    public Double getArea()
    {
        return 0.0;
    }
}
class Circle extends Shape{

    double radius;
    public Double getPerimeter()
    {

        return (Math.PI*2*radius);
    }
    public Double getArea()
    {  
        return (Math.PI*radius*radius);
    }
}
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("Enter the Radius of Circle: ");
        c.radius = sc.nextDouble();
        sc.close();
        System.out.println("Area of Circle : " + c.getArea());
        System.out.println("Area of Circle : " + c.getPerimeter());
    }
}
