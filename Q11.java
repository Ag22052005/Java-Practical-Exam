import java.util.Scanner;

interface Shape {
    Scanner sc = new Scanner(System.in);
    public void area();
    public void perimeter();
}
class Rectangle implements Shape{
    Double length;
    Double breadth;
    public Rectangle()
    {
        System.out.println("Enter the lenght and Breadth of rectangle respectively :");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
    }
    public void area()
    {
        System.out.println("Area of rectangle is : " + (length*breadth));
    }
    public void perimeter()
    {
        System.out.println("Perimeter of rectangle is : " + (2*(length+breadth)));
    }
}
class Circle implements Shape{
    Double radius;
    public Circle()
    {
        System.out.println("Enter the Radius of Circle :");
        radius = sc.nextDouble();
    }
    public void area()
    {
        System.out.println("Area of Circle is : " + (Math.PI*radius*radius));
    }
    public void perimeter()
    {
        System.out.println("Perimeter of Circle is : " + (2*Math.PI*radius));
    }
}

public class Q11 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.area();
        rectangle.perimeter();
        Circle circle = new Circle();
        circle.area();
        circle.perimeter();
    }
}
