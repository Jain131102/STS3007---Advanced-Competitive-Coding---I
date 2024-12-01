import java.util.Scanner;
import java.util.TreeMap;

public class Palindrome1 {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (char c : str.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        // a=2 b=2 .... e=1

        String p = "", s = "", m = "";
        int oddStr = 0;
        for (char c : map.keySet()) {
            int n = map.get(c);
            for (int i = 0; i < n / 2; i++)
                p += c;

            if (n % 2 == 1) {
                oddStr++;
                m += c;
            }
        }
        if (oddStr > 1) {
            System.out.println("Can't form a palindomic string");
            return;
        }
        StringBuilder st = new StringBuilder();
        st.append(p);
        s = st.reverse().toString();

        System.out.println(p + m + s);

        sc.close();
    }
}
