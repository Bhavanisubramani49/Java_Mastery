public class MaximumMethod {

    static int maximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {

        int result = maximum(25, 70, 45);

        System.out.println("Maximum = " + result);
    }
}
