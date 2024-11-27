import java.util.Scanner;
import java.util.TreeSet;

public class Permutations {

    static TreeSet<String> set = new TreeSet<String>();

    static void permute(char[] arr, int start, int end) {
        if (start == end) {
            set.add(String.valueOf(arr));
        } else {
            for (int i = start; i <= end; i++) {
                swap(arr, start, i);
                permute(arr, start + 1, end);
                swap(arr, start, i); // Backtracking
            }
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        permute(s.toCharArray(), 0, s.length() - 1);
        for (String ele : set) {
            System.out.println(ele);
        }
    }
}
