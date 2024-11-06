
package NumberSeries;

import java.util.*;

public class lcm {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF " + gcd(a, b));
        System.out.println("LCM " + lcm(a, b));
    }
}