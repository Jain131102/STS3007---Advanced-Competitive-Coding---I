import java.util.Scanner;
public class MoveHyphens {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     String ans="";

     int count=0;
     for(char c: str.toCharArray())
     {
        if(c=='-')
        {
            count++;
            continue;
        }
        else
        {
            ans+=c;
        }
     }
     while(count!=0)
     {
        ans="-"+ans;
        count--;
     }
     System.out.println(ans);
     sc.close();
    }
}
