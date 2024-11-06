package NumberSeries;

import java.util.*;

public class largeprimefactor {
    public static int largeprimefactor(int n) {
        int max = -1;
        while (n % 2 == 0) {
            max = 2;
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0)
                max = i;
            n /= i;
        }
        if (n > 2)
            max = n;
        return max;

    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((largeprimefactor(n)));

    }
}
