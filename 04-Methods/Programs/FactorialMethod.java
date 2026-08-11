public class FactorialMethod {

    static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        int number = 5;

        System.out.println("Factorial = " + factorial(number));
    }
}
