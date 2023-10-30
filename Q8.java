import java.util.*;

class Calculation {
    private int resultArray[][] = new int[3][3];
    int i, j, n = 3;
    private int mat1[][] = new int[3][3];
    private int mat2[][] = new int[3][3];

    public void getInput(Scanner sc) {
        System.out.println("Enter the Elements of 1st Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Elements of 2nd Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
    }

    public void addition() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                resultArray[i][j] = mat1[i][j] + mat1[i][j];
            }

        }
    }

    public void subtraction() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                resultArray[i][j] = mat1[i][j] -  mat1[i][j];
            }

        }
    }

    public void multiplication() {
        int sum = 0,k;
        for (i = 0; i < 3; i++) 
        {
            for (j = 0; j < 3; j++) 
            {
                for (k = 0; k < 3; k++) 
                {
                sum += mat1[i][k] * mat2[k][j];
                }
                resultArray[i][j] = sum;
                sum =0;
            }
        }
    }

    public void printResult() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(resultArray[i][j]+ "\t");
            }
            System.out.print("\n");
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation cal = new Calculation();
        System.out.println("**********************Menu**********************");
        System.out.println("1. Addition\n2. Subtraction\n3. Multipliction");
        System.out.println("Enter the choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                cal.getInput(sc);
                cal.addition();
                System.out.println("The Resultant Matrix after Addition is : ");
                cal.printResult();
                break;
            case 2:
                cal.getInput(sc);
                cal.subtraction();
                System.out.println("The Resultant Matrix after Substraction is : ");
                cal.printResult();
                break;
            case 3:
                cal.getInput(sc);
                cal.multiplication();
                System.out.println("The Resultant Matrix after Multiplication is : ");
                cal.printResult();
                break;
            default:
                System.out.println("Ivalid Choice !!!  Try Again !!");
                break;
        }
    }
}
