import java.util.HashSet;
import java.util.Scanner;
public class WeightedSubstring {
    public static int help(int k,String str){

        int n=str.length();

        int sum=0;

        int s=0,e=0;

        HashSet<String> ans=new HashSet<>();
        while(e<n)
        {
            sum+=(int)(str.charAt(e)-'a')+1;
            if(sum==k)
            ans.add(str.substring(s,e+1)); 

            while(sum>k)
            {
                sum-=((int)(str.charAt(s)-'a')+1);
                s++;

                if(sum==k)
                ans.add(str.substring(s,e+1));
            }
            

            e++;
        }
        return ans.size();
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int ans[]=new int[T];
        for(int i=0;i<T;i++)
        {
            int k=sc.nextInt();
            String str=sc.next();

            ans[i]=help(k,str);
        }
        for(int i=0;i<T;i++)
        System.out.println(ans[i]);
        sc.close();
    }
}
