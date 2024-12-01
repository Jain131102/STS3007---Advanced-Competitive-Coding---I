import java.util.Scanner;

public class MaxE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
        }
        int p=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            p+=arr[i];
            if(s==p)
            {
                max=Math.max(max, s);
            }
            s-=arr[i];
        }
        if(max==Integer.MIN_VALUE)
        max=-1;
        System.out.println(max);
    }
}
