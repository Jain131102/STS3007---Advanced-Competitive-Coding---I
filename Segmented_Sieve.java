import java.util.*;

class Segmented_Sieve {
    static int N = 1000000;
    static boolean arr[] = new boolean[N + 1];

    static void simpleSieve() {
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (arr[i]) {
                for (int j = i * i; j <= N; j += i) {
                    arr[j] = false;
                }
            }
        }
    }

    static ArrayList<Integer> generatePrimes(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                al.add(i);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        simpleSieve();
        ArrayList<Integer> primes = generatePrimes(high);
        boolean[] dummy = new boolean[high - low + 1];
        Arrays.fill(dummy, true);
        for (int prime : primes) {
            int firstMultiple = (low / prime) * prime;
            if (firstMultiple < low) {
                firstMultiple += prime;
            }
            for (int j = Math.max(firstMultiple, prime * prime); j <= high; j += prime) {
                dummy[j - low] = false;
            }
        }
        for (int i = low; i <= high; i++) {
            if (dummy[i - low] && i != 1) {
                System.out.print(i + " ");
            }
        }
    }
}
