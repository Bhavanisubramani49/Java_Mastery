public class SecondLargest {

    static int findSecondLargest(int[] numbers) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] numbers = {25, 78, 12, 95, 43, 61};

        int result = findSecondLargest(numbers);

        System.out.println("Second Largest Element = " + result);
    }
}
