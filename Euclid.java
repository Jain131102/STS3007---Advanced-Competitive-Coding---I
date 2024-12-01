import java.util.Scanner;

public class Euclid {

    static class triplet{
        int x,y,gcd;
    }

    public static triplet egcd(int a,int b)
    {   //ax+by=gcd(a,b)
        if(b==0)
        {
            triplet ans=new triplet();
            ans.x=1;
            ans.y=0;
            ans.gcd=a;
            return ans;
        }
        triplet smallAns=egcd(b,a%b);
        triplet ans=new triplet();
        ans.x=smallAns.y;
        ans.gcd=smallAns.gcd;
        ans.y=smallAns.x-(a/b)*smallAns.y;
        return ans;

    }
    public static int gcd(int a,int b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        triplet ans=egcd(a, b);
        System.out.println("x\ty\tgcd");
        System.out.println(ans.x+"\t"+ans.y+"\t"+ans.gcd);

        sc.close();
    }
}
