import java.util.ArrayList;
import java.util.Scanner;

public class Strobogrammatic2 {
    public static ArrayList<String> StrobogrammaticNum(int n)
    {
        ArrayList<String> result=numDef(n,n);
        return result;
    }
    public static ArrayList<String> numDef(int n,int l)
    {
        if(n==0)
        {
            ArrayList<String> result=new ArrayList<>();
            result.add("");
            return result;
        }
        else if(n==1)
        {
            ArrayList<String> result=new ArrayList<>();
            result.add("0");
            result.add("1");
            result.add("8");
            return result;
        }

        ArrayList<String> middles=numDef(n-2, l);
        ArrayList<String> res=new ArrayList<>();
        for(String middle:middles)
        {
            if(n!=l)
            res.add("0"+middle+"0");
            res.add("1"+middle+"1");
            res.add("6"+middle+"9");
            res.add("8"+middle+"8");
            res.add("9"+middle+"6");
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> answer=StrobogrammaticNum(n);
        sc.close();
        System.out.println(answer);
    }
}
