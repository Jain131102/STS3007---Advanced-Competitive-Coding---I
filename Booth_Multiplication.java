import java.util.*;

public class Booth_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = 0;
        int n = Integer.toBinaryString(a).length();
        for (int i = 0; i < n; i++) {
            int currentBit = (a & 1);
            if (currentBit == 1) {
                product += b;
            }
            b <<= 1;
            a >>= 1;
        }
        System.out.println("Result: " + product);
    }
}
