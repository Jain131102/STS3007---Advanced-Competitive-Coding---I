import java.util.*;

public class Incremental_Sieve {
    public static List<Integer> incrementalSieve(int limit) {
        List<Integer> oddNumber = new ArrayList<>();
        for (int i = 3; i <= limit; i += 2) {
            oddNumber.add(i);
        }
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int i = 0; i < oddNumber.size(); i++) {
            int current = oddNumber.get(i);
            if (current != -1) {
                primes.add(current);
                for (int j = i; j < oddNumber.size(); j++) {
                    if (oddNumber.get(j) % current == 0) {
                        oddNumber.set(j, -1);
                    }
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> primes = incrementalSieve(n);
        System.out.println("Prime numbers up to " + n + ": " + primes);
    }
}
