import java.util.Scanner;

public class NumberClassifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive Number");

            if (num % 2 == 0)
                System.out.println("Even Number");
            else
                System.out.println("Odd Number");

        } else if (num < 0) {

            System.out.println("Negative Number");

        } else {

            System.out.println("Zero");

        }

        sc.close();
    }
}
