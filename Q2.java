import java.util.Scanner;
class Area{
    private Double length;
    private Double breadth;
    public Area(Double length, Double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    protected Double returnArea()
    {
        return (length*breadth);
    }
}
public class Q2 {
    public static void main(String[] args) {
        try
        {
        Double length, breadth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length And Breadth of a rectangle respectively: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        sc.close();
        Area rectangle = new Area(length,breadth);
        System.out.println("Area of the reactangle of Length And Breadth  " +length + " & "+ breadth+"  respectively is : " + rectangle.returnArea());
        }
        catch(Exception e)
        {
            System.out.println("Ivalid Input !!!! Please Enter A valid Lenth And Breadth");
        }
    }
}
