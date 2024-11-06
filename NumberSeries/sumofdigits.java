package NumberSeries;

import java.util.*;

public class sumofdigits {
    public static int sumofdigits(int n) {
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int lastdigit = temp % 10;
            sum = sum + lastdigit;
            temp = temp / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofdigits(n));

    }
}
