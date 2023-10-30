import java.util.Scanner;

class Student {
    private int rollNO;

    protected void putNO(int rollNO) {
        this.rollNO = rollNO;
    }

    protected void getRollNO() {
        System.out.println("Roll Number of the Student : " + rollNO);
    }
}

class Marks extends Student {
    private float marks;

    protected void putMarks(float marks) {
        this.marks = marks;
    }

    protected void getMarks() {
        System.out.println("Marks of the Student : " + marks);
    }
}

class Sports extends Marks {
    private float score;

    protected void putScore(float score) {
        this.score = score;
    }

    protected void getScore() {
        System.out.println("Socre of the Student : " + score);
    }

}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollNO;
        float marks, score;
        try {
            System.out.println("Enter The Roll No. of Student: ");
            rollNO = sc.nextInt();
            System.out.println("Enter The Marks of Student: ");
            marks = sc.nextFloat();
            System.out.println("Enter The Score(Sports) of Student: ");
            score = sc.nextFloat();
            sc.close();
            Sports s1 = new Sports();
            s1.putNO(rollNO);
            s1.putMarks(marks);
            s1.putScore(score);
            System.out.println("Information of the Student : ");
            s1.getRollNO();
            s1.getMarks();
            s1.getScore();
        } catch (Exception e) {
            System.out.println("Please Enter the valid Input!!!");
        }
    }
}
