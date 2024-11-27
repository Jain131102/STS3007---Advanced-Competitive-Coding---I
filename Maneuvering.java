import java.util.Scanner;

public class Maneuvering {

   static int numberOfPaths(int m, int n) {
      // Method 1
      if(m==1 || n==1)
      return 1;

      return numberOfPaths(m-1, n)+numberOfPaths(m, n-1);

      // Method 2
      // int dp[][] = new int[m][n];
      // for (int i = 0; i < m; i++)
      // for (int j = 0; j < n; j++)
      // dp[i][j] = 1;

      // for (int i = 1; i < m; i++)
      // for (int j = 1; j < n; j++)
      // dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

      // return dp[m - 1][n - 1];

      // Method 3
      // int dp[] = new int[n];
      // Arrays.fill(dp, 1);

      // for (int i = 1; i < m; i++)
      //    for (int j = 1; j < n; j++)
      //       dp[j] += dp[j - 1];

      // return dp[n - 1];

   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();
      sc.close();

      System.out.println(numberOfPaths(m, n));
   }
}
