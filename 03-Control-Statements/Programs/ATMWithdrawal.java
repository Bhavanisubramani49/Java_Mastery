import java.util.Scanner;

public class ATMWithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 15000;

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance)
            System.out.println("Transaction Successful");
        else
            System.out.println("Insufficient Balance");

        sc.close();
    }
}
