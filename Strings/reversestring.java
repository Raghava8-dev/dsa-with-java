
import java.util.Scanner;

public class reversestring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        // String g="";
        // for(int i=n-1;i>=0;i--)
        // {
        // char c=s.charAt(i);
        // g=g+c;

        // }
        // System.out.print(g);
        StringBuilder st = new StringBuilder();
        st.append(s);
        st.reverse();
        System.out.print(st);

    }
}