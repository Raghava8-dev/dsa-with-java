package NumberSeries;

import java.util.*;

public class replace0to5 {
    public static int reverse(int temp) {
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum * 10 + digit;
            temp = temp / 10;
        }
        return sum;
    }

    public static int replace0to5(int num) {
        if (num == 0)
            return 5;
        else {
            int temp = 0;
            while (num != 0) {

                int lastdigit = num % 10;
                if (lastdigit == 0)
                    lastdigit = 5;
                temp = temp * 10 + lastdigit;
                num = num / 10;
            }
            return reverse(temp);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(replace0to5(num));
    }
}
