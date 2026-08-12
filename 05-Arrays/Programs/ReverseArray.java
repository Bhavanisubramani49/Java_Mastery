public class ReverseArray {

    static void reverse(int[] numbers) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        reverse(numbers);

        System.out.print("Reversed Array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
