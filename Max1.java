import java.util.Scanner;

public class Max1 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();

        int s=0,e=0,max=0;
        int zeros=0;

        while(e<n)
        {
            if(arr[e]==0)
            zeros++;

            if(zeros>k)
            {
                if(arr[s]==0)
                zeros--;

                s++;
            }

            max=Math.max(max,e-s+1);

            e++;
        }
        System.out.println(max);
    }
}
