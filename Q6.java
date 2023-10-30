import java.util.Scanner;
class PrintArea{
    protected Double area;
    public void claculateArea(Double length, Double breadth)
    {
        this.area = length*breadth; 

    }
    public void claculateArea(Double sideOfSuare)
    {
        this.area = sideOfSuare*sideOfSuare; 
    }
    public void printArea()
    {
        System.out.println("Area : " + area);
    }
}
public class Q6 {
    public static void main(String[] args) {
        Double length,breadth;
        Scanner sc = new Scanner(System.in);
        PrintArea rect = new PrintArea();
        PrintArea square = new PrintArea();
        System.out.println("Enter the Length And Breadth of Rectangle ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        rect.claculateArea(length,breadth);
        rect.printArea();
        System.out.println("Enter the side of the Square ");
        length = sc.nextDouble();
        square.claculateArea(length);
        square.printArea();
        sc.close();
    }
}
