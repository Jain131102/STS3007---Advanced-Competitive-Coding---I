import java.util.Scanner;

/**
 * Karatsuba
 */
public class Karatsuba {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();

        System.out.println(karatsuba(a,b));
    }

    public static long karatsuba(long x ,long y) {
        if(x<10||y<10)
        return x*y;

        int m=Math.max((""+x).length(),(""+y).length());
        long powOf10=(long)Math.pow(10,m/2);
        long a=x/powOf10;
        long b=x%powOf10;
        long c=y/powOf10;
        long d=y%powOf10;
        long ac=karatsuba(a,c);
        long bd=karatsuba(b,d);
        long abcd=karatsuba(a+b,c+d);

        long res=ac*(long)Math.pow(10,m)+(abcd-ac-bd)*powOf10+bd;
        return res;
    }
}
