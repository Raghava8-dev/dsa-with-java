package NumberSeries;

import java.util.*;

public class SumofAPseries {
    // public static int SumofAPseries(int n,int a,int d)
    // {
    // int sum=0;
    // for(int i=0;i<n;i++)
    // {
    // sum=sum+a;
    // a=a+d;
    // }
    // return sum;

    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a;
            a = a + d;
        }
        System.out.println(sum);

    }
}
