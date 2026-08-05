import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age : ");

        int age = sc.nextInt();

        System.out.println(age >= 18 ? "Eligible to Vote" : "Not Eligible");

        sc.close();

    }

}
