package recursion;
import java.util.*;

public class josephus {
    public static int josephus(int n,int k)
    {
        if(n==1)
        return 0;
        return (josephus(n-1,k)+k)%n;

    }
    public static void main(String ...args){
        System.out.println(josephus(7, 3));
    }
}
