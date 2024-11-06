
package NumberConversions;

import java.util.*;

public class binarytodecimal {
    public static int binarytodecimal(int n) {
        int num = n;
        int deci = 0;
        int base = 1;
        while (num != 0) {
            int lastdigit = num % 10;
            num = num / 10;
            deci = deci + lastdigit * base;
            base *= 2;

        }
        return deci;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(binarytodecimal(num));
    }
}
