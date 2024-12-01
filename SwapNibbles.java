import java.util.Scanner;

public class SwapNibbles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int a=N&15;
        a=a<<4;
        int b=N>>4;

        System.out.println(a|b);
    }
}
