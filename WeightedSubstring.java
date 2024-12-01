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


// import java.util.*;
// 	class WeightedSubstring {
// 	static int distinctSubString(String P, String Q, int K, int N) {
// 	HashSet < String > S = new HashSet < String > ();
// 	for (int i = 0; i < N; ++i) {
// 	int sum = 0;
// 	String s = "";
// 	for (int j = i; j < N; ++j) {
// 	int pos = P.charAt(j) - 'a';
// 	sum += Q.charAt(pos) - '0';
// 	s += P.charAt(j);
// 	if (sum <= K) {
// 	S.add(s);}
// 	else {
// 	break;
// 	}
// 	}
// 	}
// 	return S.size();
// 	}
// 	public static void main(String[] args) {
// 	Scanner sc = new Scanner(System.in);
// 	String P = sc.nextLine();
// 	String Q = sc.nextLine();
// 	int K = sc.nextInt();
// 	int N = P.length();
// 	System.out.print(distinctSubString(P, Q, K, N));
// 	}
// 	}
