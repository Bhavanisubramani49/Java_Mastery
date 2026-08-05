import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tamil mark : ");
        int tamil = sc.nextInt();

        System.out.print("Enter English mark : ");
        int english = sc.nextInt();

        System.out.print("Enter Maths mark : ");
        int maths = sc.nextInt();

        int total = tamil + english + maths;

        double average = total / 3.0;

        boolean pass = tamil >= 35 && english >= 35 && maths >= 35;

        System.out.println("\n RESULT ");
        System.out.println("Total    : " + total);
        System.out.println("Average  : " + average);
        System.out.println("Status   : " + (pass ? "PASS" : "FAIL"));

        sc.close();
    }
}
