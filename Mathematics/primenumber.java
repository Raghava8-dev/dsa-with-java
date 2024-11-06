package Mathematics;
import java.util.*;
public class primenumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n<=1)
        System.out.println("no");
        if(n==2)
        System.out.println("Yes");
        else if(n%2==0)
        System.out.println("No");
        for(int i=3;i<Math.sqrt(n);i+=2)
        {
            if(n%i==0)
            System.out.println("NO");
           
        }
        
        
    }
}
