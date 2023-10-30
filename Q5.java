class Rectangle{
    private Double length;
    private Double breadth;
    public Rectangle()
    {
        this.length = 0.0;
        this.breadth = 0.0;
    }
    public Rectangle(Double length)
    {
        this.length = length;
        this.breadth = length;
    }
    public Rectangle(Double length,Double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public void calculateArea()
    {
        System.out.println("Area : "+ (length*breadth)+ " Square Units ");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.calculateArea();
        Rectangle rect2 = new Rectangle(5.0);
        rect2.calculateArea();
        Rectangle rect3 = new Rectangle(5.0,10.0);
        rect3.calculateArea();
    }
}
