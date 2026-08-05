import java.util.Scanner;

public class LoginValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "Bhavani";

        String password = "Java123";

        System.out.print("Username : ");
        String user = sc.nextLine();

        System.out.print("Password : ");
        String pass = sc.nextLine();

        boolean login = username.equals(user) && password.equals(pass);

        System.out.println(login ? "Login Successful" : "Invalid Credentials");

        sc.close();

    }

}
