public class MaximumElement {

    static int findMaximum(int[] numbers) {

        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        return maximum;
    }

    public static void main(String[] args) {

        int[] numbers = {25, 78, 12, 95, 43, 61};

        int maximum = findMaximum(numbers);

        System.out.println("Maximum Element = " + maximum);
    }
}
