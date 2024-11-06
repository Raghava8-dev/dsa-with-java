package Mathematics;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int rev=0;
       int temp=n;
       while(temp!=0)
       {
        int lastdigit=temp%10;
        rev=rev*10+lastdigit;
        temp=temp/10;
       }
       if(rev==n){
       System.out.println("Palindrome");
       }
       else{

       System.out.println("Not palindrome");
       }
}
}
