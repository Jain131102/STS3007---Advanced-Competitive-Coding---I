import java.util.*;

public class Binary_Palindrome {
    public static boolean isBinaryPalindrome(int num) {
        int revBinary = 0;
        int copyNum = num;
        while (copyNum != 0) {
            revBinary = (revBinary << 1) | (copyNum & 1);
            copyNum >>= 1;
        }
        return revBinary == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isBinaryPalindrome(num));
    }
}
