package NumberSeries;

import java.util.*;

public class leapyear {
    public static int leapyear(int n) {
        if (n % 400 == 0 || n % 100 != 0 && n % 4 == 0)
            return 1;
        return 0;

    }

    public static void main(String args[]) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(leapyear(n));

    }
}
