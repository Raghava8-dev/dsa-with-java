package NumberSeries;

import java.util.*;

public class sumofgp {
    public static int sumofgp(int n, int a, int r) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a;
            a = a * r;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int r = sc.nextInt();
        System.out.print(sumofgp(n, a, r));
    }
}
