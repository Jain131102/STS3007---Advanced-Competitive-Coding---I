import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < r - 2; i++)
            for (int j = 0; j < c - 2; j++) {
                int sum = a[i][j] + a[i][j + 1] + a[i][j + 2]
                        + a[i + 1][j + 1] +
                        a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];

                max = Math.max(max, sum);
            }

        System.out.println(max);

    }

}
