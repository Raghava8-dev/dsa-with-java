package recursion;
import java.util.*;
public class sumofnaturalnumbers {
    public static int sumofnaturalnumbers(int n)
    {
        if(n==0)
        return 0;
        return  n+sumofnaturalnumbers(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofnaturalnumbers(n));
    }
}
