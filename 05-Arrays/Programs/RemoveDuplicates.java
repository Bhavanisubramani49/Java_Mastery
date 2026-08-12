import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    static int[] removeDuplicates(int[] numbers) {

        Set<Integer> unique = new LinkedHashSet<>();

        for (int number : numbers) {
            unique.add(number);
        }

        int[] result = new int[unique.size()];
        int index = 0;

        for (int number : unique) {
            result[index++] = number;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40, 30};

        int[] result = removeDuplicates(numbers);

        System.out.print("Array after removing duplicates: ");

        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}
