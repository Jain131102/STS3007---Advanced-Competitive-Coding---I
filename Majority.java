import java.util.*;

class Majority {
    static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
            if (counts.get(num) > nums.length / 2) { 
                return num; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = majorityElement(arr);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("No Majority Element.");
        }
        sc.close();
    }
}
