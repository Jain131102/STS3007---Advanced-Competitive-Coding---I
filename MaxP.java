import java.util.Scanner;

public class MaxP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int p=1,s=1,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) // left to right
        {
            p*=arr[i];
            s*=arr[n-i-1];
            
            if(p==0)
            p=1;
            if(s==0)
            s=1;

            max=Math.max(max,Math.max(p, s));
        }
        System.out.println(max);

        sc.close();

    }
}
