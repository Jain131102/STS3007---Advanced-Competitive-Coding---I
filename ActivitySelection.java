import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        
        int start[]=new int[]{10,12,20};
        int end[]=new int[]{20,25,30};

        int n=start.length;

        ArrayList<Integer> ans=new ArrayList<>();

        int j=0;
        int i=1;
        ans.add(0);
        while(i<n)
        {
            if(start[i]>=end[j])
            {
                ans.add(i);
                j=i;
            }
            i++;
        }
        System.out.println(ans);
    }
}
