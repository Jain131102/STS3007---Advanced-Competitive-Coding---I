import java.util.HashMap;
import java.util.Scanner;

public class Strobogrammatic1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();

        HashMap<Character,Character> map=new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8', '8');
        map.put('9','6');

        int s=0,e=str.length()-1;
        while(s<=e)
        {
            char a=str.charAt(s);
            char b=str.charAt(e);

            if(map.containsKey(a) && map.containsKey(b))
            {
                if(map.get(a)==b || map.get(b)==a)
                {

                }
                else
                {
                    System.out.println("N");
                    return;
                }
            }
            else
            {
                System.out.println("N");
                return;   
            }
            s++;e--;
        }
        System.out.println("Y");

    }
}
