public class MethodOverloading {

    static int calculate(int a, int b) {
        return a + b;
    }

    static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    static double calculate(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Two integers   : " + calculate(10, 20));
        System.out.println("Three integers : " + calculate(10, 20, 30));
        System.out.println("Two doubles    : " + calculate(10.5, 20.5));
    }
}
