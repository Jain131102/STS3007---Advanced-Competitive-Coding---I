import java.util.Arrays;
import java.util.Scanner;

public class Combinations {

    private static void combine(int[] nums, int count, int size, int start, String comb) {
        if (count == size) {
            System.out.println(comb);
        } else {
            for (int i = start; i < nums.length; i++) {
                combine(nums, count + 1, size, i + 1, comb + nums[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        Arrays.sort(nums); 
        int k = input.nextInt();
        input.close();

        combine(nums, 0, k, 0, "");
    }
}
