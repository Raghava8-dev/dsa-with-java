package NumberSeries;

import java.util.*;

public class numberoffactors {
    public static int numberoffactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberoffactors(n));
    }
}
