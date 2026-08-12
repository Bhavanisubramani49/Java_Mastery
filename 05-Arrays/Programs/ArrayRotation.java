public class ArrayRotation {

    static void rotateRight(int[] numbers, int k) {

        int n = numbers.length;

        k = k % n;

        reverse(numbers, 0, n - 1);
        reverse(numbers, 0, k - 1);
        reverse(numbers, k, n - 1);
    }

    static void reverse(int[] numbers, int left, int right) {

        while (left < right) {

            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        int k = 3;

        rotateRight(numbers, k);

        System.out.print("Array after rotation: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
