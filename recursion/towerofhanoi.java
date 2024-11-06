package recursion;
import java.util.*;
public class towerofhanoi {
    public static void towerofhanoi(int n,char a,char b,char c)
    {
        if(n==1){
        System.out.println("Move 1 from "+ a +" to "+ c);
        return;
        }

        towerofhanoi(n-1,a,c,b);
        System.out.println("Move "+ n +" from "+a +" to "+c);
        towerofhanoi(n-1,b,a,c);

    }
    public static void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerofhanoi(n, 'a' ,'b','c');

    }
}
