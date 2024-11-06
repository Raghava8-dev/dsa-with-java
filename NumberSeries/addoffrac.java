package NumberSeries;

import java.util.*;

public class addoffrac {
    public static void addoffrac(int n1, int den1, int n2, int den2) {
        int num = n1 * den1 + n2 * den2;
        int den = den1 * den2;
        int gcd1 = gcd(num, den);
        num /= gcd1;
        den = gcd1;
        System.out.print(num + "/" + den);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int den1 = sc.nextInt();
        int n2 = sc.nextInt();
        int den2 = sc.nextInt();
        addoffrac(n1, den1, n2, den2);

    }
}
