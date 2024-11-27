import java.util.Scanner;;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        int n = str.length();
        int dp[][] = new int[n][n];

        int max = 0;
        String ans = "";

        for (int diff = 0; diff < n; diff++) {
            for (int i = 0, j = diff + i; j < n; i++, j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (diff == 1) {
                    if (str.charAt(i) == str.charAt(j))
                        dp[i][j] = 2;
                    else
                        dp[i][j] = 0;
                } else {
                    if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1] > 0)
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                }

                if (dp[i][j] > 0 && j - i + 1 > max) {
                    max = j - i + 1;
                    ans = str.substring(i, j + 1);
                }
                
            }
        }


        System.out.println(ans);

    }
}
