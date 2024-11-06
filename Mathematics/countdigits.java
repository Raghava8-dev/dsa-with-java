package Mathematics;
import java.util.*;


public class countdigits {
    public static void main(String args[]){
        System.out.println("Enter the value:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        while(n>0)
        {
            n/=10;
            res=res+1;


        }
        System.out.println(res);
    
    }





    //it can also be done in other way
    
}
