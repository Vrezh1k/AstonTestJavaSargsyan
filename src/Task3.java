
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printMultiplesOfThree(nums);
    }

    public static void printMultiplesOfThree(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (num % 3 == 0) {
                result.add(num);
            }
        }

        System.out.println(result);
    }
}