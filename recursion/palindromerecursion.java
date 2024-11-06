package recursion;
import java.util.*;

public class palindromerecursion {
    public static boolean palindromerecursion(String str,int start,int end)
    {
        if(start>=end)
        return true;
        return (str.charAt(start)==str.charAt(end)&&palindromerecursion(str, start+1, end-1));
        
    }
    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(palindromerecursion(s, 0, s.length()-1));
    }
}
