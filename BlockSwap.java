import java.util.Arrays;
import java.util.Scanner;

public class BlockSwap {
    public static void reverse(int arr[],int s,int e) {
        while(s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();
        k=k%arr.length;

        
        reverse(arr,0,k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr,0, arr.length-1);
        
        System.out.println(Arrays.toString(arr));

        sc.close();

    }
}
