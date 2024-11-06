package NumberSeries;

import java.util.*;

public class reverseannum {
    public static int reverseannum(int n) {
        int temp = n;
        int sum = 0;

        while (temp != 0) {
            int lastdigit = temp % 10;
            sum = sum * 10 + lastdigit;
            temp = temp / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseannum(n));
    }
}
