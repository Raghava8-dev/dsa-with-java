package NumberSeries;

import java.util.*;

public class nivennumber {
    public static boolean nivennumber(int num) {
        int sum = 0;
        int temp = num;
        while (temp != 0) {

            sum += temp % 10;
            temp = temp / 10;

        }

        return (num % sum == 0);
    }

    public static void main(String[] args) {
        int num = 18;
        System.out.println(nivennumber(num));
    }
}
