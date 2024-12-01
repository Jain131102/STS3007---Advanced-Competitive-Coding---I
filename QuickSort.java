/**
 * QuickSort
 */
import java.util.*;;
public class QuickSort {

    public static int pvt(int arr[],int low,int high)
    {
        int pvt=arr[low];
        int i=low,j=high;
        while(i<j)
        {
            while(arr[i]<=pvt && i<=high-1)
            i++;
            while(arr[j]>pvt && j>=low+1)
            j--;

            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
    public static void qs(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pvt=pvt(arr, low, high);
            qs(arr, low, pvt-1);
            qs(arr, pvt+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        qs(arr, 0, arr.length-1); 
        System.out.println(Arrays.toString(arr)); 
        sc.close();
    }
}
