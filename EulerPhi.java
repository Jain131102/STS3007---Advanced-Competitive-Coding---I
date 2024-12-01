public class EulerPhi {
    public static int phi(int n) {
        int result = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                result /= i;
                result *= (i - 1);

                while (n % i == 0)
                    n /= i;

            }
        }
        if (n > 1) {
            result /= n;
            result *= (n - 1);
        }

        return result;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(phi(n));
    }
}
