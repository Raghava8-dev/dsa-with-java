package recursion;
import java.util.*;
public class ropecutting {
    public static int ropecut(int n,int a,int b,int c)
    {
        if(n==0)
        return 0;
        if(n<0)
        return -1;
        int res;
        res=Math.max(ropecut(n-a, a, b, c),Math.max(ropecut(n-b, a, b, c),ropecut(n-c, a, b, c)));
        if(res==-1)
        return -1;
        return res+1;

    }
    public static void main(String args[])
    {
        var sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(ropecut(n, a, b, c));

    }
}
