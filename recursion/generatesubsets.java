package recursion;

import java.util.*;

public class generatesubsets {

    public static void generatesubset(String s,String curr,int i)
    {
        if(i==s.length()){
        System.out.println(curr);
        return;
        }
        generatesubset(s, curr, i+1);
        generatesubset(s, curr+s.charAt(i), i+1);
    }
    public static void main(String args[])
    {
        var sc=new Scanner(System.in);
        String s=sc.nextLine();
        //String curr=sc.nextLine();
        int i=sc.nextInt();
        generatesubset(s, " ", i);

    }
}
