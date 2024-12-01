import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max=arr[n-1];
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(max);

        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                ans.add(max);
            }
        }
        Collections.sort(ans,Collections.reverseOrder());

        System.out.println(ans);
    }
}
